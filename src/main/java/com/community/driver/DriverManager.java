package com.community.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	private DriverManager(){
		
	}
	private static ThreadLocal<WebDriver>threadLocal=new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return threadLocal.get();
	}

	protected static void setDriver(WebDriver driver) {
		threadLocal.set(driver);
	}

    protected static void unload() {
			threadLocal.remove();
		}

}
