package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmationPopup 
{
	@Test
	public static void javascriptPopup() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//driver.switchTo().alert().accept();
		
		Alert popup = driver.switchTo().alert();
		popup.accept();
		System.out.println(popup.getText());
		popup.accept();
	}
}
