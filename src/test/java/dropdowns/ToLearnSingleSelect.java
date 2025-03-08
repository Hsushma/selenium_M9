package dropdowns;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToLearnSingleSelect 
{
	@Test
	public static void iframes() throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		//String tstmp = LocalDateTime.now().toString().replace(":", "-");
		
		WebElement daydropdown = driver.findElement(By.xpath("//select[@id='day']"));
		Select slctday = new Select(daydropdown);
		slctday.selectByIndex(11);
		
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@id='month']"));
		Select slctmonth = new Select(monthdropdown);
		slctmonth.selectByValue("11");
		
		WebElement yearropdown = driver.findElement(By.xpath("//select[@id='year']"));
		Select slctyear = new Select(yearropdown);
		slctyear.selectByVisibleText("1998");
		driver.manage().window().minimize();
		driver.quit();
	}
}
