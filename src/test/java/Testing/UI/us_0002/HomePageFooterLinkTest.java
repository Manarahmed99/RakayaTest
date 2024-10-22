package Testing.UI.us_0002;

import Testing.UI.UITestBase;

import Pages.HomePage;

import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class HomePageFooterLinkTest extends UITestBase {


    @Step("Navigates through footer links and verifies the functionality.")
    @Test(testName = "Navigates through footer links and verifies the functionality.")
    public void testNavigatingThroughFooterLinksTest() {
        HomePage homePage = new HomePage(driver, bot, wait);
        homePage.goTo();

        verifyRakayaFooterPage(homePage);
        verifyRakayaStudioFooterPage(homePage);
        verifyJobsFooterPage(homePage);
        verifyOurWayFooterPage(homePage);
        verifyContactUsFooterPage(homePage);
    }

    private void verifyRakayaFooterPage(HomePage homePage) {
        homePage.goToRakayaFooterPage();
    }

    private void verifyRakayaStudioFooterPage(HomePage homePage) {
        homePage.goToRakayaStudioFooterPage();
    }

    private void verifyJobsFooterPage(HomePage homePage) {
        homePage.goToJobsFooterPage();
    }

    private void verifyOurWayFooterPage(HomePage homePage) {
        homePage.goToOurWayFooterPage();
    }

    private void verifyContactUsFooterPage(HomePage homePage) {
        homePage.goToContactUsFooterPage();
    }

}
