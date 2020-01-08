package am.totogaming.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;
import am.totogaming.pages.loginpage.TotogamingLoginPage;
import am.totogaming.pages.registration.TotogamingRegistrationPage;

public class TotogamingHomePage extends TotogamingBasePageObject{

	public TotogamingHomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public final String LOGO_XPATH="//div[contains(@class,'logo')]/a";
	
	@FindBy(xpath=LOGO_XPATH)
	WebElement logo;
	
	public TotogamingHomePage clickOnLogo() {
		logo.click();
		return new TotogamingHomePage(driver);
	}
	
public final String LOGINLINK_XPATH="//a[@automation='home_login_button']";
	
	@FindBy(xpath=LOGINLINK_XPATH)
	WebElement loginLink;
	
	public TotogamingHomePage clickOnLoginLink() {
		loginLink.click();
		return new TotogamingLoginPage(driver);
	}
	
public final String REGISTRATION_BUTTON_XPATH="//a[@class='registerDialog tl_register_button primBtn transBg']";
	
	@FindBy(xpath=REGISTRATION_BUTTON_XPATH)
	WebElement registrationButton;
	
	public TotogamingRegistrationPage clickOnRegistrationButton() {
		registrationButton.click();
		return new TotogamingRegistrationPage(driver);
	}	

}
