package com.community.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.community.driver.Driver;
import com.community.driver.DriverManager;
import com.community.utils.ReadConfig;



public final class LoginTest extends BaseClass {
	
	private LoginTest(){
		
	}
	
    @Test
	void login() throws Exception {
//		Driver.getDriver().findElement(By.id("lia-login")).sendKeys(ReadConfig.getKey("username"));
//		Driver.getDriver().findElement(By.id("lia-password")).sendKeys(ReadConfig.getKey("Password"));
		
    	DriverManager.getDriver().findElement(By.xpath("//button[@id='technology-support-button']")).click();
	}
    
    @Test
	void login1() throws Exception {
//		Driver.getDriver().findElement(By.id("lia-login")).sendKeys(ReadConfig.getKey("username"));
//		Driver.getDriver().findElement(By.id("lia-password")).sendKeys(ReadConfig.getKey("Password"));
		
    	DriverManager.getDriver().findElement(By.xpath("//button[@id='technology-support-button']")).click();
	}
}
