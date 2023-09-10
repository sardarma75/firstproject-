package com.amazon.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProducts 
{
	Action action;
   @FindBy(linkText= "Laptop&Accessories")
   private WebElement ClickOnLaptopAndAccesories;
   @FindBy(linkText = "Apple")
   private WebElement ClickOnApple;
   
   public  AllProducts(WebDriver driver)
   {
	   PageFactory.initElements(driver ,this);
	   action = new actions(driver);
   }
   public void HoverOnLaptopAndAccessories()
   {
   action.movetoElements(ClickOnLaptopAndAccesories).build().perform();
   public void ClickOnAppleLink1()
   {
	   
   
   }
public void ClickOnAppleLink() 
{
	
	// TODO Auto-generated method stub
	
}
}
   

