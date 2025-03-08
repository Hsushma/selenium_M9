package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToLearnmultiSelect 
{
	@Test
	public static void multiselect() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///E:/multiSelect.html");
		
		WebElement cardropdown = driver.findElement(By.id("cars"));
		Select carslct = new Select(cardropdown);
		carslct.selectByVisibleText("Benz");
		carslct.selectByVisibleText("Ferari");
		carslct.selectByVisibleText("Lambirgini");
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
