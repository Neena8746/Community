package com.community.reports;

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

}
