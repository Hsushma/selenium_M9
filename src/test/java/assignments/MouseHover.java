package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover 
{
	@Test
	public static void mousehover() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		String tstmp = LocalDateTime.now().toString().replace(":", "-");
		
		WebElement homefurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions act = new Actions(driver);
		act.moveToElement(homefurniture).perform();
		
		WebElement kitchendining=driver.findElement(By.xpath("//a[text()='Kitchen & Dining']"));
		act.moveToElement(kitchendining).perform();
		
		WebElement cookware=driver.findElement(By.xpath("//a[text()='Cookware']"));
		act.click(cookware).perform();
		
		WebElement popular=driver.findElement(By.xpath("//h2[text()='Popular Types of Cookware']"));
		act.scrollToElement(popular).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots"+tstmp+".png");
		FileUtils.copyFile(temp, dest);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement ele : allLinks) 
		{
			System.out.println(ele.getText());
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
