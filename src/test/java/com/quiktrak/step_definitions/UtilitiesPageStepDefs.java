package com.quiktrak.step_definitions;

import com.quiktrak.pages.UtilitiesPage;
import com.quiktrak.utilities.BrowserUtils;
import io.cucumber.java.en.Then;


public class UtilitiesPageStepDefs {

    UtilitiesPage utilitiesPage = new UtilitiesPage();

    @Then("verify Utilities Detail")
    public void verifyUtilitiesDetail() throws InterruptedException {
        BrowserUtils.waitForPageToLoad(15);
        utilitiesPage.verifyUnitDetailTab();


    }
}
