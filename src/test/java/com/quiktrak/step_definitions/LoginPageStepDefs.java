package com.quiktrak.step_definitions;

import com.quiktrak.pages.LoginPage;
import com.quiktrak.utilities.ConfigurationReader;
import com.quiktrak.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.*;


public class LoginPageStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("Open the Chrome and launch the application")
    public void open_the_Chrome_and_launch_the_application() {

        Driver.get().get(ConfigurationReader.get("url"));


    }

    @When("User login the application")
    public void userLoginTheApplication() throws InterruptedException, AWTException {
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));

    }

    @And("the last successful data feed was received")
    public void theLastSuccessfulDataFeedWasReceived() {

    }

}
