package starter.Reqres;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class ReqresStepDefs {

    @Steps
    ReqresAPI reqresAPI;

    private int page;

    @Given("Get list user with parameter page {int}")
    public void getListUserWithParameterPage(int page) {
        ReqresAPI.Getlistusers(page);
    }

    @When("send get list user request")
    public void sendGetListUserRequest() {

    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

    @Given("Get list user with parameter page <page>")
    public void getListUserWithParameterPagePage() {
    }

    //Scenario 2
    @Given("post create user with valid json")
    public void postCreateUserWithValidJson() {
    }

    @When("send post create user request")
    public void sendPostCreateUserRequest() {
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int arg0) {
    }
}
