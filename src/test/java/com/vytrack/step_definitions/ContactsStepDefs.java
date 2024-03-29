package com.vytrack.step_definitions;

import com.vytrack.pages.pages.DashboardPage;
import com.vytrack.pages.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.awt.image.DataBufferShort;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following menu options")
    public void the_user_should_see_following_menu_options(List<String > list) {
        System.out.println("list.size()= "+list.size());
        System.out.println(list);

        DashboardPage dashboardPage=new DashboardPage();
        List<String> actualList=new ArrayList<>();
        BrowserUtils.waitFor(2);
        for(WebElement option : dashboardPage.menuOptions){
            actualList.add(option.getText());
        }
        Assert.assertEquals(list,actualList);
    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userData) {
        System.out.println(userData);
        System.out.println("Firstname: "+userData.get("fname"));
        System.out.println("Lastname: "+userData.get("lname"));
        System.out.println("username: "+userData.get("username"));
        System.out.println("password: "+userData.get("password"));

        LoginPage loginPage=new LoginPage();
        loginPage.login(userData.get("username"), userData.get("password") );

    }


}
