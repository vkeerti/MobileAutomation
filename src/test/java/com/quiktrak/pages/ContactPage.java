package com.quiktrak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*This page contains
 * Locaters of Web Elements
 * methods for relevant actions
 * */
public class ContactPage extends BasePage {

    @FindBy(xpath = "//span[text()='Contact']")
    WebElement contactTab;

    public void verifyContactDetailTab() throws InterruptedException {

        click(contactTab);

    }

}
