package com.community.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.community.constants.FrameworkConstants;

public class ExcelUtils {

	public static List<Map<String,String>> getTestData(){

		List<Map<String,String>>list=null;
		FileInputStream fi=null;

		try {
			fi=new FileInputStream(FrameworkConstants.getExcelpath());
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("Runner");

			Map<String,String>map=null;
			list=new ArrayList<Map<String,String>>();
			int lastrownum=sh.getLastRowNum();
			int lastcolnum=sh.getRow(0).getLastCellNum();

			//code to store the excel details in map then List

			for(int i=1;i<=lastrownum;i++) {
				map=new HashMap<String,String>();
				for(int j=0;j<lastcolnum;j++) {
					String key=sh.getRow(0).getCell(j).getStringCellValue();
					DataFormatter formatter = new DataFormatter();
					String value = formatter.formatCellValue(sh.getRow(i).getCell(j));
//					String value=sh.getRow(i).getCell(j).getStringCellValue();
					map.put(key, value);
				}
				list.add(map);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(Objects.nonNull(fi)) {
					fi.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;



	}}
