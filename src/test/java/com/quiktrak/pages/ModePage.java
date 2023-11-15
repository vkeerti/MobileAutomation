package com.quiktrak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModePage extends  BasePage{

    @FindBy(xpath = "")
    WebElement backIcon;

    public void clickOnBack() throws InterruptedException {
        click(backIcon);
    }
}
