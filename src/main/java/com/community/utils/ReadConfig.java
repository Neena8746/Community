package com.community.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import com.community.constants.FrameworkConstants;

public class ReadConfig {
static Properties prop=new Properties();
	
	static 
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream(FrameworkConstants.getConfigPath());
			prop.load(fis);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getKey(String Key) throws Exception{
		if(Objects.isNull(Key)||Objects.isNull(prop.getProperty(Key))) {
			throw new Exception("key"+Key+"is not found.Please check config.properties");
		}
		return prop.getProperty(Key);
		
	}
	
}
