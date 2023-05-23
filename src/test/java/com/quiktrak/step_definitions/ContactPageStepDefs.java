package com.quiktrak.step_definitions;

import com.quiktrak.pages.ContactPage;
import com.quiktrak.utilities.BrowserUtils;
import io.cucumber.java.en.Then;


public class ContactPageStepDefs {

    ContactPage contactPage = new ContactPage();

    @Then("verify Contact Detail")
    public void verifyContactDetail() throws InterruptedException {
        BrowserUtils.waitForPageToLoad(15);
        contactPage.verifyContactDetailTab();

    }
}
