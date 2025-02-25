package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearnisSelected 
{
	@Test
	public static void demo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement check = driver.findElement(By.xpath("//label[text()='Remember me?']/..//input[@id='RememberMe']"));
		System.out.println(check.isSelected());
		System.out.println("After select");
		check.click();
		System.out.println(check.isSelected());
		driver.manage().window().minimize();
		driver.quit();
	}

}
