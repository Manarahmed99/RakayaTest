package Pages;
import engine.ActionsBot;
import engine.PageBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class HomePage extends PageBase{


    public HomePage(WebDriver driver, ActionsBot bot, Wait<WebDriver> wait) {
        super(driver, bot, wait);
    }

    // Locator
    public String homePageUrl = "https://rakaya.sa/";
    // Header Link - Locator
    private final By rakayaHeaderPage = By.cssSelector("ul.navbar-nav a[href='/rakaya']");
    private final By rakayaStudioHeaderPage = By.cssSelector("ul.navbar-nav a[href='/rakaya-studio']");
    private final By jobsHeaderPage = By.cssSelector("ul.navbar-nav a[href='/jobs']");
    private final By ourWayHeaderPage = By.cssSelector("ul.navbar-nav a[href='/our-way']");
    private final By contactUsHeaderPage = By.cssSelector("ul.navbar-nav a[href='/contact-us']");
    // Footer Link - Locator
    private final By rakayaFooterPage = By.cssSelector("div.container-fluid a.text-dark[href='/rakaya']");
    private final By rakayaStudioFooterPage = By.cssSelector("div.container-fluid a.text-dark[href='/rakaya-studio']");
    private final By jobsFooterPage = By.cssSelector("div.container-fluid a.text-dark[href='/jobs']");
    private final By ourWayFooterPage = By.cssSelector("div.container-fluid a.text-dark[href='/our-way']");
    private final By contactUsFooterPage = By.cssSelector("div.container-fluid a.text-dark[href='/contact-us']");
    // Logo  - Locator
    private final  By logoHeaderLocator = By.xpath("//a[contains(@class, 'navbar-brand') and @href='/']");
    // Button " كن شريك معنا"  - Locator
    private final  By partnerButton = By.xpath("//button[div[text()='كن شريك معنا']]");

    // Button "تعرف على ركايا البديعة"  - Locator
    private final  By rakayaButton = By.xpath("//button[div[text()='تعرف على ركايا البديعة']]");

    // Button "اضغط للمزيد"  - Locator
    private final By jobsButton = By.xpath("//button[div[text()='اضغط للمزيد']]");


    // Home Page
    @Step("Given I am on the Home page")
    public HomePage goTo(){
        bot.navigate(homePageUrl);
        return this;
    }
    // Logo Link
    @Step("Navigate to Rakaya Home Page by clicking the logo")
    public void clickLogoToNavigateToHomePage() {
        bot.click(logoHeaderLocator);
    }

    // Header Link
    @Step("Go to Rakaya Page")
    public void goToRakayaHeaderPage() {
        bot.click(rakayaHeaderPage);
    }
    @Step("Go to Rakaya Studio Page")
    public void goToRakayaStudioHeaderPage() {
        bot.click(rakayaStudioHeaderPage);
    }

    @Step("Go to Jobs Page")
    public void goToJobHeaderPage() {
        bot.click(jobsHeaderPage);
    }

    @Step("Go to Pur Way Page")
    public void goToOurWayHeaderPage() {
        bot.click(ourWayHeaderPage);
    }

    @Step("Go to Contact us Page")
    public void goToContactUsHeaderPage() {
        bot.click(contactUsHeaderPage);
    }


    // Footer Link
    @Step("Go to Rakaya Page")
    public void goToRakayaFooterPage() {
        bot.click(rakayaFooterPage);
    }
    @Step("Go to Rakaya Studio Page")
    public void goToRakayaStudioFooterPage() {
        bot.click(rakayaStudioFooterPage);
    }
    @Step("Go to Jobs Page")
    public void goToJobsFooterPage() {
        bot.click(jobsFooterPage);
    }
    @Step("Go to Our Way Page")
    public void goToOurWayFooterPage() {
        bot.click(ourWayFooterPage);
    }
    @Step("Go to Contact Us Page")
    public void goToContactUsFooterPage() {
        bot.click(contactUsFooterPage);
    }
    //  Partner button
    @Step("Go to Job Page by clicking the Partner button")
    public void goToPartnerPage() {
        bot.click(partnerButton);
    }

   //Rakaya button
    @Step("Go to Rakaya Page by clicking the Rakaya button")
    public void goToRakayaPage() {
        bot.click(rakayaButton);
    }

    // Jobs Button
    @Step("Go to Jobs Page by clicking the 'اضغط للمزيد' button")
    public void goToJobsPage() {
        bot.click(jobsButton);
    }





}
