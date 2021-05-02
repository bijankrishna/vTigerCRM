package com.vtiger.genericCodes;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtils {

	public String getDataFromProperty(String key) throws Exception {
		FileInputStream fis=new FileInputStream(AutoConstants.PROP_PATH);
		Properties pobj=new Properties();
		pobj.load(fis);
//		String value = pobj.getProperty(key);
//		return value;
		return pobj.getProperty(key);
	}
	
	public String getDataFromExcel(String sheetName,int rowNum,int cellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream(AutoConstants.EXCEL_PATH);
		Workbook book = WorkbookFactory.create(fis);
		Cell cell = book.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}

}
