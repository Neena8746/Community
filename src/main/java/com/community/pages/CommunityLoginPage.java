package com.community.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.community.driver.DriverManager;
import com.community.enums.Waits;
import com.community.reports.ExtentLogger;
import com.community.reports.ExtentReport;
import com.community.reports.ReportManger;

public class CommunityLoginPage extends Commons {


	private final By textboxUsername=By.id("lia-login");
	private final By textboxPassword=By.xpath("//input[@id='lia-password' and @type='password']");
	private final By buttonLogin=By.id("submitContext_0");

	public CommunityLoginPage enterUserName(String name) throws Exception {
		sendKeys(textboxUsername,name,Waits.PRESENCE,"username");
		return this;
	}

	public CommunityLoginPage enterPassword(String pw) throws Exception {
		sendKeys(textboxPassword,pw,Waits.PRESENCE,"password");
		return this;
	}

	public void clickLogin() throws Exception {
		click(buttonLogin,Waits.CLICKABLE,"login");
	}

	public String getTitle() {
		return DriverManager.getDriver().getTitle();
	}

	//	public void clickLoginThroughAction() {
	////		DriverManager.getDriver().findElement(buttonLogin).click();
	////		clickByAction(DriverManager.getDriver().findElement(buttonLogin));
	//		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
	//
	//		jse.executeScript("arguments[0].scrollIntoView()", DriverManager.getDriver().findElement(buttonLogin)); 
	//	}
}
