package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToLearngetAllaselected 
{
	@Test
	public static void getallselectedoptions()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///E:/multiSelect.html");
		
		WebElement cardropdown = driver.findElement(By.id("cars"));
		Select carslct = new Select(cardropdown);
		//carslct.selectByIndex(0);
		//carslct.selectByIndex(1);
		carslct.selectByIndex(2);
		
		//System.out.println(carslct.getFirstSelectedOption().getText());
		List<WebElement> alloptions = carslct.getAllSelectedOptions();
		System.out.println(alloptions.size());
		for (WebElement el : alloptions) 
		{
			System.out.println(el.getText());
		}
		
		//is multiple
		System.out.println(carslct.isMultiple());
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
