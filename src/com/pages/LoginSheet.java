 package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.Utilitys;
@Test
public class LoginSheet
{   static //3 methods
	WebDriver driver;
 
	//no static

	public LoginSheet(WebDriver driver)//constructor
	{
		this.driver=driver;
		 
	}
	@BeforeTest
	
	public void enterUsername(String uname) throws Exception
	{       //key from Elements.properties 
		driver.findElement(By.id(Utilitys.fetchlocatorsvalue("loginNaukri_uname_id"))).sendKeys(uname);
		Thread.sleep(1000);
	}
	
	public void enterpassword(String pass) throws Exception
	{
		driver.findElement(By.id(Utilitys.fetchlocatorsvalue("loginNaukri_password_id"))).sendKeys(pass); 
		Thread.sleep(1000);
	}
	
	public void clickSignup() throws Exception
	{
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("loginNaukri_Login_xpath"))).click();
		Thread.sleep(5000);
     }
	
	//-------------------------------scroll down the page-----------------------------------//
	    //scroll page down
	//public void scrolldown() throws Exception
	//{
		//driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("loginNaukri_Login_xpath"))).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//fresher profile.............................sujithreddy1991@aol.com
	   // js.executeScript("window.scrollBy(0,2000)");
		
		//Experienced profile.........................sujithreddy1991@gmail.com
	    //js.executeScript("window.scrollBy(0,2900)");
	   // Thread.sleep(6000);
	//}
	
	@AfterTest
	public void uploadcv(String path) throws Exception
	{
		driver.findElement(By.xpath(Utilitys.fetchlocatorsvalue("loginNaukri_uploadcv_xpath"))).sendKeys(path);
		Thread.sleep(5000);
		driver.quit();
	}
	
}
