package steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserApiSteps {
    private Response response;

    @When("I send a GET request to {string}")
    public void iSendAGetRequestTo(String url) {
        response = RestAssured.given()
                .when()
                .get(url);
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.getStatusCode());
    }
} 