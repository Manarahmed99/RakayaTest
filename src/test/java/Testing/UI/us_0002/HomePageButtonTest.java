package Testing.UI.us_0002;

import Pages.HomePage;
import Testing.UI.UITestBase;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageButtonTest extends UITestBase {

    @Step("Verify navigation to Rakaya Page by clicking the Rakaya button")
    @Test(testName = "Verify navigation to Rakaya Page")
    public void testVerifyNavigationToRakayaPageByClickingButton() {
        HomePage homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToRakayaPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://rakaya.sa/rakaya");
    }

    @Step("Verify navigation to Jobs Page by clicking the 'اضغط للمزيد' button")
    @Test(testName = "Verify navigation to Jobs Page")
    public void testVerifyNavigationToJobsPageByClickingButton() {
        HomePage homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToJobsPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://rakaya.sa/jobs");
    }
}
