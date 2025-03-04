package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearnElementScreenshot
{                	
	@Test
	public static void elementscreenshot() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String tmstmp=LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://demowebshop.tricentis.com/login");
		//WebElement emailtxtField = driver.findElement(By.id("Email"));
		
		File temp=driver.findElement(By.xpath("//strong[text()='Returning Customer']/../..")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+tmstmp+".png");
		FileUtils.copyFile(temp, dest);
		driver.manage().window().minimize();
		driver.quit();

	}
	
}
