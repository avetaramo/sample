package am.totogaming.registration;

import am.totogaming.base.TotogamingBaseTest;
import am.totogaming.pages.home.TotogamingHomePage;
import am.totogaming.pages.memberhomepage.MemberHomePage;
import am.totogaming.pages.registration.TotogamingRegistrationPage;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.Assert;
import org.testng.annotations.*;

public class TotogamingRegistrationTest extends TotogamingBaseTest{

	@Test(priority=1)
	public void registrationTest() throws InterruptedException {
		TotogamingHomePage home = new TotogamingHomePage(driver);
		TotogamingRegistrationPage registration=home.clickOnRegistrationButton();
		
		//Step1
		//registration = new TotogamingRegistrationPage(driver);
		Thread.sleep(2000);
		registration=registration.enterFirstName("Poghos");
		registration=registration.enterLastName("Petrosyan");
		Thread.sleep(2000);
		registration=registration.clickOnSelectDate();
		registration=registration.selectMonthFromDropdown();
		registration=registration.selectYearFromDropdown();
		registration=registration.selectDayFromCalendar();
		Thread.sleep(2000);
		registration=registration.clickOnCountryDropdown();
		registration=registration.selectCountryFromDropdown();
		registration=registration.clickOnContinueButton();
		
		//Step2
		Thread.sleep(2000);
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		registration=registration.enterUsername("poghospetros"+rand);
		registration=registration.enterEmailAddress("poghospetros"+rand+"@gmail.com");
		registration=registration.enterMobileNumber("99"+rand+"456");
		registration=registration.enterPassportNumber(rand+"AB"+rand);
		registration=registration.enterPassword("pass123456");
		registration=registration.confirmPassword("pass123456");
		registration=registration.clickOnCheckbox();
		//Thread.sleep(10000);
		//registration=registration.clickOnCaptcha();
		Thread.sleep(100000);
		registration=registration.clickOnContinueButton();

		//Step3		
		registration=registration.clickOnCompleteButton();
		MemberHomePage logout = registration.clickOnAccountDialogCloseButton();
		
		//Step4
		Thread.sleep(2000);
		logout=logout.clickOnMemberMenuDropdown();
		logout=logout.clickOnLogout();
		Assert.assertFalse(logout.verifyElementExists(MemberHomePage.LOGOUT_XPATH, "the logout icon not visible"));
			
	}
}
