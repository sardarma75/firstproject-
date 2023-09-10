package TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// first test case is to check the title of the web page?
//step 1: open the browser
//step 2: goto htpp://www.facebook.com/page
//step 3:  
public class FirstTestCase {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String ExpectedTitle="Facebook - log in or sign up";
		String ActualTitle=driver.getTitle();
		
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("TestCase : Pass");
		}
		else
		{
			System.out.println("TestCase : Fail");
		}
		driver.close();
		
	}

}
