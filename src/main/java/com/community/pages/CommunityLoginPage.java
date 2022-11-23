package com.community.pages;

import org.openqa.selenium.By;

import com.community.driver.DriverManager;

public class CommunityLoginPage {
	
	
	private final By textbox_username=By.id("lia-login");
	private final By textbox_password=By.xpath("//input[@id='lia-password' and @type='password']");
	private final By button_login=By.id("submitContext_0");
	
	public CommunityLoginPage enterUserName(String name) {
		DriverManager.getDriver().findElement(textbox_username).sendKeys(name);
		return this;
	}

	public CommunityLoginPage enterPassword(String pw) {
		DriverManager.getDriver().findElement(textbox_password).sendKeys(pw);
		return this;
	}
	
	public void clickLogin() {
		DriverManager.getDriver().findElement(button_login).click();
	}
}
