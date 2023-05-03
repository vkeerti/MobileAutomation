package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.Keyboard;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public abstract class BasePage {
    static Keyboard keyboard;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);

    }


    public static void type(WebElement element, String value) {
        try {
            element.click();
            element.sendKeys(value);
        } catch (ElementNotInteractableException e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.get();
            js.executeScript("arguments[0].setAttribute('value', '" + value + "')", element);
        }
    }


    public static void typeWithRobot(String text) throws AWTException {
        keyboard = new Keyboard();
        keyboard.type(text);
    }


    public static void click(WebElement element) {
        try {
            element.click();
        } catch (ElementNotInteractableException e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.get();
            js.executeScript("arguments[0].click();", element);
        }
    }
}
