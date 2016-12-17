package com.skynets.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData 
{
	public static String fromProperties(String fName, String key)
		{
			String data = null;
			try
			{
				File f = new File("./configdata/"+fName+".properties");
				FileInputStream fis = new FileInputStream(f);
				Properties prop = new Properties();
				prop.load(fis);
				data = prop.getProperty(key);
			}
			catch(Exception e)
			{
				
			}
			return data;
		}
		public static String fromExcel(String fName, String sName, int rIndex, int cIndex)
		{
			String data = null;
			try
			{
				File f = new File("./testdata/"+fName+".xlsx");
				FileInputStream fis = new FileInputStream(f);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet st = wb.getSheet(sName);
				Row r = st.getRow(rIndex);
				Cell c = r.getCell(cIndex);
				data = c.toString();
			}
			catch(Exception e)
			{
				
			}
			return data;
		}
}
