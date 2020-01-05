package com.Base;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Config.Utilitys;

public class DriverInstanceforlogin {
	private static final Throwable e = null;
	//can be used in child class becouse its public
	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstances() throws Exception
	{
		 if(Utilitys.fetchPropertysvalue("browserName").toString().equalsIgnoreCase("firefox"))
       {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	        driver = new FirefoxDriver();
         }
      else if(Utilitys.fetchPropertysvalue("browserName").toString().equalsIgnoreCase("chrome"))  
       {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	        driver = new ChromeDriver();
       }
       //incorrect value is mentioned
       else 
       {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	        driver = new FirefoxDriver();
	}
		 //picking URL from config file
      // driver.get(Utilitys.fetchPropertysvalue("applicationURL").toString());
       driver.get(Utilitys.fetchPropertysvalue("appURL").toString());
       //work from here- maxi mize the page
       driver.manage().window().maximize();
      
       
	}
	
   
@AfterMethod
	public void tearDown(ITestResult result) throws Exception
	{
	   Thread.sleep(1000);
	   if(ITestResult.FAILURE==result.getStatus())
		{ 
		   //takes screenshot based on test case name
			library.Utility.capturescreenshot(driver, result.getName());
			
			//library.Utility.capturescreenshot("result",+e.getMessage());
			//"Exception while taking screenshot "+e.getMessage()
		}
		driver.quit();	
	}
	
}

	

	



