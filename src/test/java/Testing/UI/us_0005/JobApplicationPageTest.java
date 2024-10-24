package Testing.UI.us_0005;

import Pages.*;
import Testing.UI.UITestBase;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class JobApplicationPageTest extends UITestBase {

    private JobsPage jobsPage;
    private JobApplicationPage jobApplicationPage;

    @BeforeMethod
    public void setup() {
        HomePage homePage = new HomePage(driver, bot, wait);
        homePage.goTo().goToJobHeaderPage();

        jobsPage = new JobsPage(driver, bot, wait);
        jobsPage.clickSubmit();

        jobApplicationPage = new JobApplicationPage(driver, bot, wait);
    }



    @Test(testName = "Test Invalid Name with English Characters")
    @Step("Verify that entering a name with non-Arabic characters triggers the appropriate error message.")
    public void testInvalidNameWithEnglishCharacters() {
        jobApplicationPage.typeNameField(" ");
        jobApplicationPage.typeEmailField("test@gmail.com");
        jobApplicationPage.typePhoneField("556141790");
        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();
        jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
        jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge المقدم من قسم IT");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("3000");
        jobApplicationPage.selectExperience("1");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();

        jobApplicationPage.uploadFiles("D://PDF//Manar.pdf", "D://PDF//img1.png", "");
        jobApplicationPage.clickSubmitButton();
        assertTrue(jobApplicationPage.isDisplayedErrorMsgNameField1(), "يجب أن يبدأ الاسم بحرف عربي وأن يكون الاسم باللغة العربية فقط");
    }


    @Test(testName = "Test Empty Form Submission")
    @Step("Verify that submitting the form without filling any fields shows all required error messages")
    public void testEmptyFormSubmission() {
        jobApplicationPage.clickSubmitButton();
        assertTrue(jobApplicationPage.isDisplayedErrorMsgNameField(), "الاسم الكامل مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgEmailField(), "البريد الإلكتروني مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgPhoneField(), "رقم الجوال مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgQualificationDropDown(), "المؤهل العلمي مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgResidentRadioButton(), "حالة الإقامة مطلوبة");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgGenderRadioButton(), "النوع مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgMaritalRadioButton(), "الحالة الاجتماعية مطلوبة");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgRelativeRadioButton(), "هذا الحقل مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgPreviouslyWorkAtRakayaRadioButton(), "هذا الحقل مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgDepartment(), "اختيار القسم مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgSelfDescription(), "وصف نفسك مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgJobType(), "نوع الوظيفة مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgSalary(), "الراتب المتوقع مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgExperience(), "عدد سنوات الخبرة مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgAvailability(), "متى تستطيع البدء مطلوب");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgCvUpload(), "السيرة الذاتية مطلوبة");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgPersonalPictureUpload(), "الصورة الشخصية مطلوبة");
    }


@Test(testName = "Test Successful Form Submission")
@Step("Fill the job application form with valid data and submit it successfully")
public void testSuccessfulFormSubmission() {

    jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
    jobApplicationPage.typeEmailField("test@gmail.com");
    jobApplicationPage.typePhoneField("556141790");
    jobApplicationPage.selectQualification("بكالوريوس");
    jobApplicationPage.clickCitizenRadioButton();
    jobApplicationPage.clickFemaleRadioButton();
    jobApplicationPage.clickSingleRadioButton();
    jobApplicationPage.clickNoHasRelativeRadioButton();
    jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();
    jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
    jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge المقدم من قسم IT");
    jobApplicationPage.clickFullTimeRadioButton();
    jobApplicationPage.typeInSalaryExpectation("3000");
    jobApplicationPage.selectExperience("1");
    jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();


    jobApplicationPage.uploadFiles("D://PDF//Manar.pdf", "D://PDF//img1.png", "");
    jobApplicationPage.clickSubmitButton();

    assertTrue(jobApplicationPage.isDisplayedSuccessMessage(), "تم استلام طلبك بنجاح! نقدّر اهتمامك بالانضمام إلينا");

}




@Test(testName = "Test for Invalid Email Format")
@Step("Testing submission with invalid email format")
public void testInvalidEmailFormat() {


    jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
    jobApplicationPage.typeEmailField("testgmail.com");

    jobApplicationPage.typePhoneField("556141790");

    jobApplicationPage.selectQualification("بكالوريوس");
    jobApplicationPage.clickCitizenRadioButton();
    jobApplicationPage.clickFemaleRadioButton();
    jobApplicationPage.clickSingleRadioButton();
    jobApplicationPage.clickNoHasRelativeRadioButton();
    jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();

    jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
    jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge المقدم من قسم IT");
    jobApplicationPage.clickFullTimeRadioButton();
    jobApplicationPage.typeInSalaryExpectation("3000");
    jobApplicationPage.selectExperience("1");
    jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();


    jobApplicationPage.uploadFiles("D://PDF//Manar.pdf","D://PDF//img1.png","");
    assertTrue(jobApplicationPage.isDisplayedErrorMsgEmailField1(), "يجب أن يكون بريدًا إلكترونيًا صالحًا");

    jobApplicationPage.clickSubmitButton();
}



