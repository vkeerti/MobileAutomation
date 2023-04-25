package com.quiktrak.pages;

import com.quiktrak.utilities.BrowserUtils;
import com.quiktrak.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import com.quiktrak.pages.BasePage;

public class LoginPage extends BasePage {


    @FindBy(name = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "Login")
    WebElement loginBtn;

    public void login(String un,String pwd) {
            username.sendKeys(un);
            password.sendKeys(pwd);
            loginBtn.click();

        }
    }
