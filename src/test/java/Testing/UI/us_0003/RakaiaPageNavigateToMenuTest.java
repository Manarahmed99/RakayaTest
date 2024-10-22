package Testing.UI.us_0003;

import Pages.HomePage;
import Pages.RakaiaPage;
import Testing.UI.UITestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class RakaiaPageNavigateToMenuTest  extends UITestBase {

    @Test
    @Step("Test navigation through Rakaia Page without going back")
    public void testRakaiaNavigation() {
        HomePage homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToRakayaPage();
        navigateToAllPages();

    }

    private void navigateToAllPages() {
        RakaiaPage rakaiaPage = new RakaiaPage(driver, bot, wait);

        rakaiaPage.clickAboutCompanyButton();
        wait.until(ExpectedConditions.urlContains("/rakaya"));

        rakaiaPage.clickOurPillarsButton();
        wait.until(ExpectedConditions.urlContains("/rakaya/our-pillars"));

        rakaiaPage.clickOurWorkButton();
        wait.until(ExpectedConditions.urlContains("/rakaya/our-work"));


        rakaiaPage.clickOurServicesButton();
        wait.until(ExpectedConditions.urlContains("/rakaya/our-services"));


        rakaiaPage.clickOurProductsButton();
        wait.until(ExpectedConditions.urlContains("/rakaya/our-products"));


        rakaiaPage.clickApplicationsButton();
        wait.until(ExpectedConditions.urlContains("/rakaya/applications"));


        rakaiaPage.clickFoundationsButton();
        wait.until(ExpectedConditions.urlContains("/rakaya/foundations"));


        rakaiaPage.clickAboutRakaiaButton();
        wait.until(ExpectedConditions.urlContains("/rakaya/feedbacks"));


        rakaiaPage.clickSessionsButton();
        wait.until(ExpectedConditions.urlContains("/rakaya/sessions"));



    }


}
