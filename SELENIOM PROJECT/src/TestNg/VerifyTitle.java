package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle
{
	 //@Before Test // Test//After Test
	WebDriver driver;
	
	
	@BeforeTest
	public void StartApplication()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
@Test
public void VrifyFaceBookTitle()
{
	String ExpectedTitle ="Facebook - log in or sign up";
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	Assert.assertEquals(ActualTitle,ExpectedTitle);
	}
@AfterTest
public void CloseApplication()
{
	driver.close();
}
}
