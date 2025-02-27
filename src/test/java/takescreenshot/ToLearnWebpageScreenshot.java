package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ToLearnWebpageScreenshot 
{
	@Test
	public static void screenshot() throws IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		LocalDateTime.now().toString().replace(":", "-");
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/image.png");
		//FileHandler.copy(temp, dest);
		FileUtils.copyFile(temp, dest);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
