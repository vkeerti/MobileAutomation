package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public abstract class BasePage {


    static WebDriverWait wait = new WebDriverWait(Driver.get(), 100);


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);

    }


    public static void type(WebElement element, String value) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            element.sendKeys(value);
        } catch (ElementNotInteractableException e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.get();
            js.executeScript("arguments[0].setAttribute('value', '" + value + "')", element);
        }
    }



    public static void sendkeys(WebElement element,String value){
        element.sendKeys(value);
    }

    public static void Click(WebElement element){
        element.click();
    }
    public static String getOfText(WebElement element) {
        return element.getText();
    }

    public static String getOfAttr(WebElement element) {
        return element.getAttribute("value");
    }

    public void waitForElementToAppear(WebElement element, AppiumDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.attributeContains((element), "text", "Cart"));
    }

    public boolean find(final WebElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 50);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public static void click(WebElement element) throws InterruptedException {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (ElementNotInteractableException | TimeoutException e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.get();
            js.executeScript("arguments[0].click();", element);

        }
    }
}
