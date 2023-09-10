package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage 
{
	Actions action;
	
	@FindBy(id="nav-tools")
	private WebElement clickSign;
	@FindBy(linkText="signIn")
	private WebElement signIn;
	@FindBy(linkText="Mobiles")
	private WebElement ClickOnMobile;
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	    action = new Actions(driver);
	}
	public void MethodOfHovering()
	{
		 action.moveToElement(clickSign).build().perform();
	  
	}
	public void ClickOnSignIn()
	{
		signIn.click();
	}
	//clicking on mobile menue
	public void ClickOnMOBILE()
	{
		 ClickOnMobile.click();
	}
	
	
	
}
