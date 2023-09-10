package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTestCaseInTestng 
{
     WebDriver driver;
     @BeforeTest
     public void StartApplication()
     {
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.facebook.com/");
    	 
     }
     @Test
     public void verifyTestng()
     {
    	 String ExpectedTitle="Facebook - log in or sign up";
    	 String ActualTitle = driver.getTitle();
    	 Assert.assertEquals(ActualTitle, ExpectedTitle);
    	 
     }
     @Test
     public void FBloginPage()
     {
    		driver.findElement(By.id("email")).Sendkeys(uhuiaejfhfi); 
        	driver.findElement(By.id("pass")).Sendkeys(hshyej14jfjf);
        	driver.findElement(By.id("loginButton")).click();
     }
     
     @AfterTest
     public void CloseAplication() 
     {
    	driver.close();
     }
     
}
