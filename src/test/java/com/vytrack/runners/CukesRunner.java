package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",// deature file path
        glue = "com.vytrack.step_definitions",// implementation path
        dryRun = false, // only test step defi is match with deature file or not
        tags="@nav_menu"




)
public class CukesRunner {


    }

