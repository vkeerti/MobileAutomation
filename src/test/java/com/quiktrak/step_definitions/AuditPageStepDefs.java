package com.quiktrak.step_definitions;

import com.quiktrak.pages.AuditPage;
import com.quiktrak.utilities.BrowserUtils;
import io.cucumber.java.en.Then;


public class AuditPageStepDefs {

    AuditPage auditPage = new AuditPage();

    @Then("verify Audit Detail tabs and list")
    public void verifyAuditDetailTabsAndList() throws InterruptedException {
        BrowserUtils.waitForPageToLoad(15);
        auditPage.verifyAuditDetailTabsLists();

    }
}
