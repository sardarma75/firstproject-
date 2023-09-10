package com.amazon.testscript;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.amazon.pages.AllProducts;
import com.amazon.pages.BuyNow;
import com.amazon.pages.LandingPage;

@Test
public class BuyingMobilePhon extends BaseStartApp

{
public  void BuyingMobileFromAmazon()
{
LandingPage mobile = new LandingPage(driver);
mobile.ClickOnMOBILE();

AllProducts hover = new AllProducts(driver);
hover.HoverOnLaptopAndAccessories();
hover.ClickOnAppleLink();
ChargerOfApple charger = new ChargerOfApple(driver);
charger. clickOnFirstCard();
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));
BuyNow buy = new BuyNow(driver);
buy.clickOnbuyNowBtn();
}
}