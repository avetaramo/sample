package am.totogaming.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TotogamingBaseTest {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://totogaming.am");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void cleanup() {
		driver.quit();
	}
	
}
