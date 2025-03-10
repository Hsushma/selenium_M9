package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class iframe 
{
	@Test
	public static void demo() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/");
		String tstmp = LocalDateTime.now().toString().replace(":", "-");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,600)");
		driver.findElement(By.linkText("Go to maps")).click();
		
		WebElement area = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(area);
		
		WebElement view = driver.findElement(By.name("Montana"));
		view.click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp =ts .getScreenshotAs(OutputType.FILE);
		File pmt = new File("./Screenshots/"+tstmp+".png");
		FileUtils.copyFile(temp, pmt);
		driver.manage().window().minimize();
		driver.quit();
	}

}
