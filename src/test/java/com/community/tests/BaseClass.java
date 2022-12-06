package com.community.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.community.driver.Driver;
import com.community.driver.DriverManager;
import com.community.enums.ConfigEnums;
import com.community.utils.ReadConfig;
public class BaseClass {
	
	protected BaseClass() {
		
	}
	

	@BeforeMethod
	protected void setUp() throws Exception {
		
		String browser=ReadConfig.get(ConfigEnums.BROWSER);
		Driver.initDriver(browser);
		DriverManager.getDriver().get(ReadConfig.get(ConfigEnums.URL));
		DriverManager.getDriver().manage().window().fullscreen();
		DriverManager.getDriver().manage().window().maximize();
		
	}


	@AfterMethod
	void teardown() {
		Driver.quitDriver();
	}

}