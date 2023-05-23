package com.quiktrak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

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
