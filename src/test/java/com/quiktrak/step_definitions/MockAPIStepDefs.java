package com.quiktrak.step_definitions;

import com.quiktrak.utilities.ConfigurationReader;
import com.quiktrak.utilities.ResponseWriter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class MockAPIStepDefs {

    String baseURL = ConfigurationReader.get("apiBaseURL");
    String username = ConfigurationReader.get("apiUserName");
    String password = ConfigurationReader.get("apiPassword");
    String barcode = ConfigurationReader.get("barcode");

    String token = null;

    @When("user sends the POST request for getting access token")
    public void userSendsThePOSTRequestForGettingAccessToken() {
        Response response = given().accept(ContentType.JSON)
                .and().header("Content-Type", "application/json")
                .and().header("x-mock-match-request-headers", "user")
                .and().header("x-mock-match-request-headers", "pass")
                .and().header("user", username)
                .and().header("pass", password)
                .when().post(baseURL + "/token");

        assertEquals(201, response.statusCode());
        assertEquals("application/json; charset=utf-8", response.contentType());

        JsonPath jsonPath = response.jsonPath();

        token = jsonPath.getString("token");
    }

    @And("user sends the POST request for creating new barcode")
    public void userSendsThePOSTRequestForCreatingNewBarcode() throws IOException {
        String body = "{\"Barcode\":" + barcode + "}";

        Response response = given().accept(ContentType.JSON)
                .and().header("x-mock-match-request-headers", "Authorization")
                .and().header("Authorization", "Bearer " + token)
                .and().body(body)
                .when().post(baseURL + "/sendInvoice");

        assertEquals(201, response.statusCode());
        assertEquals("application/json; charset=utf-8", response.contentType());

        Map<String, Object> responseBody = response.body().as(Map.class);

        ResponseWriter.write(responseBody.toString());

    }

    @Then("user sends GET request for getting the invoice link")
    public void userSendsGETRequestForGettingTheInvoiceLink() throws IOException {
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("barcode", barcode)
                .when().get(baseURL + "/viewInvoice");

        assertEquals(200, response.statusCode());
        assertEquals("application/json; charset=utf-8", response.contentType());

        Map<String, Object> responseBody = response.body().as(Map.class);

        ResponseWriter.write(responseBody.toString());
    }
}
