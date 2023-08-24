package com.quiktrak.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/* In this class we write the option of framework
 * Framework needs basically 2 different source
 *  - Codes and Scenarios
 * Runner takes the codes from glue path and takes the scenarios from feature path
 * Scenarios taken depends on tags which given below
 * */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/quiktrak/step_definitions",
        //plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        dryRun = false,
        tags = {"@mobile"}

)
public class CukesRunner {
    
}
