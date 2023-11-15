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
import io.cucumber.java.eo.Se;
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
    SelectLocationPage selectLocationPage = new SelectLocationPage();
    ListPage listPage = new ListPage();
    SettingPage settingPage = new SettingPage();
    UnitDetailsPage unitDetailsPage = new UnitDetailsPage();
    UnitLevelPhotosPage unitLevelPhotosPage = new UnitLevelPhotosPage();

    @When("Launch RQ Mobile App")
    public void launch_Revoquest_mobile_app() throws InterruptedException, AWTException {
        signInPage.launchRQMobile();
    }

    @When("Validate SignIn")
    public void signIn() throws InterruptedException, AWTException {
        signInPage.validateSignIN();
        signInPage.signIn(ConfigurationReader.get("username"));
        signInPage.enterPassword(ConfigurationReader.get("password"));
    }
    @When("Validate Safe Message")
    public void validate_Safe_message() throws InterruptedException, AWTException {
        safetyMessagePage.validateSafeMessage();
    }
    @When("Validate sync process")
    public void validate_Sync() throws InterruptedException, AWTException {
        actionsPage.clickOnSyncBtn();
        actionsPage.clickOnJobs();
    }
    @When("Select the jobs and click Open")
    public void select_Job() throws InterruptedException, AWTException {
        jobsPage.selectJobs();
    }
    @When("Validate Instructions")
    public void validate_Instructions() throws AWTException {
        instructionsPage.validateInstructions();
    }

    @When("Validate Home")
    public void validate_Home() throws AWTException, InterruptedException {
        homePage.validateHomeScreen();
        homePage.capturePhoto();
        unitLevelPhotosPage.takingUnitPhoto();
        homePage.clickOnTotalsTab();
        homePage.clickOnNotesTab();
        homePage.clickOnAuditorsTab();
        homePage.clickOnInformationTab();
        homePage.clickOnTotalTab();
    }

    @When("Validate Location")
    public void selectLocation() throws InterruptedException, AWTException {
        selectLocationPage.selectLocation();
    }

    @When("Validate Setting")
    public void selectSetting() throws InterruptedException, AWTException {
        listPage.menu();
        settingPage.setting();
    }

    @When("Validate Auditing")
    public void auditing() throws InterruptedException, AWTException {
        listPage.auditing_found();
        listPage.auditing_Exception();
        listPage.backBtn();
        homePage.validatingAfterAudit();
    }

    @When("Validate Footer")
    public void validateFooter() throws InterruptedException, AWTException {
        homePage.validateFooter();

    }

    @When("Validate Finalize")
    public void ValidateFinalize() throws InterruptedException, AWTException {


    }

    @Then("Close the app")
    public void close_the_app() {
        System.out.println("Close Driver");
    }
}
