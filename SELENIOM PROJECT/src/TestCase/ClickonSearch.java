package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonSearch {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jhgghjjf");
		driver.findElement(By.id("pass")).sendKeys("cvkjhghh");
		driver.findElement(By.xpath("(//div[contains(@class,'_6ltg')][1]")).click();
		
		driver.findElement(By.linkText("Forget password?")).click();
		
		driver.findElement(By.id("identify_email")).sendKeys("jhon");
	}

}
