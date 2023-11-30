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

    @Given("I run cucumber test")
    public void i_run_cucumber_test() {
        for (int i = 0; i < 100; i++) {
            System.out.println("this is cucumber project");
        }
    }
    @Then("verify this is cucumber")
    public void verify_this_is_cucumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Indeed this cucumber!");
        }
    }
}
