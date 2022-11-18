package com.community.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static WebDriver driver;
	private static ThreadLocal<WebDriver>threadLocal=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return threadLocal.get();
	}
	
	private static void setDriver(WebDriver driver) {
		threadLocal.set(driver);
	}
	
//	private static void unload() {
//		threadLocal.remove();
//	}

	public static void initDriver() {
		if(Objects.isNull(getDriver())) {
			WebDriverManager.chromedriver().setup();
			
//			driver = new ChromeDriver();
			setDriver(new ChromeDriver());
		}
	}

	public static void quitDriver() {
		if(Objects.nonNull(getDriver())) {
//			unload();
			getDriver().quit();
		}
	}
}
