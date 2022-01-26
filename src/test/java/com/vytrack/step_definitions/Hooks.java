package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("This is coming from before scenario");
    }

    @After
    public void tearDownAndScreenshot(Scenario scenario){
        System.out.println("This is coming from after scenario");
        //if scenario fails, take a screenshot
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Attachment 1 (png)");

        }
        Driver.closeDriver();

    }

    @After("@sales_manager")
    public void tearDownSalesManager(){

        System.out.println("This is coming from after scenario for sales managers");
    }

}
