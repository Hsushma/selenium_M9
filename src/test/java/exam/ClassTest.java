package exam;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTest 
{
	@Test
	public static void demo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,6000)");
		
		driver.findElement(By.xpath("(//a[text()='Hyderabad to Bangalore Bus'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		WebElement tourcheckbox = driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']/..//input[@class='primary  ']"));
		
		tourcheckbox.click();
		System.out.println(tourcheckbox.isSelected());
	
		List<WebElement> price = driver.findElements(By.tagName("strong"));
		for (WebElement ele : price) 
		{
			System.out.println(ele.getText());
		}
		
	}
}