@Test(testName = "Test for Special Characters in Email")
@Step("Testing submission with special characters in email")
public void testSpecialCharactersInEmail() {
    jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
    jobApplicationPage.typeEmailField("test##gmail.com");

    jobApplicationPage.typePhoneField("556141790");

    jobApplicationPage.selectQualification("بكالوريوس");
    jobApplicationPage.clickCitizenRadioButton();
    jobApplicationPage.clickFemaleRadioButton();
    jobApplicationPage.clickSingleRadioButton();
    jobApplicationPage.clickNoHasRelativeRadioButton();
    jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();

    jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
    jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge المقدم من قسم IT");
    jobApplicationPage.clickFullTimeRadioButton();
    jobApplicationPage.typeInSalaryExpectation("3000");
    jobApplicationPage.selectExperience("1");
    jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();


    jobApplicationPage.uploadFiles("D://PDF//Manar.pdf","D://PDF//img1.png","");
    jobApplicationPage.clickSubmitButton();

    assertTrue(jobApplicationPage.isDisplayedErrorMsgEmailField1(), "يجب أن يكون بريدًا إلكترونيًا صالحًا");

}

    // Phone Test -
    @Test(testName = "Test for Invalid Phone Number")
    @Step("Testing submission with an invalid phone number")
    public void testInvalidPhoneNumber() {

        jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
        jobApplicationPage.typeEmailField("test@gmail.com");

        jobApplicationPage.typePhoneField("6141790");

        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();

        jobApplicationPage.selectDepartment("تسويق");
        jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge  المقدم من قسم IT");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("4000");
        jobApplicationPage.selectExperience("2");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();


        jobApplicationPage.uploadFiles("D://PDF//Manar.pdf","D://PDF//img1.png","");
        jobApplicationPage.clickSubmitButton();


        assertTrue(jobApplicationPage.isDisplayedErrorMsgPhoneField(), "رقم الجوال مطلوب");
    }

    @Test(testName = "Test for Phone Number with Letters")
    @Step("Testing submission with letters in phone number")
    public void testPhoneNumberWithLetters() {
        jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
        jobApplicationPage.typeEmailField("test@gmail.com");

        jobApplicationPage.typePhoneField("55as");

        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();

        jobApplicationPage.selectDepartment("تسويق");
        jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge المقدم من قسم IT");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("4000");
        jobApplicationPage.selectExperience("2");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();


        jobApplicationPage.uploadFiles("D://PDF//Manar.pdf","D://PDF//img1.png","");
        jobApplicationPage.clickSubmitButton();


        assertTrue(jobApplicationPage.isDisplayedErrorMsgPhoneField(), "رقم الجوال مطلوب");
    }

    @Test(testName = "Test for Too Short Phone Number")
    @Step("Testing submission with a phone number that is too short")
    public void testTooShortPhoneNumber() {


        jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
        jobApplicationPage.typeEmailField("test@gmail.com");

        jobApplicationPage.typePhoneField("5561417");

        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();

        jobApplicationPage.selectDepartment("تسويق");
        jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge المقدم من قسم IT");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("4000");
        jobApplicationPage.selectExperience("2");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();


        jobApplicationPage.uploadFiles("D://PDF//Manar.pdf","D://PDF//img1.png","");
        jobApplicationPage.clickSubmitButton();


        assertTrue(jobApplicationPage.isDisplayedErrorMsgPhoneField(), "رقم الجوال مطلوب");
    }





    //Bug
    @Test(testName = "Test Short Full Name")
    @Step("Check that entering a short full name shows the appropriate error message")
    public void testShortFullName() {

        jobApplicationPage.typeNameField("منار");
        jobApplicationPage.typeEmailField("test@gmail.com");
        jobApplicationPage.typePhoneField("556141790");
        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();
        jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
        jobApplicationPage.typeInSelfDescription("اقوم باجار اختبار للنموذج الوظائف");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("3000");
        jobApplicationPage.selectExperience("1");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();

        jobApplicationPage.uploadFiles("D://PDF//Manar.pdf", "D://PDF//img1.png", "");
        jobApplicationPage.clickSubmitButton();

        assertFalse(jobApplicationPage.isDisplayedSuccessMessage(), "تم استلام طلبك بنجاح! نقدّر اهتمامك بالانضمام إلينا");




    }

    //Bug
    @Test(testName = "Test Long Full Name")
    @Step("Check that entering a long full name shows the appropriate error message")
    public void testLongFullName() {


        jobApplicationPage.typeNameField("منار احمد عبدالله عبدالله العبدلى");
        jobApplicationPage.typeEmailField("test@gmail.com");
        jobApplicationPage.typePhoneField("556141790");
        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();
        jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
        jobApplicationPage.typeInSelfDescription("اقوم باجار اختبار للنموذج الوظائف");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("3000");
        jobApplicationPage.selectExperience("1");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();

        jobApplicationPage.uploadFiles("D://PDF//Manar.pdf", "D://PDF//img1.png", "");
        jobApplicationPage.clickSubmitButton();
        assertFalse(jobApplicationPage.isDisplayedSuccessMessage(), "تم استلام طلبك بنجاح! نقدّر اهتمامك بالانضمام إلينا");
    }





    //Salary
    @Test(testName = "Test for Non-Numeric Salary Input")
    @Step("Testing submission with non-numeric input for salary expectation")
    public void testNonNumericSalaryInput() {
        jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
        jobApplicationPage.typeEmailField("test@gmail.com");
        jobApplicationPage.typePhoneField("556141790");
        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();
        jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
        jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge المقدم من قسم IT");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("avc");

        jobApplicationPage.selectExperience("1");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();
        jobApplicationPage.uploadFiles("D://PDF//Manar.pdf","D://PDF//img1.png","");
        jobApplicationPage.clickSubmitButton();

        assertTrue(jobApplicationPage.isDisplayedErrorMsgSalary(), "الراتب المتوقع مطلوب");
    }

    @Test(testName = "Test for Negative Salary Input")
    @Step("Testing submission with a negative salary input")
    public void testNegativeSalaryInput() {
        jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
        jobApplicationPage.typeEmailField("test@gmail.com");
        jobApplicationPage.typePhoneField("556141790");
        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();
        jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
        jobApplicationPage.typeInSelfDescription("اقوم باختبار صفحة الوظائف من اجل QA Challenge المقدم من قسم IT");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("-");
        jobApplicationPage.selectExperience("1");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();
        jobApplicationPage.uploadFiles("D://PDF//Manar.pdf","D://PDF//img1.png","");
        jobApplicationPage.clickSubmitButton();
        assertTrue(jobApplicationPage.isDisplayedErrorMsgSalary(), "الراتب المتوقع مطلوب");

    }





    // upload files

    @Test(testName = "Test Upload No Files")
    @Step("Testing submission without uploading any files")
    public void testUploadNoFiles() {


        jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
        jobApplicationPage.typeEmailField("test@gmail.com");

        jobApplicationPage.typePhoneField("556141790");

        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();

        jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
        jobApplicationPage.typeInSelfDescription("اقوم باجار اختبار للنموذج الوظائف");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("3000");
        jobApplicationPage.selectExperience("1");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();

        jobApplicationPage.uploadFiles("", "", "");
        jobApplicationPage.clickSubmitButton();


        assertTrue(jobApplicationPage.isDisplayedErrorMsgCvUpload(), "السيرة الذاتية مطلوبة");
        assertTrue(jobApplicationPage.isDisplayedErrorMsgPersonalPictureUpload(), "الصورة الشخصية مطلوبة");
    } // done

    @Test(testName = "Test Upload Large Resume File")
    @Step("Testing the upload of large Resume files")
    public void testUploadLargeResumeFile() {

        jobApplicationPage.typeNameField("منار احمد عبدالله العبدلى");
        jobApplicationPage.typeEmailField("test@gmail.com");

        jobApplicationPage.typePhoneField("556141790");

        jobApplicationPage.selectQualification("بكالوريوس");
        jobApplicationPage.clickCitizenRadioButton();
        jobApplicationPage.clickFemaleRadioButton();
        jobApplicationPage.clickSingleRadioButton();
        jobApplicationPage.clickNoHasRelativeRadioButton();
        jobApplicationPage.clickNoPreviouslyWorkAtRakayaRadioButton();

        jobApplicationPage.selectDepartment("إتقان الرقمية - تقنية المعلومات");
        jobApplicationPage.typeInSelfDescription("اقوم باجار اختبار للنموذج الوظائف");
        jobApplicationPage.clickFullTimeRadioButton();
        jobApplicationPage.typeInSalaryExpectation("3000");
        jobApplicationPage.selectExperience("1");
        jobApplicationPage.clickTwoToFourWeeksAvailabilityRadioButton();

        jobApplicationPage.uploadFiles("D://PDF//CV.pdf", "D://PDF//img1.png", "");

        assertTrue(jobApplicationPage.isDisplayedErrorMsgFileSize(), "حجم الملف يجب أن يكون أقل من 5MB");

    } //done














}