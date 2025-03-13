package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToLearngetOption 
{
	@Test
	public static void multiselect() 
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select sltyear = new Select(yeardropdown);
		List<WebElement> alloptions = sltyear.getOptions();
		System.out.println(sltyear.getOptions().size());
		for (WebElement ap : alloptions) 
		{
			System.out.print(ap.getText()+" ");
		}
	}
}
