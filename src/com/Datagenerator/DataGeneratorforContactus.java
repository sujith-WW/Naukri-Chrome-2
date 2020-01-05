package com.Datagenerator;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGeneratorforContactus {

	 @DataProvider(name="Excell3") //use static
		public static Object[][] dataGeneratorforContactus(Method met) throws Exception
		{
		 if(met.getName().equalsIgnoreCase("Lscr_contactUspage"))
		 {
			    FileInputStream file = new FileInputStream("./TestDatas/Lscr.xlsx");
		        XSSFWorkbook workbook = new XSSFWorkbook(file);//read from excel
				XSSFSheet ContactUS = workbook.getSheet("ContactUS");
				int numberofData = ContactUS.getPhysicalNumberOfRows();//number of rows
				Object [][] testDatas = new Object[numberofData][4];//to know cell use .get physical number of cells
		 
				 for(int i=0;i<numberofData;i++)
				{
					
					XSSFRow row = ContactUS.getRow(i);
					XSSFCell name = row.getCell(0);
					XSSFCell email = row.getCell(1);
					XSSFCell subject = row.getCell(2);
					XSSFCell message = row.getCell(3);
					
					testDatas[i][0] = name.getStringCellValue();
					System.out.println("name : "+name);
					
					testDatas[i][1] = email.getStringCellValue();
			        System.out.println("email : "+email);
			        
			        testDatas[i][2] = subject.getStringCellValue();
			        System.out.println("subject : "+subject);
			        
			        testDatas[i][3] = message.getStringCellValue();
			        System.out.println("message : "+message);
			     
					
				}
				 

				return testDatas;
				}
		 else if(met.getName().equalsIgnoreCase("lscr_loginFunctionality"))
		 {
			   FileInputStream file = new FileInputStream("./TestDatas/Lscr.xlsx");
		        XSSFWorkbook workbook = new XSSFWorkbook(file);//read from excel
				XSSFSheet LoginSheet = workbook.getSheet("login");
				int numberofData = LoginSheet.getPhysicalNumberOfRows();//number of rows
				//DataFormatter formatter  = new DataFormatter();
				Object [][] testDatas = new Object[numberofData][2];//to know cell use .get physical number of cells
		 
				 for(int i=0;i<numberofData;i++)
				{
					
					XSSFRow row = LoginSheet.getRow(i);
					XSSFCell Username = row.getCell(0);
					XSSFCell Password = row.getCell(1);
					testDatas[i][0] = Username.getStringCellValue();
					System.out.println("UserName : "+Username);
					testDatas[i][1] = Password.getStringCellValue();
			        System.out.println("Password : "+Password);
			     //   testData Password = formatter.formatCellValue(Password.toString().toCharArray());
					
				}
				 
			
				return testDatas;
		 }
		 else
		 {
			 Object [][] testDatas = new Object[2][2];
			 return testDatas;
		 }
		}
	
}
