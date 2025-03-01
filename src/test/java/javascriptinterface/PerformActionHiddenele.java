package javascriptinterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PerformActionHiddenele 
{
	@Test
	public static void hiddenelement()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//java script click without using submit() and click()
		
		WebElement custm = driver.findElement(By.xpath("//label[text()='Custom']"));
		js.executeScript("arguments[0].click()", custm);
		
		WebElement hiddenelem = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		js.executeScript("arguments[0].value='hello selenium'", hiddenelem);
	}
}
