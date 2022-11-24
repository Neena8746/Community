package com.community.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.community.utils.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver  {

	private static WebDriver driver;

	

	public static void initDriver() throws Exception {
		if(Objects.isNull(DriverManager.getDriver())) {
			WebDriverManager.chromedriver().setup();
        	driver = new ChromeDriver();
        	DriverManager.setDriver(driver);
        	
		}
	}

	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().close();
			DriverManager.unload();
			
		}
	}

}
