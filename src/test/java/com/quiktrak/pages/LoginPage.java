package com.quiktrak.pages;

import com.quiktrak.utilities.BrowserUtils;
import com.quiktrak.utilities.ConfigurationReader;
import com.quiktrak.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import com.quiktrak.pages.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class LoginPage extends BasePage {


    @FindBy(id = "ctl00_cphPageContent_RQLogin_Username")
    WebElement username;

    @FindBy(id = "ctl00_cphPageContent_RQLogin_PasswordMask")
    WebElement password;

    @FindBy(xpath = "//*[@id='ctl00_cphPageContent_RQLogin_btnLogin']")
    WebElement loginBtn;

    @FindBy(xpath = "//li[@class='rwListItem']/span")
    WebElement Closebtn;


    public void login(String un, String pwd) throws AWTException, InterruptedException {
        click(username);
        typeWithRobot(un);

        Thread.sleep(1000);

        click(password);
        typeWithRobot(pwd);

        Thread.sleep(1000);

        click(loginBtn);
        Thread.sleep(5000);
        click(Closebtn);

    }
}
