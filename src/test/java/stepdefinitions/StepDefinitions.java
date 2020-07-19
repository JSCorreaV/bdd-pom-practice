package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class StepDefinitions {

    @Given("this datatable with:")
    public void thisDatatableWith(Map<String, String> mapCaracteristicas) {

        throw new io.cucumber.java.PendingException();
    }

    @Then("a json is created")
    public void aJsonIsCreated() {

        throw new io.cucumber.java.PendingException();
    }
}
