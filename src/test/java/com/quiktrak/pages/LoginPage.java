package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//div[@id='RAD_SPLITTER_PANE_CONTENT_ctl00_cphPageContent_RadPane3']//div[starts-with(@id,'ctl00_cphPageContent_RadDock') and @class='WidgetPlaceholderContainer']")
    WebElement getLastDataImport;

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

        String lastDataImport = getLastDataImport.getAttribute("innerText");
        System.out.println("Last Successful Data Imported :  " + lastDataImport);

    }
}
