package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
    }

    @When("the users enters the driver login information")
    public void the_users_enters_the_driver_login_information() {
        System.out.println("Entering driver login info");
    }

    @When("the user enters the sales manager login information")
    public void the_user_enters_the_sales_manager_login_information() {
        System.out.println("Entering sales manager login information");
    }

    @When("the user enters the store manager login information")
        public void the_user_enters_the_store_manager_login_information() {
        System.out.println("Entering store manager information");

    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("verifying that user is logged in");
    }

}
