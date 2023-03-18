package com.project.HappyFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportCentrePage {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public SupportCentrePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getDelete1() {
		return delete1;
	}

	public WebElement getToken1() {
		return token1;
	}

	public WebElement getDelbtn1() {
		return delbtn1;
	}

	public WebElement getToken() {
		return token;
	}

	public WebElement getDelbtn() {
		return delbtn;
	}

	public WebElement getagentlog() {
		return agentlog;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getDelete() {
		return delete;
	}

	@FindBy(xpath = "//span[text()='Assistance required']")
	private WebElement delete1;

	@FindBy(xpath = "//a[text()='Delete']")
	private WebElement token1;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement delbtn1;

	@FindBy(xpath = "//img[@alt='Logged-In Agent']")
	private WebElement agentlog;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	@FindBy(xpath = "//div[text()='Issue created']")
	private WebElement delete;

	@FindBy(xpath = "//a[text()='Delete']")
	private WebElement token;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement delbtn;

}
