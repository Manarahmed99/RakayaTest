package Testing.UI.us_0004;

import Pages.HomePage;
import Pages.JobsPage;
import Testing.UI.UITestBase;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JobsPageTest extends UITestBase {

    private HomePage homePage;

    private JobsPage  jobsPage;


    @Test(testName = "Test Navigation to Job Application via Header")
    @Step("Navigate to the Job Application page by clicking the header link")
    public void testGoToApplicationJobViaHeader() {

        homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToJobHeaderPage();

        jobsPage = new JobsPage(driver, bot, wait);
        jobsPage.clickApplicationHeader();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rakaya.sa/jobs/job-application");

    }

    @Test(testName = "Test Navigation to Job Application via Submit Button")
    @Step("Navigate to the Job Application page by clicking the submit button")
    public void testGoToApplicationJobViaSubmitButton() {
        homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToJobHeaderPage();

        jobsPage = new JobsPage(driver, bot, wait);
        jobsPage.clickSubmit();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rakaya.sa/jobs/job-application");

    }

    @Test(testName = "Verify navigation to Job Application Page by clicking the partner button")
    @Step("Navigate to the Job Application page by clicking the partner button")
    public void testGoToApplicationJobByClickingPartnerButton() {
        HomePage homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToPartnerPage();
        Assert.assertEquals(driver.getCurrentUrl(),"https://rakaya.sa/jobs/job-application");
    }





}
