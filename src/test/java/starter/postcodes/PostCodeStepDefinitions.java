package starter.postcodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostCodeStepDefinitions {

    @Steps
    PostCodeAPI postCodeAPI;

    @When("I look up a post code {word} for country code {word}")
    public void lookUpAPostCode(String postCode, String country) {
        postCodeAPI.fetchLocationByPostCodeAndCountry(postCode, country);
    }

    @Then("the resulting location should be {} in {}")
    public void theResultingLocationShouldBe(String placeName, String country) {
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.body(LocationResponse.COUNTRY, equalTo(country)));
        restAssuredThat(response -> response.body(LocationResponse.FIRST_PLACE_NAME, equalTo(placeName)));
    }

    @And("Response body page should be <page>")
    public void responseBodyPageShouldBePage() {
    }

    @And("Response body should contain name {string} and job {string}")
    public void responseBodyShouldContainNameAndJob(String arg0, String arg1) {
    }

    @Given("put update user with valid json")
    public void putUpdateUserWithValidJson() {
    }

    @When("send put update request")
    public void sendPutUpdateRequest() {
    }

    @And("Put update user json schema validator")
    public void putUpdateUserJsonSchemaValidator() {
    }

    @Given("Delete user with valid id <id>")
    public void deleteUserWithValidIdId() {
    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
    }

    @Then("Should return {int} No Content")
    public void shouldReturnNoContent(int arg0) {
    }

    @When("Send request get list user")
    public void sendRequestGetListUser() {
    }

    @Then("Should return {int} OK")
    public void shouldReturnOK(int arg0) {
    }



    @And("Get list user json schema validator")
    public void getListUserJsonSchemaValidator() {
    }

    @Given("Post create new user")
    public void postCreateNewUser() {
    }

    @When("Send request post create new user")
    public void sendRequestPostCreateNewUser() {
    }

    @Then("Should return {int} created")
    public void shouldReturnCreated(int arg0) {
    }

    @And("Post create new user json schema validator")
    public void postCreateNewUserJsonSchemaValidator() {
    }

    @Given("Put update user with id <id>")
    public void putUpdateUserWithIdId() {
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
    }


    @And("Response body page should be <page>")
    public void responseBodyPageShouldBePage() {
    }

    @Given("Put update user with id <id>")
    public void putUpdateUserWithIdId() {
    }

    @Given("Delete user with valid id <id>")
    public void deleteUserWithValidIdId() {
    }
}
