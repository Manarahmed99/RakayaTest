package Testing.UI.us_0001;

import Pages.HomePage;
import Testing.UI.UITestBase;

import io.qameta.allure.Step;
import org.testng.annotations.Test;


public class HomePageHeaderLinkTest extends UITestBase {

    @Step("Navigates through header links and verifies the functionality.")
    @Test(testName = "Navigates through header links and verifies the functionality.")
    public void testNavigatingThroughHeaderLinksTest() {
        HomePage homePage = new HomePage(driver, bot, wait);
        homePage.goTo();
        verifyRakayaPage(homePage);
        verifyRakayaStudioPage(homePage);
        verifyJobsPage(homePage);
        verifyOurWayPage(homePage);
        verifyContactUsPage(homePage);
    }

    private void verifyRakayaPage(HomePage homePage) {
        homePage.goToRakayaHeaderPage();
    }

    private void verifyRakayaStudioPage(HomePage homePage) {
        homePage.goToRakayaStudioHeaderPage();
    }

    private void verifyJobsPage(HomePage homePage) {
        homePage.goToJobHeaderPage();
    }

    private void verifyOurWayPage(HomePage homePage) {
        homePage.goToOurWayHeaderPage();
    }

    private void verifyContactUsPage(HomePage homePage) {
        homePage.goToContactUsHeaderPage();
    }




}
