 package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.Utilitys;



//Before running this must change URL from login sheet

public class RegisterationNewSheet
{   //3 methods
	static WebDriver driver;
	//no static
	public RegisterationNewSheet(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
	public static void clicksignup() throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("Registration_NewRegistration_xpath"))).click();
		Thread.sleep(1000);
}
	
	public static void clickfresher() throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("Registration_imfresher_xpath"))).click();
		Thread.sleep(1000);
}
	public static void Name(String uname) throws Exception
	{       //key from Elements.properties 
		driver.findElement(By.name(Utilitys.fetchlocatorsvalue("Registration_SignupName_Name"))).sendKeys(uname);
		Thread.sleep(1000);
	}
	
	public static void EmailAddress(String email) throws Exception
	{       //key from Elements.properties 
		driver.findElement(By.id(Utilitys.fetchlocatorsvalue("Registration_SignupEmail_id"))).sendKeys(email);
		Thread.sleep(1000);
	}
	public static void password(String pass) throws Exception
	{       //key from Elements.properties 
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("Registration_password_xpath"))).sendKeys(pass);
		Thread.sleep(1000);
	}
	public static void MobileNumber(String number) throws Exception
	{
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("Registration_SignupMobileNumber_xpath"))).sendKeys(number); 
		Thread.sleep(1000);
	}
	
	public static void currentlocation(String city) throws Exception
	{
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("Registation_currentlocation_xpath"))).sendKeys(city); 
		Thread.sleep(1000);
	}
	
	public static void UploadResume(String path) throws Exception
	{
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("Registation_uploadresume_xpath"))).sendKeys(path);
		Thread.sleep(1000);
		System.out.println("Testcase complete..!! ");
	}
	
	public static void RegisterNow() throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("Registation_RegisterNow_xpath"))).click();
		Thread.sleep(1000);

	driver.quit();
	
	}
	
    
}
