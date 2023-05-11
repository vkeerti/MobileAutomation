package com.quiktrak.step_definitions;

import com.quiktrak.pages.AuditPage;
import com.quiktrak.utilities.BrowserUtils;
import io.cucumber.java.en.Then;


public class ListsPageStepDefs {

    AuditPage auditPage = new AuditPage();

    @Then("verify Audit Detail tabs and list")
    public void verifyAuditDetailTabsAndList() throws InterruptedException {
        BrowserUtils.waitForPageToLoad(15);
        auditPage.verifyAuditDetailTabsLists();

    }

    @Then("verify Lists Details")
    public void verifyListsDetails() {

    }
}
