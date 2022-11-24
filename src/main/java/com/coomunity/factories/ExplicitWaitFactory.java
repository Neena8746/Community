package com.coomunity.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.community.driver.DriverManager;
import com.community.enums.Waits;

public class ExplicitWaitFactory {
	
	static WebElement ele=null;
	
	public static WebElement explictwait(Waits wait,By by) {
		if (wait == Waits.PRESENCE) {
			
			 ele=new WebDriverWait(DriverManager.getDriver(),10)
	        .until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(wait == Waits.CLICKABLE){
			
			ele=new WebDriverWait(DriverManager.getDriver(),10)
	        .until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(wait == Waits.VISIBLE) {
			
			ele=new WebDriverWait(DriverManager.getDriver(),10)
	        .until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(wait == Waits.NONE) {
			
			ele=DriverManager.getDriver().findElement(by);
		}
		return ele;
	}

}
