package com.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 

{
	XSSFWorkbook wb;
	XSSFSheet Naukri;
	
	public ExcelDataConfig(String excelPath) 
	{
		try {
			File src=new File(excelPath); 	
			FileInputStream fis=new FileInputStream(src);
			  
			   wb=new XSSFWorkbook(fis);
			  
			  
		} 
		   catch (IOException e) {
			System.out.println(e.getMessage());
		}
}


   public String  getData(int SheetNumber,int row,int column) 

   {
	Naukri=wb.getSheetAt(SheetNumber);
	String data=Naukri.getRow(row).getCell(column).getStringCellValue();   
	
	return data;
	   
   }
   
}
   
   
   
   












