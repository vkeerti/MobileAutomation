package com.quiktrak.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//This runner runs again the failed test cases
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
        features = "@target/rerun.txt",
        glue = "com/quiktrak/step_definitions"
)
public class FailedTestRunner {
}
