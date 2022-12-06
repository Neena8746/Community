package com.community.pages;

import org.openqa.selenium.By;

import com.community.driver.DriverManager;
import com.community.enums.Waits;

public class CommunityLoginPage extends Commons {


	private final By textboxUsername=By.id("lia-login");
	private final By textboxPassword=By.xpath("//input[@id='lia-password' and @type='password']");
	private final By buttonLogin=By.id("submitContext_0");
	private final By homepage=By.xpath("//*[contains(@class,'CommunityPage')]");

	public CommunityLoginPage enterUserName(String name) throws Exception {
		sendKeys(textboxUsername,name,Waits.PRESENCE,"username");
		return this;
	}

	public CommunityLoginPage enterPassword(String pw) throws Exception {
		sendKeys(textboxPassword,pw,Waits.PRESENCE,"password");
		return this;
	}

	public CommunityHomePage clickLogin() throws Exception {
		clickByKeys(buttonLogin,Waits.CLICKABLE,"login");
		return new CommunityHomePage();
	}

	public String getTitle() {
		return DriverManager.getDriver().getTitle();
	}
	
	public void homepageLoad() {
		waitUntilHomepageLoad(homepage,Waits.PRESENCE,"homepage");
	}

	//	public void clickLoginThroughAction() {
	////		DriverManager.getDriver().findElement(buttonLogin).click();
	////		clickByAction(DriverManager.getDriver().findElement(buttonLogin));
	//		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
	//
	//		jse.executeScript("arguments[0].scrollIntoView()", DriverManager.getDriver().findElement(buttonLogin)); 
	//	}
}
