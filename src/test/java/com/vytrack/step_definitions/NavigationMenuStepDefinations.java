package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefinations {

    @When("the user goes to Fleet,Vehicles")
    public void the_user_goes_to_fleet_vehicles() {
        System.out.println("opening Fleet, Vehicles");
    }
    @Then("the url should be https:\\/\\/app.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void the_url_should_be_https_app_vytrack_com_entity_extend_entity_carreservation() {
        System.out.println("Verifying url for vehicles");
    }
    @When("the user goes to Marketing,Campaigns")
    public void the_user_goes_to_marketing_campaigns() {
        System.out.println("Opening Marketing, Campaigns");
    }
    @Then("the url should be https:\\/\\/app.vytrack.com\\/campaign\\/")
    public void the_url_should_be_https_app_vytrack_com_campaign() {
        System.out.println("Verifying url for campaigns");
    }

    @When("the user goes to Activities,Calender Events")
    public void the_user_goes_to_activities_calender_events() {
        System.out.println("Opening Activities,Calender Events");
    }
    @Then("the url should be https:\\/\\/app.vytrack.com\\/calendar\\/event")
    public void the_url_should_be_https_app_vytrack_com_calendar_event() {
        System.out.println("Verifying url for Calender Events");
    }


}
