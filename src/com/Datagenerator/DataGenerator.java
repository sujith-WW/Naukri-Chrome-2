package com.Datagenerator;

import org.testng.annotations.Test;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	// @DataProvider(name="Excell2") //use static
	 @Test
	@DataProvider(name="Excell314") //use static
		public static Object[][] testDataGenerator() throws Exception
		{
			    FileInputStream file = new FileInputStream("./TestDatas/Naukri.xlsx");
		        XSSFWorkbook workbook = new XSSFWorkbook(file);//read from excel
				XSSFSheet LoginSheet = workbook.getSheet("login");
				int numberofData = LoginSheet.getPhysicalNumberOfRows();//number of rows
				//DataFormatter formatter  = new DataFormatter();
				Object [][] testDatas = new Object[numberofData][3];//to know cell use .get physical number of cells
		 
				 for(int i=0;i<numberofData;i++)
				{
					
					XSSFRow row = LoginSheet.getRow(i);
					XSSFCell uname = row.getCell(0);
					XSSFCell Pass = row.getCell(1);
					XSSFCell path = row.getCell(2);
					testDatas[i][0] = uname.getStringCellValue();
					System.out.println("UserName : "+uname);
					testDatas[i][1] = Pass.getStringCellValue();
			        System.out.println("Password : "+Pass);
			        testDatas[i][2] = path.getStringCellValue();
			        System.out.println("path : "+path);
			     //   testData Password = formatter.formatCellValue(Password.toString().toCharArray());
					
				}
				 
				 workbook.close();
				return testDatas;
				}
	
}
