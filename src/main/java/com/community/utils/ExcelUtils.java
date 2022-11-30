package com.community.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import com.community.constants.FrameworkConstants;

public class ExcelUtils {
	
	public static List<Map<String,String>> getTestData(){
		
		try {
			FileInputStream fi=new FileInputStream(FrameworkConstants.getExcelpath());
//			XS
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
