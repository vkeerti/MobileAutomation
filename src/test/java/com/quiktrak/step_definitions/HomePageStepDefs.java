package com.quiktrak.step_definitions;

import com.quiktrak.pages.HomePage;
import com.quiktrak.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Then("verify user able to get the page title")
    public void verifyUserAbleToGetThePageTitle() {
        BrowserUtils.waitForPageToLoad(15);
        homePage.goToVerifyTitlePage();
    }
}
