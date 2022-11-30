package com.community.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.community.constants.FrameworkConstants;
import com.community.enums.ConfigEnums;

public class ReadConfig {
static Properties prop=new Properties();
private static final Map<String,String>CONFIGMAP=new HashMap<String, String>();
	
	static 
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream(FrameworkConstants.getConfigPath());
			prop.load(fis);
			
//			for(Object key:prop.keySet()) {
//				CONFIGMAP.put(String.valueOf(key), null);
//			}
			
			for(Map.Entry<Object, Object>entry:prop.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String get(ConfigEnums key) throws Exception {
		if(Objects.isNull(key)||Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
			throw new Exception("key"+key+"is not found.Please check config.properties");
		}
			
		return CONFIGMAP.get(key.name().toLowerCase());
		
	}
	
//	public static String getKey(String Key) throws Exception{
//		if(Objects.isNull(Key)||Objects.isNull(prop.getProperty(Key))) {
//			throw new Exception("key"+Key+"is not found.Please check config.properties");
//		}
//		return prop.getProperty(Key);
//		
//	}
	
}
