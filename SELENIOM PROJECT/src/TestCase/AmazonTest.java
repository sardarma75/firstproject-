package TestCase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonTest {

	public static void main(String[] args) 
	{
		//1- open browser 
		//2- max it
		//3- goto amazon 
		//4- type something on search box 
		//5- click on search button
		//c
		System.setProperty("webdriver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Read with pride")).click();

	}

}
