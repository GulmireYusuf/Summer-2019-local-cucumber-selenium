package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                   "rerun:target/rerun.txt"
        },// we can provide two in here use "," between two
        features = "src/test/resources/features/",// deature file path
        glue = "com.vytrack.step_definitions",// implementation path
        dryRun = false, // if we want to execute something it should be false; only test step defi is match with deature file or not
        tags="@wip"

)
public class CukesRunner {



    }

