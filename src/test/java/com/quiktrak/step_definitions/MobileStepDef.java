package com.quiktrak.step_definitions;

import com.quiktrak.pages.ActionsPage;
import com.quiktrak.pages.SafetyMessagePage;
import com.quiktrak.pages.SignInPage;
import com.quiktrak.utilities.ConfigurationReader;
import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.stream.Location;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.module.Configuration;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MobileStepDef {
SignInPage signInPage = new SignInPage();
SafetyMessagePage safetyMessagePage = new SafetyMessagePage();
ActionsPage actionsPage = new ActionsPage();
    WebDriverWait wait;

    AndroidDriver driver;
    @Given("Go to the App")
    public void go_to_app() throws IOException, InterruptedException, AWTException {
        driver= (AndroidDriver) Driver.get();
       // wait = new WebDriverWait(driver,120,);
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        PDFResultReport.addStepDetails(
                "Launching Revoquest mobile app",
                "Should launch Revoquest mobile app",
                "Successfully launch Revoquest mobile ",
                "Pass",
                "Y",driver);
        Thread.sleep(2000);

        if (driver.findElements(By.id("com.android.packageinstaller:id/permission_message")).size() > 0) {
            System.out.println("Permission dialog displayed.");
            // Grant the permission by clicking the Allow button
            driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
            System.out.println("Permission granted for: ");
            // Wait for a second to ensure the permission is granted
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @When("Launch Revoquest mobile app")
    public void Launch_Revoquest_mobile_app() throws InterruptedException, AWTException {
        signInPage.enterEmailAddress(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
       // driver.pressKey(new KeyEvent(AndroidKey.HOME));
       // driver.pressKey(new KeyEvent(AndroidKey.BUTTON_1));
        //driver.unlockDevice();
    }

    @When("SignIn to Revoquest app")
    public void SignIn_to_Revoquest_app() throws InterruptedException, AWTException {
        safetyMessagePage.clickOk();
    }
    @When("Validate Safe message")
    public void Validate_Safe_message() throws InterruptedException, AWTException {
        safetyMessagePage.clickOk();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        PDFResultReport.addStepDetails(
                "Click on Ok Button and Navigate to Action screen",
                "Should Click on Ok Button and Navigate to Action screen",
                "Successfully Click on Ok Button and Navigate to Action screen",
                "Pass",
                "Y", (AppiumDriver) Driver.get());
    }

    @When("Click on Sync")
    public void Click_on_Sync() throws InterruptedException, AWTException {
        actionsPage.clickOnSyncBtn();
        PDFResultReport.addStepDetails(
                "SyncUp is completed",
                "Should completed the SyncUp",
                "Successfully syncup",
                "Pass",
                "Y", (AppiumDriver) Driver.get());
    }

    @Then("Close the app")
    public void close_the_app() {
    }
}
