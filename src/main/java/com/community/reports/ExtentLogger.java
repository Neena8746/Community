package com.community.reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.community.driver.DriverManager;
import com.community.enums.ConfigEnums;
import com.community.utils.ReadConfig;

public class ExtentLogger {
	
	private ExtentLogger(){}
	
	public static void pass(String message) {
		ReportManger.getTest().pass(message);
	}
	
	public static void fail(String message) {
		ReportManger.getTest().fail(message);
	}
	
	public static void skip(String message) {
		ReportManger.getTest().skip(message);
	}
	
	public static void pass(String message ,boolean isScreenshotNeeded) throws Exception {
		if(ReadConfig.get(ConfigEnums.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&&isScreenshotNeeded) {
			ReportManger.getTest().pass(message,MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}
	}
	
	public static void fail(String message ,boolean isScreenshotNeeded) throws Exception {
		if(ReadConfig.get(ConfigEnums.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&&isScreenshotNeeded) {
			ReportManger.getTest().fail(message,MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}
	}
	public static void skip(String message ,boolean isScreenshotNeeded) throws Exception {
		if(ReadConfig.get(ConfigEnums.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&&isScreenshotNeeded) {
			ReportManger.getTest().skip(message,MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}
	}
	
	public static String getBase64Image() {
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
		
	}

}
