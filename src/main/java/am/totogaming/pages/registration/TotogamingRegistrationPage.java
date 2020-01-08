package am.totogaming.pages.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;
import am.totogaming.pages.home.TotogamingHomePage;
import am.totogaming.pages.memberhomepage.MemberHomePage;



public class TotogamingRegistrationPage extends TotogamingBasePageObject {

	public TotogamingRegistrationPage(WebDriver driver) {
		super(driver);
	}
	

public final String FIRST_NAME_XPATH="//input[@automation='firstname_input']";
	
	@FindBy(xpath=FIRST_NAME_XPATH)
	WebElement firstNameInput;
	
	public TotogamingRegistrationPage enterFirstName(String firstName) {
		waitForElementPresent(FIRST_NAME_XPATH);
		firstNameInput.sendKeys(firstName);
		return new TotogamingRegistrationPage(driver);
	}	
	
public final String LAST_NAME_XPATH="//input[@automation='lastname_input']";
	
	@FindBy(xpath=LAST_NAME_XPATH)
	WebElement lastNameInput;
	
	public TotogamingRegistrationPage enterLastName(String lastName) {
		waitForElementPresent(LAST_NAME_XPATH);
		lastNameInput.sendKeys(lastName);
		return new TotogamingRegistrationPage(driver);
	}	

public final String BIRTHDATE_INPUT_XPATH="//input[@automation='birthdate_input']";
	
	@FindBy(xpath=BIRTHDATE_INPUT_XPATH)
	WebElement birthdateInput;
	
	public TotogamingRegistrationPage clickOnSelectDate() {
		waitForElementClickable(BIRTHDATE_INPUT_XPATH);
		birthdateInput.click();
		return new TotogamingRegistrationPage(driver);
	}
	
public final String SELECT_YEAR_XPATH="//select[@data-handler='selectYear']/option[@value='1991']";
	
	@FindBy(xpath=SELECT_YEAR_XPATH)
	WebElement selectYear;
	
	public TotogamingRegistrationPage selectYearFromDropdown() {
		waitForElementClickable(SELECT_YEAR_XPATH);
		selectYear.click();
		return new TotogamingRegistrationPage(driver);
	}
	
public final String SELECT_MONTH_XPATH="//select[@data-handler='selectMonth']/option[@value='4']";
	
	@FindBy(xpath=SELECT_MONTH_XPATH)
	WebElement selectMonth;
	
	public TotogamingRegistrationPage selectMonthFromDropdown() {
		waitForElementClickable(SELECT_MONTH_XPATH);
		selectMonth.click();
		return new TotogamingRegistrationPage(driver);
	}
	
public final String SELECT_DAY_XPATH="//td[@data-handler='selectDay']/a[text()='17']";
	
	@FindBy(xpath=SELECT_DAY_XPATH)
	WebElement selectDay;
	
	public TotogamingRegistrationPage selectDayFromCalendar() {
		waitForElementClickable(SELECT_DAY_XPATH);
		selectDay.click();
		return new TotogamingRegistrationPage(driver);
	}
	
public final String COUNTRY_DROPDOWN_XPATH="//*[@id='custom_CountryCode']";
	
	@FindBy(xpath=COUNTRY_DROPDOWN_XPATH)
	WebElement countryDropdown;
	
	public TotogamingRegistrationPage clickOnCountryDropdown() {
		waitForElementClickable(COUNTRY_DROPDOWN_XPATH);
		countryDropdown.click();
		return new TotogamingRegistrationPage(driver);
	}
	
public final String COUNTRY_XPATH="//ul[@data-id='CountryCode']//li[@rel='1377']";
	
	@FindBy(xpath=COUNTRY_XPATH)
	WebElement selectCountry;
	
	public TotogamingRegistrationPage selectCountryFromDropdown() {
		waitForElementClickable(COUNTRY_XPATH);
		selectCountry.click();
		return new TotogamingRegistrationPage(driver);
	}
	
public final String CONTINUE_BUTTON_XPATH="//*[@id='continue_btn']";
	
	@FindBy(xpath=CONTINUE_BUTTON_XPATH)
	WebElement continueButton;
	
	public TotogamingRegistrationPage clickOnContinueButton() {
		waitForElementClickable(CONTINUE_BUTTON_XPATH);
		continueButton.click();
		return new TotogamingRegistrationPage(driver);
	}
		
public final String USERNAME_XPATH="//input[@automation='username_input']";
	
