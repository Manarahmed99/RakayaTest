package Pages;

import engine.ActionsBot;
import engine.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class JobsPage  extends PageBase {


    public JobsPage(WebDriver driver, ActionsBot bot, Wait<WebDriver> wait) {
        super(driver, bot, wait);
    }
    private final By applicationHeader = By.xpath("//a[contains(@href, '/jobs/job-application')]");
    private final By submitButton = By.xpath("//a[@href='/jobs/job-application']/button[contains(@class, 'submit_button')]");


    public void clickApplicationHeader() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(applicationHeader));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.urlToBe("https://rakaya.sa/jobs/job-application"));
    }


    public void clickSubmit() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.urlToBe("https://rakaya.sa/jobs/job-application"));
    }


}
