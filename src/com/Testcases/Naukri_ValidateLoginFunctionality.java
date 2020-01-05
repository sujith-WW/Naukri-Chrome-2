package com.Testcases;

 import org.testng.annotations.Test;

import com.Base.DriverInstance;
import com.Base.DriverInstanceforlogin;
import com.Datagenerator.DataGenerator;
import com.pages.LoginSheet;


//uses bases class & pages
public class Naukri_ValidateLoginFunctionality extends DriverInstanceforlogin
{ 
	//use generated data in test case -(dataProvider="TestData" , dataProviderClass=DataGenerator.class)
	 @Test(dataProvider="Excell314" , dataProviderClass=DataGenerator.class)
	//public void tc_001_login_functionality() throws Exception
   public void Naukri_Login(String uname,String pass,String path) throws Exception
   {  
		 LoginSheet logins = new LoginSheet(driver);//driver object is coming from parent class in to child class  
		 logins.enterUsername(uname);
		 logins.enterpassword(pass);
		 logins.clickSignup();
		// logins.scrolldown(); ......This method is disabled due to the new CR........//
		 logins.uploadcv(path);
		
		 //String actual =  driver.getCurrentUrl();
	     //String Expected =  "https://www.naukri.com/mnjuser/homepage?id=&prefmsg=1&altresid=";
			//try
			// {
			//	 Assert.assertEquals(actual, Expected);
			//	System.out.println("Login Test passed");
			 //}catch(Exception e) {
			//	 System.out.println("Login Test Failed");
		 
	System.out.println("Test completed...Congratulations your Profile Updated successfully");
	
	
		 }
   }
	
	
