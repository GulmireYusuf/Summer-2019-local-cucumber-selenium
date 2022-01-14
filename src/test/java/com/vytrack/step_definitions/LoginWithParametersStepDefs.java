package com.vytrack.step_definitions;

import com.vytrack.pages.pages.ContactsPage;
import com.vytrack.pages.pages.DashboardPage;
import com.vytrack.pages.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParametersStepDefs {

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String userName, String passWord) {
        System.out.println("string= "+userName);
        System.out.println("string2= "+passWord);
        LoginPage loginPage=new LoginPage();
        loginPage.login(userName,passWord);


    }

    @Then("the tile should contain {string}")
    public void the_tile_should_contain(String title) {
        System.out.println("title= "+title);
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().contains(title));
    }


    @Given("a driver is logged in")
    public void a_driver_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");
        new LoginPage().login(username,password);

    }
    @When("the user goes to {string} {string}")
    public void the_user_goes_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);


    }
    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer count) {
        System.out.println("count= "+count);

        ContactsPage contactsPage=new ContactsPage();
        BrowserUtils.waitFor(4);
        String text=contactsPage.pageCount.getAttribute("value");
        System.out.println("text= "+text);
        Integer actualCount=Integer.parseInt(text);
        Assert.assertEquals(count,actualCount);



    }
}
