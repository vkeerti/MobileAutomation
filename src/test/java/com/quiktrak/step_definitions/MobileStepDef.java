package com.quiktrak.step_definitions;

import com.quiktrak.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import javax.xml.stream.Location;
import java.io.File;
import java.io.IOException;

public class MobileStepDef {

    @Given("Go to the App")
    public void go_to_app() throws IOException {



        AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) Driver.get();

    };

    @When("Click the button")
    public void click_the_button() {


    }


    @Then("Close the app")
    public void close_the_app() {

    }
}
