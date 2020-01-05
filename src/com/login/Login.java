package com.login;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	/**
	 * @param args
	 * @param r 
	 * @param i 
	 * @param SECONDS 
	 * @throws InterruptedException 
	 */
	  public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver",".//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://lscr.com/");
		
		//click on Sign in
		driver.findElement(By.xpath("//html//body//div[1]//div[3]//div[2]//div//ul//li[2]//a")).click();
		
		//name
		driver.findElement(By.cssSelector("#usernameSignin")).sendKeys("sujithreddy1991@redifmail.com");
		
		//password
		driver.findElement(By.cssSelector("#passwordSignin")).sendKeys("Qw@12345678");
		
		//submit button
		driver.findElement(By.id("submitSignup")).click();
		
		//wait for 5000 seconds
		Thread.sleep(5000);
		
	
		//search by city
		driver.findElement(By.cssSelector("#search_city")).sendKeys("kansas");
		
		//search
		driver.findElement(By.id("searchPropertySubmit")).click();
		
		//refresh
		driver.navigate().refresh();
		
		
		//click on view
		//driver.findElement(By.xpath("//html//body//div[2]//div[1]//div//div//div[1]//div[3]//div[2]//div[4]//div//div[2]//div[1]//div//div//div[4]//a[2]")).click();
		
		//click on downtown logistics center
		//driver.findElement(By.xpath("//html//body//div[2]//div[1]//div//div//div[1]//div[3]//div[2]//div[4]//div//div[2]//div[1]//div//div//div[4]//a[2]")).click();
		
		
		//click on view button
		//driver.findElement(By.xpath("//html//body//div[2]//div[1]//div//div//div[1]//div[3]//div[2]//div[4]//div//div[2]//div[1]//div//div//div[4]//a[2]")).click();
		
		//refresh
		driver.navigate().refresh();
	
		driver.findElement(By.xpath("//html//body//div[1]//div[2]//div//ul//li[2]//a")).click();
		
		Thread.sleep(1000);
		
		//close browser
	driver.quit();
	
     
		
		
	}

		}


