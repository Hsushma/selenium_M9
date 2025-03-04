package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnExplicitlyWait
{
	@Test
	public static void demo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/23");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("564321");
		WebElement checkbtn = driver.findElement(By.xpath("//button[@id='Check']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkbtn));
		checkbtn.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
