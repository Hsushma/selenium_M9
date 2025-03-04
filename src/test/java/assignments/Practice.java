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
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice 
{
	@Test
	public static void demo() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		String tstmp = LocalDateTime.now().toString().replace(":", "-");
		
		WebElement caddcartbtn = driver.findElement(By.xpath("//span[text()='ROADSTER']/../..//button[@id='addToCart']"));
		caddcartbtn.click();
		List<WebElement>allimgaes = driver.findElements(By.tagName("img"));//to count how many images are there in that page
		System.out.println(allimgaes.size());
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File pmt = new File("./Screenshots/"+tstmp+".png");
		FileUtils.copyFile(temp, pmt);
		driver.manage().window().minimize();
		driver.quit();
		
	}
	
	

}
