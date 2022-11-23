package com.community.constants;

public class FrameworkConstants {
	
	private static final String CONFIGFILEPATH=System.getProperty("user.dir")+"/Configuration/config.properties";

	public static String getConfigPath() {
		return CONFIGFILEPATH;
	}

}
