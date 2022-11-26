package com.community.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.community.driver.DriverManager;
import com.community.enums.Waits;
import com.community.reports.ExtentLogger;
import com.coomunity.factories.ExplicitWaitFactory;

public class Commons {

	private final static String linkMenu="%value%";
	WebElement ele=null;

	public static void clickOnMenu(String value) {
		DriverManager.getDriver().findElement(By.id(linkMenu.replace("%value%", value))).click();

	}

	protected void sendKeys(By by,String value,Waits wait,String elementname) {
		ele=ExplicitWaitFactory.explictwait(wait, by);
		ele.sendKeys(value);
		ExtentLogger.pass(value+" is entered in "+elementname);
	}

	protected void click(By by,Waits wait,String elementname) {

		ele=ExplicitWaitFactory.explictwait(wait, by);
		ele.sendKeys(Keys.RETURN);
		ExtentLogger.pass(elementname+" is clicked");
	}


	//	protected void clickByAction(WebElement ele) {
	//		
	//		Actions actions = new Actions(DriverManager.getDriver());
	//
	//		actions.moveToElement(ele).click().perform();
	//		
	//	}


}
