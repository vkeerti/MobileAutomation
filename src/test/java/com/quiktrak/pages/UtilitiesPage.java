package com.quiktrak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*This page contains
 * Locaters of Web Elements
 * methods for relevant actions
 * */
public class UtilitiesPage extends BasePage {

    @FindBy(xpath = "//span[text()='Utilities']")
    WebElement UtlTab;

    public void verifyUnitDetailTab() throws InterruptedException {

        click(UtlTab);

    }

}
