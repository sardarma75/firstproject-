package TestCase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
     /*
      * 1(open the browser
      * 2(maximize the browser
      * 3(go to facebook login page
      * 4(enter a valid username
      * 5(Enter a random password
      * 6(Click on login botton
      * 7(verify the user and see the error msg
      * 8close the browser
      */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sardar1254");
		driver.findElement(By.id("pass")).sendKeys("absgd6524");
		Thread.sleep(1000);
		//driver.findElement(By.id("u_0_5_wJ")).click();
		driver.findElement(By.name("login")).click();
		String ExpectedErrorMsg="The email or mobile number you entered isn’t connected to an account. Find your account and log in";
		String ActualErrorMsg=driver.findElement(By.cssSelector("_9ay7")).getText();
		if(ExpectedErrorMsg.equals(ActualErrorMsg))
		{
			System.out.println("TestCase 01 :pass");
		}
		else
		{
			System.out.println("TestCase 01 :Fail");
		}
		
		//_9ay7
	

	}

}
