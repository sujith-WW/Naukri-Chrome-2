package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;


public class Utility {
	//parametarise driver
	public static void capturescreenshot(WebDriver driver,String screenshotName)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./screenshots/"+screenshotName+".png"));
			
			System.out.println("Test Failed...Screenshot captured Successfully...!!");
			//Exception is base class
		} 
		catch (Exception e)
		{
			System.out.println("Exception while taking screenshot "+e.getMessage());
		}
		
	}

}
