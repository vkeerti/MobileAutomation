package com.quiktrak.step_definitions;

import com.quiktrak.pages.HomePage;
import com.quiktrak.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Then("verify user able to redirect the Home page")
    public void verifyUserAbleToRedirectTheHomePage() {
        BrowserUtils.waitForPageToLoad(15);
        homePage.goToVerifyHomePage();
    }

    @And("verify all the options are available on Home Page Dashboard")
    public void verifyAllTheOptionsAreAvailableOnHomePageDashboard() throws InterruptedException {
        BrowserUtils.waitForPageToLoad(15);
        homePage.verifyHomeDashboardTopMenu("Audits", "Contact", "Utilities", "Vasudeva Keerti");

    }

}
