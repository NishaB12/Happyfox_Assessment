package com.project.HappyFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getReply() {
		return reply;
	}

	public WebElement getCanned() {
		return canned;
	}

	public WebElement getQuery() {
		return query;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getSub() {
		return sub;
	}
	
	public WebElement getWord() {
		return word;
				
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getFind() {
		return find;
	}

	@FindBy(xpath = "//span[text()='Reply']")
	private WebElement reply;

	@FindBy(xpath = "//span[text()='Canned Action']")
	private WebElement canned;

	@FindBy(xpath = "//li[text()='Reply to Customer Query']")
	private WebElement query;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement apply;

	@FindBy(name = "subject")
	private WebElement sub;

	@FindBy(xpath = "//li[@title='All Tickets']")
	private WebElement check;

	@FindBy(xpath = "//a[text()='Internet issue']")
	private WebElement find;

	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement text;

	@FindBy(name = "name")
	private WebElement customer;

	@FindBy(name = "email")
	private WebElement mail;

	@FindBy(name = "phone")
	private WebElement phone;

	@FindBy(id = "submit")
	private WebElement submit;
	
	@FindBy(xpath= "//div[contains(text(),'Your ticket has been created ')]")
	private WebElement word;

}
