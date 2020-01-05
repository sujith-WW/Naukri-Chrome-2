package com.Datagenerator;

import org.testng.annotations.Test;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.testng.annotations.DataProvider;

public class DataGeneratorsforRegistration {

	 @Test
	@DataProvider(name="REgister") //use static
		public static Object[][] testDataGenerator() throws Exception
		{
			    FileInputStream file = new FileInputStream(".//TestDatas//Naukri.xlsx");
		        XSSFWorkbook workbook = new XSSFWorkbook(file);//read from excel
				XSSFSheet RegisterationNewSheet = workbook.getSheet("Register");
				int numberofData = RegisterationNewSheet.getPhysicalNumberOfRows();//number of rows
				//DataFormatter formatter  = new DataFormatter();
				Object [][] testData = new Object[numberofData][6];//to know cell use .get physical number of cells
		      //  DataFormatter formatter = new DataFormatter();
		       
				 for(int i=0;i<numberofData;i++)
				{
					
					XSSFRow row = RegisterationNewSheet.getRow(i);
					XSSFCell uname = row.getCell(0);
					XSSFCell email = row.getCell(1);
					XSSFCell pass = row.getCell(2);
					XSSFCell number = row.getCell(3);
					XSSFCell city = row.getCell(4);
					XSSFCell path = row.getCell(5);
					
					testData[i][0] = uname.getStringCellValue();
					System.out.println("UserName from Register : "+uname);
					
					testData[i][1] = email.getStringCellValue();
			        System.out.println("email to Register : "+email);
			        
			         //testData[i][2] = Integer.parseInt(Mobile.toString());
			        testData[i][2] = pass.getStringCellValue();
			        System.out.println("password to Register : "+pass);
			        //String val = formatter.formatCellValue(RegisterationNewSheet.getRow(numberofData).getCell(numberofData));
			       			        
			        testData[i][3] = number.getStringCellValue();
			        System.out.println("Phone number to Register : "+number);
			        
			        testData[i][4] = city.getStringCellValue();
			        System.out.println("city to Register : "+city);
			        //testData Password = formatter.formatCellValue(Password.toString().toCharArray());
					
			        testData[i][5] = path.getStringCellValue();
			        System.out.println("path to Register : "+path);
				}
				 
				 workbook.close();
				return testData;
				}
	
}
