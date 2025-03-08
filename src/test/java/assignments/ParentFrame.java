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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParentFrame 
{
	@Test
	public static void iframes() throws IOException 
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
		
		WebElement nd = driver.findElement(By.name("North Dakota"));
		nd.click();
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("sushmaprabhu@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sush@123");
		driver.findElement(By.xpath("//input[@id='cpass']")).sendKeys("sush@123");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sushma");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("prabhu");
		
		WebElement typedrop = driver.findElement(By.xpath("//label[text()='User Type ']"));
		Select slt = new Select(typedrop);
		slt.selectByVisibleText("Academic");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp =ts .getScreenshotAs(OutputType.FILE);
		File pmt = new File("./Screenshots/"+tstmp+".png");
		FileUtils.copyFile(temp, pmt);
		driver.manage().window().minimize();
		driver.quit();
	}
}
