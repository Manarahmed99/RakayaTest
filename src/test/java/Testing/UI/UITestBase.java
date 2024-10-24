package Testing.UI;


import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import engine.ActionsBot;
import engine.CustomListener;

import java.time.Duration;

public abstract class UITestBase {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;
    public static Logger logger;
    public ActionsBot bot;




    @Step("Initializing test data and properties")
    @BeforeSuite
    public static void beforeClass() {
        Configurator.initialize(null, "src/main/resources/properties/log4j2.properties");
        logger = LogManager.getLogger(UITestBase.class.getName());


    }





    @Step("Initializing target browser")
    @BeforeMethod
    @Parameters({"browser"})
    public void beforeMethod(String targetBrowser) {
        switch (targetBrowser.toLowerCase()) {
            case "chrome":
                logger.info("Opening Chrome Browser");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                logger.info("Opening Firefox Browser");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case "edge":
                logger.info("Opening Edge Browser");
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("start-maximized");
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + targetBrowser);
        }


        logger.info("Configuring 5 second explicit wait");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver = new EventFiringDecorator(new CustomListener()).decorate(driver);
        bot = new ActionsBot(driver, wait, logger);
    }

    @Step("Terminating target browser")
    @AfterMethod
    public void afterMethod(){
        logger.info("Quitting Browser");
        driver.quit();
    }
}