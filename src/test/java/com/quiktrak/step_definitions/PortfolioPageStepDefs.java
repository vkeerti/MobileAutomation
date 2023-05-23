package com.quiktrak.step_definitions;

import com.quiktrak.pages.PortfolioPage;
import com.quiktrak.utilities.BrowserUtils;
import io.cucumber.java.en.Then;


public class PortfolioPageStepDefs {

    PortfolioPage portfolioPage = new PortfolioPage();

    @Then("verify Portfolio Details")
    public void verifyPortfolioDetails() throws InterruptedException {
        BrowserUtils.waitForPageToLoad(15);
        portfolioPage.verifyPorfolioDetailTabsLists();

    }
}