	@FindBy(xpath=USERNAME_XPATH)
	WebElement usernameInput;
	
	public TotogamingRegistrationPage enterUsername(String username) {
		waitForElementPresent(USERNAME_XPATH);
		usernameInput.sendKeys(username);
		return new TotogamingRegistrationPage(driver);
	}
	
public final String EMAIL_XPATH="//input[@automation='email_input']";
	
	@FindBy(xpath=EMAIL_XPATH)
	WebElement emailInput;
	
	public TotogamingRegistrationPage enterEmailAddress(String email) {
		waitForElementPresent(EMAIL_XPATH);
		emailInput.sendKeys(email);
		return new TotogamingRegistrationPage(driver);
	}
	
public final String MOBILE_NUMBER_XPATH="//input[@automation='mobile_input']";
	
	@FindBy(xpath=MOBILE_NUMBER_XPATH)
	WebElement mobileNumberInput;
	
	public TotogamingRegistrationPage enterMobileNumber(String mobile_number) {
		waitForElementPresent(MOBILE_NUMBER_XPATH);
		mobileNumberInput.sendKeys(mobile_number);
		return new TotogamingRegistrationPage(driver);
	}
	
public final String PASSPORT_NUMBER_XPATH="//input[@automation='passportnumber_input']";
	
	@FindBy(xpath=PASSPORT_NUMBER_XPATH)
	WebElement passportNumberInput;
	
	public TotogamingRegistrationPage enterPassportNumber(String passportNumber) {
		waitForElementPresent(PASSPORT_NUMBER_XPATH);
		passportNumberInput.sendKeys(passportNumber);
		return new TotogamingRegistrationPage(driver);
	}
	
public final String PASSWORD_XPATH="//input[@automation='password_input']";
	
	@FindBy(xpath=PASSWORD_XPATH)
	WebElement passwordInput;
	
	public TotogamingRegistrationPage enterPassword(String password) {
		waitForElementPresent(PASSWORD_XPATH);
		passwordInput.sendKeys(password);
		return new TotogamingRegistrationPage(driver);
	}
	
public final String CONFIRM_PASSWORD_XPATH="//input[@automation='confirmpassword_input']";
	
	@FindBy(xpath=CONFIRM_PASSWORD_XPATH)
	WebElement confirmPasswordInput;
	
	public TotogamingRegistrationPage confirmPassword(String password) {
		waitForElementPresent(CONFIRM_PASSWORD_XPATH);
		confirmPasswordInput.sendKeys(password);
		return new TotogamingRegistrationPage(driver);
	}	
	
public final String CHECKBOX_XPATH="//div[@class='checkbox_item']";
	
	@FindBy(xpath=CHECKBOX_XPATH)
	WebElement checkbox;
	
	public TotogamingRegistrationPage clickOnCheckbox() {
		waitForElementClickable(CHECKBOX_XPATH);
		checkbox.click();
		return new TotogamingRegistrationPage(driver);
	}
			
public final String CAPTCHA_XPATH="//span[@id='recaptcha-anchor']/div[1]";
	
	@FindBy(xpath=CAPTCHA_XPATH)
	WebElement captcha;
	
	public TotogamingRegistrationPage clickOnCaptcha() {
		waitForElementClickable(CAPTCHA_XPATH);
		captcha.click();
		return new TotogamingRegistrationPage(driver);
	}
	
public final String COMPLETE_BUTTON_XPATH="//a[@id='complete_btn']";
	
	@FindBy(xpath=COMPLETE_BUTTON_XPATH)
	WebElement completeButton;
	
	public TotogamingRegistrationPage clickOnCompleteButton() {
		waitForElementClickable(COMPLETE_BUTTON_XPATH);
		completeButton.click();
		return new TotogamingRegistrationPage(driver);
	}
	
public final String ACCOUNT_DIALOG_X_BUTTON_XPATH="//div[@class='tl_head_close dont-shrink']";
	
	@FindBy(xpath=ACCOUNT_DIALOG_X_BUTTON_XPATH)
	WebElement accountDialogCloseButton;
	
	public MemberHomePage clickOnAccountDialogCloseButton() {
		waitForElementPresent(ACCOUNT_DIALOG_X_BUTTON_XPATH);
		accountDialogCloseButton.click();
		return new MemberHomePage(driver);
	}
	
	
}
