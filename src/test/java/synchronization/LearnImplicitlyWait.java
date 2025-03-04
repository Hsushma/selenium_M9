package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnImplicitlyWait 
{
	@Test
	public static void implicitwait()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		//driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		//find elements
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		driver.manage().window().minimize();
		driver.quit();
	}
		

}
