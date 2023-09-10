package com.amazon.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;
import com.amazon.pages.SignIn;

import org.openqa.selenium.remote.RemoteWebDriver;
public class AccessingAmazonHoverOnMenue extends BaseStartApp 
{
	{
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		//ChromeOptions option = new ChromeOptions();
	//	option.addArguments("--remote-allow-origins=*");
		
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
	}
	@Test
	public void MouseHoveringOnSignOnPage()
	{
		
		LandingPage land = new LandingPage(driver);
		land .MethodOfHovering();
		//new section
		land.ClickOnSignIn();
		// today new section
		SignIn sign = new SignIn(driver);
		sign.filingIntoBox(dijagmail.com);
		sign.ClickOnBtn();
	
		
}
	
}
