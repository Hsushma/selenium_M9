package actionsclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TolearnMouseHover
{
	@Test
	public static void mousehover() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		String tmps = LocalDateTime.now().toString().replace(":", "-");
		
		WebElement shopping=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		Actions act = new Actions(driver);
		act.moveToElement(shopping).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots"+tmps+".png");
		FileUtils.copyFile(temp, dest);
		 
		driver.manage().window().minimize();
		driver.quit();
	}

}
