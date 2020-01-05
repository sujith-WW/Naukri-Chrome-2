package com.assertions;

import org.openqa.selenium.WebDriver;

public class Asserts {
private static final WebDriver driver = null;
	//validating page URL
	//static- any one can call this methods just by class name,no need to create object of that class
	public static boolean validatePagesURL(WebDriver driver,String expURL)
	{
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			flag=true;
		}
		return flag;
	} 
	//validating Page Tile
	public static boolean validatePageesTitle(WebDriver driver, String expTitle)
	{
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			flag=true;
		}
		return flag;
	}
	//like this we can create any number assertions
	public static void validatePagesTitle(boolean contains, String expTitle) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			flag=true;
		}
		return;
	}
	public static boolean validatePagesURL(String actual, String expected) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expected))
		{
			flag=true;
		}
		return flag;
	}
}

