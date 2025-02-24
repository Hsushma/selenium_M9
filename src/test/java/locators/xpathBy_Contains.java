package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpathBy_Contains 
{
	public void demo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement username = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]"));
		username.sendKeys("sushma");
		driver.manage().window().minimize();
		driver.quit();
	}

}
