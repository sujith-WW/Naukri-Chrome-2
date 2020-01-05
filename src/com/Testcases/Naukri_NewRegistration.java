package com.Testcases;

 import org.testng.annotations.Test;

import com.Base.DriverInstance;
import com.Datagenerator.DataGeneratorsforRegistration;
import com.pages.RegisterationNewSheet;


//uses bases class & pages
public class Naukri_NewRegistration extends DriverInstance
{ 
	//use generated data in test case -(dataProvider="TestData" , dataProviderClass=DataGenerator.class)
	 @Test(dataProvider="REgister" , dataProviderClass=DataGeneratorsforRegistration.class)
	//public void tc_001_login_functionality() throws Exception
   public void Naukri_NewRegistration(String uname,String email,String pass,String number,String city,String path) throws Exception
   {  
		 RegisterationNewSheet RegisterationNewSheet = new RegisterationNewSheet(driver);//driver object is coming from parent class in to child class  
		 com.pages.RegisterationNewSheet.clicksignup();
		 com.pages.RegisterationNewSheet.clickfresher();
		 com.pages.RegisterationNewSheet.Name(uname);
		 com.pages.RegisterationNewSheet.EmailAddress(email);
		 com.pages.RegisterationNewSheet.password(pass);
		 com.pages.RegisterationNewSheet.MobileNumber(number);
		 com.pages.RegisterationNewSheet.currentlocation(city);
		 com.pages.RegisterationNewSheet.UploadResume(path);
		 com.pages.RegisterationNewSheet.RegisterNow();
		 
		 //String actual =  driver.getCurrentUrl();
	     //String Expected =  "http://newnuk.com/lscr/about";
			//try
			// {
			//	 Assert.assertEquals(actual, Expected);
			//	System.out.println("Login Test passed");
			 //}catch(Exception e) {
			//	 System.out.println("Login Test Failed");
		 
	System.out.println("Test completed.......Registered Successfully");
		 }
   }
	
	
