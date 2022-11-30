package com.community.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.community.constants.FrameworkConstants;

public class ExtentReport {

	static ExtentReports extent;

	public static void initReports() throws Exception
	{
		if(Objects.isNull(extent)) {
			extent=new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentreportfilepath());
			extent.attachReporter(spark);	
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Community Report");
			spark.config().setReportName("Community Report");
		}
	}

	public static void createTest(String tcName) {
		ExtentTest test=extent.createTest(tcName);
		ReportManger.setTest(test);
	}

	public static void flushReport() throws Exception {
		if(Objects.nonNull(extent)) {
//			ReportManger.unloadTest();
			extent.flush();

		}
		//To open the Extent report by default
		Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentreportfilepath()).toURI());
	}

}
