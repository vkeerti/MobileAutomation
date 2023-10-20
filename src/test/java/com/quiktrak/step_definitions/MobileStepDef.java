package com.quiktrak.step_definitions;

import com.quiktrak.pages.*;
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
    JobsPage jobsPage= new JobsPage();
    InstructionsPage instructionsPage = new InstructionsPage();
    HomePage homePage = new HomePage();
    @When("Launch RQ mobile app")
    public void launch_Revoquest_mobile_app() throws InterruptedException, AWTException {
        signInPage.launchRQMobile();
    }

    @When("SignIn validation")
    public void signIn() throws InterruptedException, AWTException {
        signInPage.validateSignIN();
        signInPage.signIn(ConfigurationReader.get("username"));
        signInPage.enterPassword(ConfigurationReader.get("password"));
    }
    @When("Validate safe message")
    public void validate_Safe_message() throws InterruptedException, AWTException {
        safetyMessagePage.clickOk();
    }
    @When("Click on sync")
    public void click_on_Sync() throws InterruptedException, AWTException {
        actionsPage.clickOnSyncBtn();
        actionsPage.clickOnJobs();
    }
    @When("Select the jobs and click Open")
    public void validate_Home_Screen() throws InterruptedException, AWTException {
        jobsPage.selectJobs();
    }
    @When("Accept Instructions")
    public void validate_Instructions() throws AWTException {
        instructionsPage.validateInstructions();
    }

    @When("Validate Home")
    public void validate_Home() throws AWTException, InterruptedException {
        homePage.validateHomeScreen();
        homePage.clickOnTotalsTab();
        // homePage.clickOnNotesTab();
        //homePage.clickOnAuditorsTab();
        //homePage.clickOnInformationTab();
        //homePage.clickOnTotalTab();

    }

    @Then("Close the app")
    public void close_the_app() {
    }
}
