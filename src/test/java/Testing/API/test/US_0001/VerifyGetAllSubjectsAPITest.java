package Testing.API.test.US_0001;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;

public class VerifyGetAllSubjectsAPITest {

    private final String url = "https://admin.refada.co/api/all-subjects";

    @Test(testName = "Verify successful GET request and response validation for /api/all-subjects")
    public void verifyGetAllSubjectsAPITest() {
        Response response = sendGetRequest(url);
        validateStatusCode(response);
        validateResponseBody(response);
    }

    @Step("Send GET request to {0}")
    public Response sendGetRequest(String endpointUrl) {
        Response response = given().get(endpointUrl);
        response.prettyPrint(); // For debugging purposes
        return response;
    }

    @Step("Verify response status code is 200")
    public void validateStatusCode(Response response) {
        response.then().statusCode(200);  // Expected status: 200 OK
    }

    @Step("Verify the structure and content of the response body")
    public void validateResponseBody(Response response) {
        response.then()
                .body("flag", equalTo(true))
                .body("subjects", notNullValue())
                .body("subjects[0].id", equalTo(1))
                .body("subjects[0].name_en", equalTo("question"))
                .body("subjects[0].name_ar", equalTo("سؤال"))
                .body("subjects[0].created_at", notNullValue())
                .body("subjects[0].updated_at", notNullValue());
    }
}
