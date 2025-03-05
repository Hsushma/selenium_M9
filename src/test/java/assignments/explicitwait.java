package assignments;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicitwait 
{
	@Test
	public static void explicit() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")).click();
		
		String tmstmp = LocalDateTime.now().toString().replace(":", "-");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement message = driver.findElement(By.xpath("//p[@class='content']"));
		
		wait.until(ExpectedConditions.visibilityOf(message));
		
		File temp = message.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+tmstmp+".png");
		FileUtils.copyFile(temp, dest);
	}

}
