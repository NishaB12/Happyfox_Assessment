package com.project.HappyFox;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import com.project.HappyFox.Sdp;
import com.project.HappyFox.Helper;
import com.project.HappyFox.Reader;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner_Class {

	private WebDriver driver;
	private Sdp sdp = null;

	@BeforeClass
	public void browserSetup() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Cynthia\\eclipse-workspace\\Selenium_Class\\Chrome2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://interview3.supporthive.com/staff/");
		sdp = new Sdp(driver);
	}

	@Test

	public void loginPage() throws Exception {
		try {

			sdp.getLoginPage().getUsername().sendKeys(Helper.getInstance().getUsername());
			sdp.getLoginPage().getPassword().sendKeys(Helper.getInstance().getPassword());
			sdp.getLoginPage().getLgnbtn().click();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		} catch (Exception e) {

		}

		sdp.getLoginPage().getTickets().click();
		Thread.sleep(3000);

		sdp.getLoginPage().getStatus().click();
		sdp.getLoginPage().getNewstatus().click();
		sdp.getLoginPage().getStatusname().sendKeys(Helper.getInstance().getStatusname());
		sdp.getLoginPage().getDescription().sendKeys(Helper.getInstance().getDescription());
		sdp.getLoginPage().getAddstatus().click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		sdp.getLoginPage().getTickets().click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Priorities']")));
		sdp.getLoginPage().getPriorities().click();
		sdp.getLoginPage().getAddpriority().click();
		sdp.getLoginPage().getPriorityname().sendKeys(Helper.getInstance().getPriorityname());
		sdp.getLoginPage().getPrioritydes().sendKeys(Helper.getInstance().getPrioritydes());
		sdp.getLoginPage().getAddit().click();

	}

	@Test  (enabled = false)
	public void homePage() throws Exception {

		driver.navigate().to("https://interview3.supporthive.com/new/");
		sdp.getHomePage().getSub().sendKeys(Helper.getInstance().getSubject());
		sdp.getHomePage().getText().sendKeys(Helper.getInstance().getText());
		sdp.getHomePage().getCustomer().sendKeys(Helper.getInstance().getCustomer());
		sdp.getHomePage().getMail().sendKeys(Helper.getInstance().getMail());
		sdp.getHomePage().getPhone().sendKeys(Helper.getInstance().getPhone());
		Thread.sleep(3000);
		sdp.getHomePage().getSubmit().click();
		Thread.sleep(20000);
		String confirm = driver.findElement(By.xpath("//div[text()='Welcome to our Support Center']")).getText();
		System.out.println(confirm);

		Thread.sleep(3000);
		driver.navigate().to("https://interview3.supporthive.com/staff/tickets/?status=_pending");
		driver.navigate().refresh();
		sdp.getHomePage().getCheck().click();
		sdp.getHomePage().getFind().click();
		Thread.sleep(3000);
		sdp.getHomePage().getReply().click();
		sdp.getHomePage().getCanned().click();
		sdp.getHomePage().getQuery().click();
		sdp.getHomePage().getApply().click();

	}

	@Test(dependsOnMethods = "loginPage")
	public void supportCentre() throws Exception {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		sdp.getLoginPage().getTickets().click();
		Thread.sleep(3000);
		sdp.getLoginPage().getStatus().click();
		Thread.sleep(5000);
		sdp.getSupportCentrePage().getDelete().click();
		sdp.getSupportCentrePage().getToken().click();
		sdp.getSupportCentrePage().getDelbtn().click();
		Thread.sleep(5000);
		sdp.getLoginPage().getTickets().click();
		sdp.getLoginPage().getPriorities().click();
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Priorities']")));
		sdp.getSupportCentrePage().getDelete1().click();
		sdp.getSupportCentrePage().getToken1().click();
		sdp.getSupportCentrePage().getDelbtn1().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Logged-In Agent']")));
		sdp.getSupportCentrePage().getagentlog().click();
		sdp.getSupportCentrePage().getLogout().click();

	}

	@AfterClass
	private void tearDown() {
		driver.quit();
	}
}
