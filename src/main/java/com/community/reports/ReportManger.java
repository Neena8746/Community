package com.community.reports;

import com.aventstack.extentreports.ExtentTest;

public class ReportManger {

	//thread safe
	private static ThreadLocal<ExtentTest>extTest=new ThreadLocal<ExtentTest>();

	static ExtentTest getTest() {
		return extTest.get();
	}

	static void setTest(ExtentTest report) {
		extTest.set(report);
	}

	static void unloadTest() {
		extTest.remove();
	}
}
