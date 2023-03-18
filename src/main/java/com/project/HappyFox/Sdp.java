package com.project.HappyFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {

	private WebDriver driver;

	public Sdp(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginPage getLoginPage() {

		LoginPage lp = new LoginPage(driver);
		return lp;

	}

	public HomePage getHomePage() {

		HomePage hp = new HomePage(driver);

		return hp;

	}

	public SupportCentrePage getSupportCentrePage() {

		SupportCentrePage sp = new SupportCentrePage(driver);

		return sp;

	}

}
