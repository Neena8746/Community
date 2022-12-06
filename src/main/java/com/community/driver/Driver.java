package com.community.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver  {

	private static WebDriver driver;

	

	public static void initDriver(String browser) throws Exception {
		if(Objects.isNull(DriverManager.getDriver())) {
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
	        	driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup();
				driver=new OperaDriver();			}
			
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
