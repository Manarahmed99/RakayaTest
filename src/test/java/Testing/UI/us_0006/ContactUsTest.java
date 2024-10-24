package Testing.UI.us_0006;

import Pages.ContactUsPage;
import Pages.HomePage;
import Testing.UI.UITestBase;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactUsTest extends UITestBase {

    private HomePage homePage;
    private ContactUsPage contactUs;



    @Test(testName = "Test Submit Form with All Fields Empty")
    @Step("Testing submission of form with all fields empty")
    public void testSubmitFormWithAllFieldsEmpty() {
        homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToContactUsHeaderPage();

        contactUs = new ContactUsPage(driver, bot, wait);
        contactUs.clickSubmitButton();

        // Assert that required field errors are displayed
        assertTrue(contactUs.isNameErrorDisplayed(), "Name field error message should be displayed.");
        assertTrue(contactUs.isEmailErrorDisplayed(), "Email field error message should be displayed.");
        assertTrue(contactUs.isPhoneErrorDisplayed(), "Phone field error message should be displayed.");
        assertTrue(contactUs.isMessageErrorDisplayed(), "Message field error message should be displayed.");
    }

    @Test(testName = "Test Submit Form with All Fields Filled Correctly")
    @Step("Testing submission of form with all fields filled correctly")
    public void testSubmitFormWithAllFieldsFilledCorrectly() {
        homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToContactUsHeaderPage();

        contactUs = new ContactUsPage(driver, bot, wait);
        contactUs.enterName("منار أحمد العبدلي");
        contactUs.enterEmail("test@gmail.com");
        contactUs.enterPhone("556141790");
        contactUs.enterMessage("هذا اختبار لنموذج اتصل بنا.");
        contactUs.selectHelp("سؤال");
        contactUs.clickSubmitButton();


        assertTrue(contactUs.isDisplayedSuccessMessage(), "تم استلام طلبك بنجاح! نقدّر اهتمامك بالانضمام إلينا");
    }

    @Test(testName = "Test Submit Form with Dropdown Left Empty")
    @Step("Testing submission of form with dropdown field left empty")
    public void testSubmitFormWithDropdownLeftEmpty() {
        homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToContactUsHeaderPage();

        contactUs = new ContactUsPage(driver, bot, wait);
        contactUs.enterName("منار أحمد العبدلي");
        contactUs.enterEmail("test@gmail.com");
        contactUs.enterPhone("556141790");
        contactUs.enterMessage("هذا اختبار لنموذج اتصل بنا.");
        contactUs.clickSubmitButton();


        assertTrue(contactUs.isRequiredFieldErrorDisplayed(), "Dropdown error message should be displayed.");
    }










}
