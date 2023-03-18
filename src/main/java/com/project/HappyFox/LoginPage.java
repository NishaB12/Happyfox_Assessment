package com.project.HappyFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}

	public WebElement getTickets() {
		return tickets;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getNewstatus() {
		return newstatus;
	}

	public WebElement getStatusname() {
		return statusname;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getAddstatus() {
		return add;
	}

	public WebElement getPriorities() {
		return priorities;
	}

	public WebElement getAddpriority() {
		return addpriority;
	}

	public WebElement getPriorityname() {
		return priorityname;
	}

	public WebElement getPrioritydes() {
		return prioritydes;
	}

	public WebElement getAddit() {
		return addit;
	}

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(id = "btn-submit")
	private WebElement lgnbtn;

	@FindBy(xpath = "//div[@data-test-id='module-switcher_trigger']")
	private WebElement tickets;

	@FindBy(xpath = "//a[text()='Statuses']")
	private WebElement status;

	@FindBy(xpath = "//button[@data-test-id='new-status']")
	private WebElement newstatus;

	@FindBy(xpath = "//input[@aria-label='Status Name']")
	private WebElement statusname;

	@FindBy(xpath = "//textarea[@aria-label='Description']")
	private WebElement description;

	@FindBy(xpath = "//button[text()='Add Status']")
	private WebElement add;

	@FindBy(xpath = "//a[text()='Priorities']")
	private WebElement priorities;

	@FindBy(xpath = "//button[@data-test-id='new-priority']")
	private WebElement addpriority;

	@FindBy(xpath = "//input[@aria-label='Priority Name']")
	private WebElement priorityname;

	@FindBy(xpath = "//textarea[@aria-label='Description']")
	private WebElement prioritydes;

	@FindBy(xpath = "//button[text()='Add Priority']")
	private WebElement addit;

}
