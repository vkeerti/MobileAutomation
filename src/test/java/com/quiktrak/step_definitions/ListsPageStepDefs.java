package com.quiktrak.step_definitions;

import com.quiktrak.pages.ListsPage;
import com.quiktrak.utilities.BrowserUtils;
import io.cucumber.java.en.Then;


public class ListsPageStepDefs {

    ListsPage listsPage = new ListsPage();

    @Then("verify Lists Details")
    public void verifyListsDetails() throws InterruptedException {
        BrowserUtils.waitForPageToLoad(15);
        listsPage.verifyListsDetails();

    }
}
