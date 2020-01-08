package am.totogaming.pages.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.home.TotogamingHomePage;
import am.totogaming.pages.memberhomepage.MemberHomePage;

public class TotogamingLoginPage extends TotogamingHomePage {

	public TotogamingLoginPage(WebDriver driver) {
		super(driver);
	}
	
public final String USERNAME_XPATH="//div[@id='login_container']//input[@automation='email_input']";
	
	@FindBy(xpath=USERNAME_XPATH)
	WebElement usernameInput;
	
	public TotogamingHomePage enterUsername(String username) {
		usernameInput.sendKeys(username);
		return new TotogamingLoginPage(driver);
	}	

public final String PASSWORD_XPATH="//div[@id='login_container']//input[@automation='password_input']";
	
	@FindBy(xpath=PASSWORD_XPATH)
	WebElement passwordInput;
	
	public TotogamingHomePage enterPassword(String password) {
		passwordInput.sendKeys(password);
		return new TotogamingLoginPage(driver);
	}	
	
public final String LOGIN_BUTTON_XPATH="//div[@id='login_container']//button[@automation='login_button']";
	
	@FindBy(xpath=LOGIN_BUTTON_XPATH)
	WebElement loginButton;
	
	public TotogamingHomePage clickOnLoginButton() {
		loginButton.click();
		return new MemberHomePage(driver);
	}	
}
