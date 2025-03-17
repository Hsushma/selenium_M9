package actionsclass;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop 
{
	@Test
	public static void draganddrop() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions act =new Actions(driver); 
		
		WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoframe);
		
		WebElement photo1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		act.dragAndDrop(photo1, dest).perform();
		
		WebElement photo2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		act.dragAndDrop(photo2, dest).perform();
	
		driver.manage().window().minimize();
		driver.quit();
	}
}
