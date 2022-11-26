package com.community.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	static ExtentReports extent;

	public static void initReports()
	{
		if(Objects.isNull(extent)) {
			extent=new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
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

	public static void flushReport() throws IOException {
		if(Objects.nonNull(extent)) {
//			ReportManger.unloadTest();
			extent.flush();

		}
		//To open the Extent report by default
		Desktop.getDesktop().browse(new File("index.html").toURI());
	}

}
