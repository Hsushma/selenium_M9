package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AllertPopUp 
{
	@Test
	public static void javascriptPopup() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		//driver.switchTo().alert().accept();
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
	}
}
