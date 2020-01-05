 package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.Utilitys;

public class ContactUs
{   //3 methods
	static WebDriver driver;
	//no static
	public ContactUs(WebDriver driver)//constructor
	{
		ContactUs.driver=driver;
	}
	//click contact us
	public static void clickContactus() throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.cssSelector(Utilitys.fetchlocatorsvalue("ContactUs_ContactUs_cssSelector"))).click();
		Thread.sleep(1000);
		
	}
	//enter name
	public static void entername(String name) throws Exception
	{       //key from Elements.properties 
		driver.findElement(By.name(Utilitys.fetchlocatorsvalue("ContactUs_Name_id"))).sendKeys(name);
	}
	//enter emailid
	public static void enteremailid(String email) throws Exception
	{
		driver.findElement(By.id(Utilitys.fetchlocatorsvalue("ContactUs_Email_id"))).sendKeys(email); 
	}
	//enter subject
	public static void entersubject(String subject) throws Exception
	{
		driver.findElement(By.id(Utilitys.fetchlocatorsvalue("ContactUs_Subject_name"))).sendKeys(subject); 
	}
	
	//enter message
	public static void entermessage(String message) throws Exception
	{
		driver.findElement(By.id(Utilitys.fetchlocatorsvalue("ContactUs_Message_id"))).sendKeys(message); 
	}
	//send message
	public static void clicksendmessage() throws Exception
	{
		driver.findElement(By.id(Utilitys.fetchlocatorsvalue("ContactUs_SendMessage_id"))).click();
		Thread.sleep(5000);
	}
	
	
	//Asserts.assertTrue("user is not able to login successfully..!!", condition);
	//Asserts.assertSame(driver.getTitle().contains("Dashboard"),"user is not able to login successfully..!!");
	
	//System.out.println("page title verified -user is able to login successfully..!!");

	public static void clickAbout() throws Exception
	{
		driver.findElement(By.cssSelector(Utilitys.fetchlocatorsvalue("ContactUs_Home_cssSelector"))).click();
		//System.out.println("Logged out Successfully..!! ");
		Thread.sleep(1000);
	}
	
	

	
    
}
