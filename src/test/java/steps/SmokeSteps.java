package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmokeSteps {
    @Given("I print hello world")
    public void i_print_hello_world() {
        System.out.println("Hello world!");
    }
    @Then("everybody can see")
    public void everybody_can_see() {
        System.out.println("Everybody can see!");
    }
}
