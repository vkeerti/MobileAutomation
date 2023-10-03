package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.Keyboard;
import io.appium.java_client.AppiumDriver;
import org.junit.rules.Timeout;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    static Keyboard keyboard;

   static WebDriverWait wait = new WebDriverWait(Driver.get(), 20, TimeUnit.SECONDS.ordinal());


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


    public static void typeWithRobot(String text) throws AWTException {
        keyboard = new Keyboard();
        keyboard.type(text);
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
        WebDriverWait wait = new WebDriverWait(driver,20,TimeUnit.SECONDS.ordinal() );
        wait.until(ExpectedConditions.attributeContains((element), "text", "Cart"));
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
