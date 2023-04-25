package com.quiktrak.pages;

import com.quiktrak.utilities.BrowserUtils;
import com.quiktrak.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*This page contains
* Locaters of Web Elements
* methods for relevant actions
* */
public class HomePage extends BasePage{
    public void goToVerifyTitlePage() {
        String actualTitle = Driver.get().getTitle();
        new WebDriverWait(Driver.get(),15).until(ExpectedConditions.titleContains("|"));
        String expectTitle = "Lightning Experience";
        Assert.assertEquals(expectTitle,actualTitle);

    }

}
