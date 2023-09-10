package TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHovering {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	
		//WebElement hover =driver.findElement(By.linkText("Hello, sign in"));
		//nav-tools
		WebElement hover =driver.findElement(By.id("nav-tools"));
		 Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		driver.findElement(By.linkText("Sign in")).click();
		
	}

}
