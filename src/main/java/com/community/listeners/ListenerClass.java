package com.community.listeners;

import java.io.IOException;
import java.util.Arrays;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.community.reports.ExtentLogger;
import com.community.reports.ExtentReport;

public class ListenerClass implements ITestListener,ISuiteListener {

	public void onStart(ISuite suite) {
		try {
			ExtentReport.initReports();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onFinish(ISuite suite) {
		try {
			ExtentReport.flushReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		try {
			ExtentLogger.pass(result.getMethod().getMethodName()+" is passed",true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		
			try {
				ExtentLogger.fail(result.getMethod().getMethodName()+" is failed",true);
				//To see the logs in report
				ExtentLogger.fail(result.getThrowable().toString());
				ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName()+" is skipped");
	}

//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//	}
//
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}
//
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
//	}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
//	}
		

    
   
}
 