package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearngetwindowHandle 
{
	@Test
	public static void getwindowmethod()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		String singlewindow = driver.getWindowHandle();
		System.out.println(singlewindow);
		driver.manage().window().minimize();
		driver.quit();
	}
}
