package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public static WebDriver driver;
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);

    }
}
