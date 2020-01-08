package am.totogaming.home;

import org.testng.annotations.Test;

import am.totogaming.base.TotogamingBaseTest;
import am.totogaming.pages.home.TotogamingHomePage;

public class TotogamingHomePageTest extends TotogamingBaseTest{
		
	@Test
	public void loginLinkFunctionalityTest() {
		TotogamingHomePage home = new TotogamingHomePage(driver);
		home = home.clickOnLoginLink();
	}
}
