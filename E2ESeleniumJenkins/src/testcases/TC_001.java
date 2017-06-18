package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	@Test
	public void testcase1(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElementByName("q").sendKeys("Selenium");
		driver.quit();
		//driver.quit();
	}

}
