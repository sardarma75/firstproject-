package com.amazon.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseStartApp {
	WebDriver driver;
	@BeforeTest
	   public void startApp() 
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
		}
	
		   @AfterTest
			public void CloseApp()
			{
				//driver.close();
				}
			
	   }

	
