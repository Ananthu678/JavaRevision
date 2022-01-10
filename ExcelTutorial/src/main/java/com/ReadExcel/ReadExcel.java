package com.ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcel() throws Exception {
	String excelpath ="C:\\Users\\I322911\\eclipse-new workspace\\ExcelTutorial\\TestData\\TestData.xlsx";
	String sheetname = "Test";
	File file = new File(excelpath);
	FileInputStream fis = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet(sheetname);
	int rowcount = sheet.getLastRowNum();
	System.out.println(rowcount);
	
	String data = sheet.getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	
	for (int i = 0; i < rowcount; i++) {
		 Row row =sheet.getRow(i);
		 for (int j = 0; j < row.getLastCellNum(); j++) {
			 String data1 = sheet.getRow(i).getCell(j).getStringCellValue();
			 System.out.println(data1+ " ");
		}
	   System.out.println();
	}
	
	wb.close();
	
	}

}
