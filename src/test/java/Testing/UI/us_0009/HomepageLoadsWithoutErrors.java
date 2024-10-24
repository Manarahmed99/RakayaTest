package Testing.UI.us_0009;

import Pages.HomePage;
import Testing.UI.UITestBase;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomepageLoadsWithoutErrors extends UITestBase {

    @Step("Verifying that the homepage loads without errors.")
    @Test(testName = "Verify Homepage Loads Without Errors")
    public void testHomepageLoadsWithoutErrors() {
        HomePage homePage = new HomePage(driver, bot, wait);
        homePage.goTo();

        // Verify HTTP response code
        assertEquals(200, getResponseCode(driver.getCurrentUrl()), "The homepage did not load successfully.");


    }

    private int getResponseCode(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            return connection.getResponseCode();
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Return -1 in case of an exception
        }
    }
}
