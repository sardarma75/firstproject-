package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PushNotificationTestCase {

	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		
		ChromeOptions Option =new ChromeOptions();
		option.addArguments("--disable -notifications");
	
		WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	
	

	}

}
