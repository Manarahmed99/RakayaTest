package Pages;

import engine.ActionsBot;
import engine.PageBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class RakaiaPage extends PageBase {

    public RakaiaPage(WebDriver driver, ActionsBot bot, Wait<WebDriver> wait) {
        super(driver, bot, wait);
    }

    private final By aboutCompanyButton = By.xpath("//a[@href='/rakaya']//h3[text()='عن الشركة']");
    private final By ourPillarsButton = By.xpath("//a[@href='/rakaya/our-pillars']//h3[text()='أركاننا']");
    private final By ourWorkButton = By.xpath("//a[@href='/rakaya/our-work']//h3[text()='عمل ركايا']");
    private final By ourServicesButton = By.xpath("//a[@href='/rakaya/our-services']//h3[text()='خدماتنا']");
    private final By ourProductsButton = By.xpath("//a[@href='/rakaya/our-products']//h3[text()='منتجاتنا']");
    private final By applicationsButton = By.xpath("//a[@href='/rakaya/applications']//h3[text()='برامج نستخدمها']");
    private final By foundationsButton = By.xpath("//a[@href='/rakaya/foundations']//h3[text()='أُسس']");
    private final By aboutRakaiaButton = By.xpath("//a[@href='/rakaya/feedbacks']//h3[text()='قَبس عن ركايا']");
    private final By sessionsButton = By.xpath("//a[@href='/rakaya/sessions']//h3[text()='جلسات']");




    @Step("Navigate to About Company Page by clicking the About Company button")
    public void clickAboutCompanyButton() {
        bot.click(aboutCompanyButton);
    }


    @Step("Navigate to Our Pillars Page by clicking the Our Pillars button")
    public void clickOurPillarsButton() {
        bot.click(ourPillarsButton);
    }


    @Step("Navigate to Our Work Page by clicking the Our Work button")
    public void clickOurWorkButton() {
        bot.click(ourWorkButton);
    }


    @Step("Navigate to Our Services Page by clicking the Our Services button")
    public void clickOurServicesButton() {
        bot.click(ourServicesButton);
    }


    @Step("Navigate to Our Products Page by clicking the Our Products button")
    public void clickOurProductsButton() {
        bot.click(ourProductsButton);
    }


    @Step("Navigate to About Rakaia Page by clicking the About Rakaia button")
    public void clickAboutRakaiaButton() {
        bot.click(aboutRakaiaButton);
    }


    @Step("Navigate to Applications Page by clicking the Applications button")
    public void clickApplicationsButton() {
        bot.click(applicationsButton);
    }


    @Step("Navigate to Foundations Page by clicking the Foundations button")
    public void clickFoundationsButton() {
        bot.click(foundationsButton);
    }


    @Step("Navigate to Sessions Page by clicking the Sessions button")
    public void clickSessionsButton() {
        bot.click(sessionsButton);
    }




}
