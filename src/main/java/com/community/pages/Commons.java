package com.community.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.community.driver.DriverManager;
import com.community.enums.Waits;
import com.coomunity.factories.ExplicitWaitFactory;

public class Commons {
	
private final static String linkMenu="%value%";
WebElement ele=null;

	public static void clickOnMenu(String value) {
		DriverManager.getDriver().findElement(By.id(linkMenu.replace("%value%", value))).click();
		
	}
	
	protected void sendKeys(By by,String value,Waits wait) {

		ele=ExplicitWaitFactory.explictwait(wait, by);
		ele.sendKeys(value);
	}
	
	protected void click(By by,Waits wait) {

		ele=ExplicitWaitFactory.explictwait(wait, by);
		ele.sendKeys(Keys.RETURN);
	}
	

//	protected void clickByAction(WebElement ele) {
//		
//		Actions actions = new Actions(DriverManager.getDriver());
//
//		actions.moveToElement(ele).click().perform();
//		
//	}
	

}
