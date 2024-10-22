package Pages;

import engine.ActionsBot;
import engine.PageBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JobApplicationPage extends PageBase {

    public JobApplicationPage(WebDriver driver, ActionsBot bot, Wait<WebDriver> wait) {
        super(driver, bot, wait);
    }
    // Part One - Locator
    private final By nameField  = By.xpath("//input[@name='name']");
    private final By emailField  = By.xpath("//input[@name='email']");
    private final By phoneField  = By.xpath("//input[@name='phone']");

    private final By citizenRadioButton = By.xpath("//input[@id='resident_status0']");
    private final By residentRadioButton = By.xpath("//input[@id='resident_status1']");
    private final By visitorRadioButton = By.xpath("//input[@id='resident_status2']");
    private final By otherResidentRadioButton = By.xpath("//input[@id='resident_status3']");

    private final By maleRadioButton = By.xpath("//input[@id='gender0']");
    private final By femaleRadioButton = By.xpath("//input[@id='gender1']");

    private final By singleRadioButton = By.xpath("//input[@id='marital_status0']");
    private final By marriedRadioButton = By.xpath("//input[@id='marital_status1']");
    private final By divorcedRadioButton =By.xpath( "//input[@id='marital_status2']");
    private final By widowedRadioButton = By.xpath("//input[@id='marital_status3']");
    private final By otherMaritalRadioButton = By.xpath("//input[@id='marital_status4']");

    private final By noHasRelativeRadioButton = By.xpath("//input[@id='has_relative1']");
    private final By yesHasRelativeRadioButton = By.xpath("//input[@id='has_relative0']");

    private final By noPreviouslyWorkAtRakayaRadioButton = By.xpath("//input[@id='previously_work_at_rakaya1']");
    private final By yesPreviouslyWorkAtRakayaRadioButton = By.xpath("//input[@id='previously_work_at_rakaya0']");

    // Part Two - Locator
    private final By selfDescriptionTextarea = By.xpath("//textarea[@id='exampleFormControlTextarea1']");
    private final By fullTimeRadioButton = By.xpath("//input[@id='job_category0']");
    private final By partTimeRadioButton = By.xpath("//input[@id='job_category1']");
    private final By remotelyRadioButton = By.xpath("//input[@id='job_category2']");
    private final By hybridRadioButton = By.xpath("//input[@id='job_category3']");
    private final By seasonalRadioButton = By.xpath("//input[@id='job_category4']");
    private final By trainingRadioButton = By.xpath("//input[@id='job_category5']");
    private final By salaryExpectationInputField = By.xpath("//input[@name='salary_expectation']");
    private final By nowAvailabilityRadioButton = By.xpath("//input[@id='availability_to_start0']");
    private final By twoToFourWeeksAvailabilityRadioButton = By.xpath("//input[@id='availability_to_start1']");
    private final By fourToEightWeeksAvailabilityRadioButton = By.xpath("//input[@id='availability_to_start2']");
    private final By moreThanEightWeeksAvailabilityRadioButton = By.xpath("//input[@id='availability_to_start3']");

    // Part There  - Locator
    private final By cvUpload = By.name("candidate_cv");
    private final By personalPictureUpload = By.name("candidate_personal_picture");
    private final By portfolioUpload = By.name("candidate_portfolio");

    // submit bottom
    private final By submitButton = By.xpath("//button[@type='submit']//div[text()='إرسال']");

    public void clickSubmitButton() {
        bot.click(submitButton);
    }
    // Part One
    public void typeNameField( String name) {
        bot.type(nameField,name);

    }
    public void typeEmailField( String email) {
        bot.type(emailField,email);

    }
    public void typePhoneField(String phone) {
        bot.type(phoneField, phone);
    }
    // Radio Button - Resident
    public void clickCitizenRadioButton() {
        bot.click(citizenRadioButton);
    }
    public void clickResidentRadioButton() {
        bot.click(residentRadioButton);
    }
    public void clickVisitorRadioButton() {
        bot.click(visitorRadioButton);
    }
    public void clickOtherResidentRadioButton() {
        bot.click(otherResidentRadioButton);
    }
    // Radio Button -  Gender
    public void clickMaleRadioButton() {
        bot.click(maleRadioButton);
    }
    public void clickFemaleRadioButton() {
        bot.click(femaleRadioButton);
    }
    // Radio Button - Marital
    public void clickSingleRadioButton() {
        bot.click(singleRadioButton);
    }
    public void clickMarriedRadioButton() {
        bot.click(marriedRadioButton);
    }
    public void clickDivorcedRadioButton() {
        bot.click(divorcedRadioButton);
    }
    public void clickWidowedRadioButton() {
        bot.click(widowedRadioButton);
    }
    public void clickOtherMaritalRadioButton() {
        bot.click(otherMaritalRadioButton);
    }
    // Radio Button - Relative
    public void clickNoHasRelativeRadioButton() {
        bot.click(noHasRelativeRadioButton);
    }
    public void clickYesHasRelativeRadioButton() {
        bot.click(yesHasRelativeRadioButton);
    }
    // Radio Button - Previously Work At Rakaya
    public void clickNoPreviouslyWorkAtRakayaRadioButton() {
        bot.click(noPreviouslyWorkAtRakayaRadioButton);
    }
    public void clickYesPreviouslyWorkAtRakayaRadioButton() {
        bot.click(yesPreviouslyWorkAtRakayaRadioButton);
    }
    // Part One - Locator error Msg
    private final By errorMsgNameField = By.xpath("//div[text()='الاسم الكامل مطلوب']");
    private final By errorMsgNameField1 = By.xpath("//div[text()='يجب أن يبدأ الاسم بحرف عربي وأن يكون الاسم باللغة العربية فقط']");
    private final By errorMsgEmailField = By.xpath("//div[text()='البريد الإلكتروني مطلوب']");
    private final By errorMsgEmailField1 = By.xpath("//div[text()='يجب أن يكون بريدًا إلكترونيًا صالحًا']");
    private final By errorMsgPhoneField = By.xpath("//div[text()='رقم الجوال مطلوب']");
    private final By errorMsgQualificationDropDown = By.xpath("//div[text()='المؤهل العلمي مطلوب']");
    private final By errorMsgGenderRadioButton = By.xpath("//div[text()='النوع مطلوب']");
    private final By errorMsgResidentRadioButton = By.xpath("//div[text()='حالة الإقامة مطلوبة']");
    private final By errorMsgMaritalRadioButton = By.xpath("//div[text()='الحالة الاجتماعية مطلوبة']");
    private final By errorMsgRelativeRadioButton = By.xpath("(//div[@class='text-danger' and @style='font-size: 12px;'])[7]");
    private final By errorMsgPreviouslyWorkAtRakayaRadioButton = By.xpath("(//div[@class='text-danger' and @style='font-size: 12px;'])[8]");
    // Part Two - Locator error Msg
    private final By errorMsgDepartment = By.xpath("//div[text()='اختيار القسم مطلوب']");
    private final By errorMsgSelfDescription = By.xpath("//div[text()='وصف نفسك مطلوب']");
    private final By errorMsgJobType = By.xpath("//div[text()='نوع الوظيفة مطلوب']");
    private final By errorMsgSalary = By.xpath("//div[text()='الراتب المتوقع مطلوب']");
    private final By errorMsgExperience = By.xpath("//div[text()='عدد سنوات الخبرة مطلوب']");
    private final By errorMsgAvailability = By.xpath("//div[text()='متى تستطيع البدء مطلوب']");
    // Part Three - Locator error Msg
    private final By errorMsgCvUpload = By.xpath("//div[text()='السيرة الذاتية مطلوبة']");
    private final By errorMsgPersonalPictureUpload = By.xpath("//div[contains(@class, 'text-danger') and text()=' الصورة الشخصية مطلوبة']");
    // Methods to check error messages
    public boolean isDisplayedErrorMsgNameField() {
        return bot.isDisplayed(errorMsgNameField);
    }

    public boolean isDisplayedErrorMsgNameField1() {
        return bot.isDisplayed(errorMsgNameField1);
    }

    public boolean isDisplayedErrorMsgEmailField() {
        return bot.isDisplayed(errorMsgEmailField);
    }

    public boolean isDisplayedErrorMsgEmailField1() {
        return bot.isDisplayed(errorMsgEmailField1);
    }

    public boolean isDisplayedErrorMsgPhoneField() {
        return bot.isDisplayed(errorMsgPhoneField);
    }

    public boolean isDisplayedErrorMsgQualificationDropDown() {
        return bot.isDisplayed(errorMsgQualificationDropDown);
    }

    public boolean isDisplayedErrorMsgGenderRadioButton() {
        return bot.isDisplayed(errorMsgGenderRadioButton);
    }

    public boolean isDisplayedErrorMsgResidentRadioButton() {
        return bot.isDisplayed(errorMsgResidentRadioButton);
    }

    public boolean isDisplayedErrorMsgMaritalRadioButton() {
        return bot.isDisplayed(errorMsgMaritalRadioButton);
    }

    public boolean isDisplayedErrorMsgRelativeRadioButton() {
        return bot.isDisplayed(errorMsgRelativeRadioButton);
    }

    public boolean isDisplayedErrorMsgPreviouslyWorkAtRakayaRadioButton() {
        return bot.isDisplayed(errorMsgPreviouslyWorkAtRakayaRadioButton);
    }

    public boolean isDisplayedErrorMsgDepartment() {
        return bot.isDisplayed(errorMsgDepartment);
    }

    public boolean isDisplayedErrorMsgSelfDescription() {
        return bot.isDisplayed(errorMsgSelfDescription);
    }

    public boolean isDisplayedErrorMsgJobType() {
        return bot.isDisplayed(errorMsgJobType);
    }

    public boolean isDisplayedErrorMsgSalary() {
        return bot.isDisplayed(errorMsgSalary);
    }

    public boolean isDisplayedErrorMsgExperience() {
        return bot.isDisplayed(errorMsgExperience);
    }

    public boolean isDisplayedErrorMsgAvailability() {
        return bot.isDisplayed(errorMsgAvailability);
    }

    public boolean isDisplayedErrorMsgCvUpload() {
        return bot.isDisplayed(errorMsgCvUpload);
    }

    public boolean isDisplayedErrorMsgPersonalPictureUpload() {
        return bot.isDisplayed(errorMsgPersonalPictureUpload);
    }





    // Part Two



    // Self Description Textarea
    public void typeInSelfDescription(String description) {
        bot.type(selfDescriptionTextarea, description);
    }


    // Job Type Radio Buttons
    public void clickFullTimeRadioButton() {
        bot.click(fullTimeRadioButton);
    }

    public void clickPartTimeRadioButton() {
        bot.click(partTimeRadioButton);
    }

    public void clickRemotelyRadioButton() {
        bot.click(remotelyRadioButton);
    }

    public void clickHybridRadioButton() {
        bot.click(hybridRadioButton);
    }

    public void clickSeasonalRadioButton() {
        bot.click(seasonalRadioButton);
    }

    public void clickTrainingRadioButton() {
        bot.click(trainingRadioButton);
    }



    // Salary Expectation Input Field
    public void typeInSalaryExpectation(String salary) {
        bot.type(salaryExpectationInputField, salary);
    }



    // Availability Radio Buttons
    public void clickNowAvailabilityRadioButton() {
        bot.click(nowAvailabilityRadioButton);
    }

    public void clickTwoToFourWeeksAvailabilityRadioButton() {
        bot.click(twoToFourWeeksAvailabilityRadioButton);
    }

    public void clickFourToEightWeeksAvailabilityRadioButton() {
        bot.click(fourToEightWeeksAvailabilityRadioButton);
    }

    public void clickMoreThanEightWeeksAvailabilityRadioButton() {
        bot.click(moreThanEightWeeksAvailabilityRadioButton);
    }






    // dropdown


    // Select Qualification
    private final By qualificationDropdownContainer = By.xpath("//label[contains(text(), 'المؤهل')]/following-sibling::div//div[contains(@class, 'css-1i8dcou-control')]");
    private final By qualificationDropdownInput = By.xpath("//input[@id='react-select-2-input']");

    public void selectQualification(String qualification) {
        // Wait for the dropdown container to be present and clickable
        WebElement dropdownContainer = wait.until(ExpectedConditions.presenceOfElementLocated(qualificationDropdownContainer));

        // Use JavaScript to click the dropdown
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", dropdownContainer);

        // Wait for the dropdown input to become visible and then type the qualification
        WebElement qualificationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(qualificationDropdownInput));
        qualificationElement.sendKeys(qualification + Keys.ENTER);
    }



    // Select Department
    private final By departmentDropdownContainer = By.xpath("//label[contains(text(), 'اختر القسم')]/following-sibling::div//div[contains(@class, 'css-1i8dcou-control')]");
    private final By departmentDropdownInput = By.xpath("//input[@id='react-select-3-input']");


    public void selectDepartment(String department) {

        WebElement dropdownContainer = wait.until(ExpectedConditions.presenceOfElementLocated(departmentDropdownContainer));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", dropdownContainer);


        WebElement departmentElement = wait.until(ExpectedConditions.visibilityOfElementLocated(departmentDropdownInput));


        departmentElement.sendKeys(department + Keys.ENTER);
    }

    // Select Experience
    private final By experienceDropdownContainer = By.xpath("//label[contains(text(), 'عدد سنوات الخبرة')]/following-sibling::div//div[contains(@class, 'css-1i8dcou-control')]");
    private final By experienceDropdownInput = By.xpath("//input[@id='react-select-4-input']");

    public void selectExperience(String experience) {

        WebElement dropdownContainer = wait.until(ExpectedConditions.presenceOfElementLocated(experienceDropdownContainer));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", dropdownContainer);


        WebElement experienceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(experienceDropdownInput));


        experienceElement.sendKeys(experience + Keys.ENTER);
    }

    public boolean isDisplayedErrorMsgFileSize() {
        By errorMsgFileSize = By.xpath("//p[contains(text(), 'حجم الملف يجب أن يكون أقل من 5MB')]");
        try {
            WebElement errorMsgElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsgFileSize));
            return errorMsgElement.isDisplayed();
        } catch (TimeoutException e) {
            return false; // Return false if the error message does not appear
        }
    }
    public boolean isDisplayedSuccessMessage() {
        By successMessage = By.xpath("//p[contains(text(), 'تم استلام طلبك بنجاح!')]");

        try {
            WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
            return messageElement.isDisplayed();
        } catch (TimeoutException e) {
            return false; // Return false if the success message does not appear
        }
    }
// Part There
    public void uploadFiles(String cvPath, String picturePath, String portfolioPath) {
        if (cvPath != null && !cvPath.isEmpty()) {
            driver.findElement(cvUpload).sendKeys(cvPath);
        }

        if (picturePath != null && !picturePath.isEmpty()) {
            driver.findElement(personalPictureUpload).sendKeys(picturePath);
        }

        if (portfolioPath != null && !portfolioPath.isEmpty()) {
            driver.findElement(portfolioUpload).sendKeys(portfolioPath);
        }
    }
    private void uploadFile(By fileInput, String filePath, By errorMsg, String fileType) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement fileInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(fileInput));
        fileInputElement.sendKeys(filePath);

        if (errorMsg != null) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
                System.out.println(fileType + " لم يتم تحميله بنجاح.");
            } catch (TimeoutException e) {
                System.out.println(fileType + " تم تحميله بنجاح.");
            }
        } else {
            System.out.println(fileType + " تم تحميله بنجاح.");
        }
    }






}
