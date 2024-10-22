package Testing.UI.us_0001;

import Pages.HomePage;
import Testing.UI.UITestBase;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageHeaderLogoTest extends UITestBase {

    @Step("Verify navigation to Rakaya Home Page by clicking the logo")
    @Test (testName ="User should be navigated to the homepage when clicking the logo")
    private void testVerifyNavigationToHomePageByClickingLogo() {
        HomePage Logo = new HomePage(driver, bot, wait);
        Logo.goTo().clickLogoToNavigateToHomePage();
        Assert.assertEquals(driver.getCurrentUrl(), Logo.homePageUrl);
    }
}
