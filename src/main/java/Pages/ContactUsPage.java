package Pages;

import engine.ActionsBot;
import org.openqa.selenium.*;
import engine.PageBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class ContactUsPage extends PageBase {

    public ContactUsPage(WebDriver driver, ActionsBot bot, Wait<WebDriver> wait) {
        super(driver, bot, wait);
    }

    // Locators
    private final By nameField = By.xpath("//input[@name='name']");
    private final By emailField = By.xpath("//input[@name='email']");
    private final By phoneField = By.xpath("//input[@name='phone']");
    private final By messageField = By.xpath("//textarea[@name='message']");
    private final By submitButton = By.xpath("//button[div[text()='إرسال']]");

    private final By requiredFieldError = By.xpath("//div[contains(@class, 'text-danger') and text()='هذا الحقل مطلوب']");
    private final By nameError = By.xpath("//div[contains(@class, 'text-danger') and text()='الاسم مطلوب']");
    private final By phoneError = By.xpath("//div[contains(@class, 'text-danger') and text()='رقم الجوال مطلوب']");
    private final By emailError = By.xpath("//div[contains(@class, 'text-danger') and text()='البريد الإلكتروني مطلوب']");
    private final By messageError = By.xpath("//div[contains(@class, 'text-danger') and text()=' هذا الحقل مطلوب']");

    public boolean isDisplayedSuccessMessage() {
        By successMessage = By.xpath("//p[contains(text(), 'تم استلام طلبك بنجاح!')]");

        try {
            WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
            return messageElement.isDisplayed();
        } catch (TimeoutException e) {
            return false; }
    }

    public void enterName(String name) {
        bot.type(nameField, name);
    }

    public void enterEmail(String email) {
        bot.type(emailField, email);
    }

    public void enterPhone(String phone) {
        bot.type(phoneField, phone);
    }

    public void enterMessage(String message) {
        bot.type(messageField, message);
    }
    public void  clickSubmitButton(){bot.click(submitButton);}

    private final By helpDropdownContainer = By.xpath("//div[contains(@class, 'css-b62m3t-container')]"); // استخدام العنصر الحاوي
    private final By helpDropdownInput = By.xpath("//input[@id='react-select-2-input']"); // تأكد من استخدام XPath الصحيح لحقل الإدخال

    public void selectHelp(String help) {
        WebElement dropdownContainer = wait.until(ExpectedConditions.presenceOfElementLocated(helpDropdownContainer));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", dropdownContainer);
        WebElement helpInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(helpDropdownInput));
        helpInputElement.sendKeys(help + Keys.ENTER);
    }

    public boolean isRequiredFieldErrorDisplayed() {
        return bot.isDisplayed(requiredFieldError);
    }

    public boolean isNameErrorDisplayed() {
        return bot.isDisplayed(nameError);
    }

    public boolean isPhoneErrorDisplayed() {
        return bot.isDisplayed(phoneError);
    }

    public boolean isEmailErrorDisplayed() {
        return bot.isDisplayed(emailError);
    }

    public boolean isMessageErrorDisplayed() {
        return bot.isDisplayed(messageError);
    }
}
