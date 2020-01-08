package am.totogaming.pages.memberhomepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.home.TotogamingHomePage;

public class MemberHomePage extends TotogamingHomePage {

	public MemberHomePage(WebDriver driver) {
		super(driver);
	}
	
public final String MEMBER_MENU_DROPDOWN_XPATH="//div[@class='dropdown tl_acc_userid flex tern transBg transferDropdown']//a[@class='flex dropdown-menu']";
	
	@FindBy(xpath=MEMBER_MENU_DROPDOWN_XPATH)
	WebElement memberMenuDropdown;
	
	public MemberHomePage clickOnMemberMenuDropdown() {
		waitForElementClickable(memberMenuDropdown);
		memberMenuDropdown.click();
		return new MemberHomePage(driver);
	}
	
public final static String LOGOUT_XPATH="//a[@href='/Account/LogOut']";
	
	@FindBy(xpath=LOGOUT_XPATH)
	WebElement logout;
	
	public MemberHomePage clickOnLogout() {
		logout.click();
		return new MemberHomePage(driver);
	}
	
		
}
