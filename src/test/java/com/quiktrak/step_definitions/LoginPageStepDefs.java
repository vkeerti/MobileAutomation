package com.quiktrak.step_definitions;

import com.quiktrak.pages.LoginPage;
import com.quiktrak.utilities.BrowserUtils;
import com.quiktrak.utilities.ConfigurationReader;
import com.quiktrak.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginPageStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("Open the Chrome and launch the application")
    public void open_the_Chrome_and_launch_the_application() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("User login the application")
    public void userLoginTheApplication() {
        loginPage.login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));

    }
}
