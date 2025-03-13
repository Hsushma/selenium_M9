package assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RepeatavlySelect 
{
	@Test
	public static void iframes() throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//select one by one month 
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@id='month']"));
		Select slctmonth = new Select(monthdropdown);
		System.out.println(slctmonth);
		
		
		//select the end year
		WebElement yeardropdown=driver.findElement(By.xpath("//select[@id='year']"));
		Select slctyear = new Select(yeardropdown);
		
		
	}
}
