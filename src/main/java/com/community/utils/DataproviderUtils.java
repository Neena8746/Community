package com.community.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class DataproviderUtils {

	@DataProvider
	public static Object[] getData(Method m) {
		
		String testname=m.getName();
		
		List<Map<String,String>>list=ExcelUtils.getTestData("DATA");
		List<Map<String,String>>testList=new ArrayList<Map<String, String>>();
		
		//iterating for the specific test items
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).get("testname").equalsIgnoreCase(testname)) {
				if(list.get(i).get("execute").equalsIgnoreCase("yes")) {
					testList.add(list.get(i));
				}
			}
		}
		
//		list.removeAll(testList);
		return testList.toArray();
		
	}
}
