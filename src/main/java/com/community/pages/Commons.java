package com.community.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.community.driver.DriverManager;
import com.community.enums.Waits;
import com.community.reports.ExtentLogger;
import com.coomunity.factories.ExplicitWaitFactory;

public class Commons {

	//	private final static String linkMenu="%value%";
	WebElement ele=null;

	//	public static void clickOnMenu(String value) {
	//		DriverManager.getDriver().findElement(By.id(linkMenu.replace("%value%", value))).click();
	//
	//	}

	protected void sendKeys(By by,String value,Waits wait,String elementname) throws Exception {
		ele=ExplicitWaitFactory.explictwait(wait, by);
		ele.sendKeys(value);
		ExtentLogger.pass(value+" is entered in "+elementname,true);
	}

	protected void clickByKeys(By by,Waits wait,String elementname) throws Exception {

		ele=ExplicitWaitFactory.explictwait(wait, by);
		ele.sendKeys(Keys.RETURN);

		ExtentLogger.pass(elementname+" is clicked",true);
	}

	protected void click(By by,Waits wait,String elementname) throws Exception {

		ele=ExplicitWaitFactory.explictwait(wait, by);
		ele.click();

		ExtentLogger.pass(elementname+" is clicked",true);
	}

	protected void waitUntilHomepageLoad(By by,Waits wait,String elementname) {
		ExplicitWaitFactory.explictwait(wait, by);
	}


	protected void clickByAction(By by,Waits wait,String elementname) {

		Actions actions = new Actions(DriverManager.getDriver());
		ele=ExplicitWaitFactory.explictwait(wait, by);
		actions.moveToElement(ele).click().perform();

	}
	
	protected void clickByJavaScript(By by,Waits wait,String elementname) {

				
		WebElement myelement = DriverManager.getDriver().findElement(by);
		JavascriptExecutor jse2 = (JavascriptExecutor)DriverManager.getDriver();
		jse2.executeScript("arguments[0].click();", myelement); 

	}


}
