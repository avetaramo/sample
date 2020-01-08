package am.totogaming.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TotogamingBasePageObject {

		protected WebDriver driver;
		
		public TotogamingBasePageObject(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(this.driver, this);
		}
		
		public void waitForElementPresent(String xPath) {
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
		    
		}
		
		public void waitForElementClickable(String xPath) {
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
		    
		}
		
		public boolean verifyElementExists(String xPath, String message) {
			boolean result = false;
			try {
				driver.findElement(By.xpath(xPath));
				result = true;			
				}
			catch(NoSuchElementException ex) {
				//Assert.assertFalse(result, message);
			}
			return result;
		}
}
