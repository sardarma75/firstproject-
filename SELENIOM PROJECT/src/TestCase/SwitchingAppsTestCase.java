package TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class SwitchingAppsTestCase {

	public static void main(String[] args)
	{
		
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com");
       driver.findElement(By.linkText("Instagram")).click();
       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
       String instagramTab =tabs.get(1);
       driver.switchTo().window(instagramTab);
       
 
	}

}
