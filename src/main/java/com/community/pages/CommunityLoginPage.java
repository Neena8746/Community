package com.community.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.community.driver.DriverManager;
import com.community.enums.Waits;

public class CommunityLoginPage extends Commons {
	
	
	private final By textboxUsername=By.id("lia-login");
	private final By textboxPassword=By.xpath("//input[@id='lia-password' and @type='password']");
	private final By buttonLogin=By.id("submitContext_0");
	
	public CommunityLoginPage enterUserName(String name) {
		sendKeys(textboxUsername,name,Waits.PRESENCE);
		return this;
	}

	public CommunityLoginPage enterPassword(String pw) {
		sendKeys(textboxPassword,pw,Waits.PRESENCE);
		return this;
	}
	
	public void clickLogin() {
		click(buttonLogin,Waits.CLICKABLE);
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
