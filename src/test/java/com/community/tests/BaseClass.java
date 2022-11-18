package com.community.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.community.driver.Driver;
import com.community.utils.ReadConfig;
public class BaseClass {

	@BeforeSuite
	void setUp() throws Exception {
		Driver.initDriver();
		Driver.getDriver().get(ReadConfig.getKey("url"));

	}
	
	@AfterSuite
	void teardown() {
		Driver.quitDriver();
	}

}