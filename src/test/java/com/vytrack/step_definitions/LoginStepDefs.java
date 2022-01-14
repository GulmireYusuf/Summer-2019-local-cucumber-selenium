package com.vytrack.step_definitions;

import com.vytrack.pages.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        String url=ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the users enters the driver login information")
    public void the_users_enters_the_driver_login_information() {
        System.out.println("Entering driver login info");
        String dUserName=ConfigurationReader.get("driver_username");
        String passWord=ConfigurationReader.get("driver_password");
        LoginPage loginPage=new LoginPage();
        loginPage.login(dUserName,passWord);

    }

    @When("the user enters the sales manager login information")
    public void the_user_enters_the_sales_manager_login_information() {
        System.out.println("Entering sales manager login information");
        String sUserName=ConfigurationReader.get("sales_manager_username");
        String passWord=ConfigurationReader.get("sales_manager_password");
        LoginPage loginPage=new LoginPage();
        loginPage.login(sUserName,passWord);

    }

    @When("the user enters the store manager login information")
        public void the_user_enters_the_store_manager_login_information() {
        System.out.println("Entering store manager information");
        String storeUserName=ConfigurationReader.get("store_manager_username");
        String storePassWord=ConfigurationReader.get("store_manager_password");
        LoginPage loginPage=new LoginPage();
        loginPage.login(storeUserName,storePassWord);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("verifying that user is logged in");
        BrowserUtils.waitFor(4);
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);
    }

}
