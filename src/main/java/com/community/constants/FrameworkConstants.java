package com.community.constants;

import com.community.enums.ConfigEnums;
import com.community.utils.ReadConfig;

public class FrameworkConstants {

	private static final String CONFIGFILEPATH=System.getProperty("user.dir")+"/Configuration/config.properties";
	private static final String EXTENTREPORTFOLDERPATH=System.getProperty("user.dir")+"/extenttest-output/";
	private static final String EXCELPATH=System.getProperty("user.dir")+"/Excel/testdata.xlsx";
	
	private static String extentreportFilePath="";

	public static String getExtentreportfilepath() throws Exception {
		if(extentreportFilePath.isEmpty()) {
			extentreportFilePath=createExtentReportFilepath();
		}
		return extentreportFilePath;
	}

	private static String createExtentReportFilepath() throws Exception{
		if(ReadConfig.get(ConfigEnums.OVERRIDEREPORTS).equalsIgnoreCase("no")){
			return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
		}
		else {
			return EXTENTREPORTFOLDERPATH+"/index.html";
		}
	}



	public static String getConfigPath() {
		return CONFIGFILEPATH;
	}

	public static String getExcelpath() {
		return EXCELPATH;
	}




}
