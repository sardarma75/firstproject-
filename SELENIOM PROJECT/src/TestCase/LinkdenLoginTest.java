package TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkdenLoginTest {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.linkdin.com/login");
        driver .findElement(By.id("username")).sendKeys("jdfshkfd");
        driver .findElement(By.id("password")).sendKeys("shdgdjjsk");
		driver .findElement(By.xpath("//div[contains(@class,'login_form_action_container'"));
	}

}
