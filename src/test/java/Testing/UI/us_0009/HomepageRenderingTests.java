package Testing.UI.us_0009;

import Pages.HomePage;
import Testing.UI.UITestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class HomepageRenderingTests extends UITestBase {

    private HomePage homePage;

    @BeforeMethod
    public void  HomepageRenderingTests() {
        homePage = new HomePage(driver, bot, wait);
        homePage.goTo();
    }

    @Step("Verify Homepage Renders Correctly on Edge")
    @Test(testName = "Verify Homepage Renders Correctly on Edge")
    public void testHomepageRendersCorrectlyOnEdge() {
       // homePage.goTo();
        assertTrue(driver.findElement(By.tagName("body")).isDisplayed(), "Body is not displayed on Edge.");
        assertTrue(homePage.isJobsButtonDisplayed(), "Expected button is not displayed on Edge.");
    }

    @Step("Verify Homepage Renders Correctly on Firefox")
    @Test(testName = "Verify Homepage Renders Correctly on Firefox")
    public void testHomepageRendersCorrectlyOnFirefox() {
        //homePage.goTo();
        assertTrue(driver.findElement(By.tagName("body")).isDisplayed(), "Body is not displayed on Firefox.");
        assertTrue(homePage.isJobsButtonDisplayed(), "Expected button is not displayed on Firefox.");
    }

    @Step("Verify Homepage Renders Correctly on Chrome")
    @Test(testName = "Verify Homepage Renders Correctly on Chrome")
    public void testHomepageRendersCorrectlyOnChrome() {
      //  homePage.goTo();
        assertTrue(driver.findElement(By.tagName("body")).isDisplayed(), "Body is not displayed on Chrome.");
        assertTrue(homePage.isJobsButtonDisplayed(), "Expected button is not displayed on Chrome.");
    }
}
