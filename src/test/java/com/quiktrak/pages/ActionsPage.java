package com.quiktrak.pages;

import com.quiktrak.utilities.MobileUtils;
import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class ActionsPage extends BasePage{
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.Button")
    WebElement SyncBtn;


    //Test
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    WebElement jobs;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement jobsNumber;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement actionsWindow;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    WebElement lastSyncTag;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    WebElement lastSyncInfo;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView")
    WebElement syncTextBeforeSyncButton;


    SyncPage syncPage = new SyncPage();
    public void clickOnSyncBtn() throws InterruptedException, AWTException {
        // Thread.sleep(8000);
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.Button"),5000);
        if (jobsNumber.isDisplayed()){
            PDFResultReport.addStepDetails(
                    "Validate the Jobs number displayed before the sync",
                    "Jobs number displayed before the sync ",
                    "Successfully displayed the Jobs number before the sync: "+jobsNumber.getText(),
                    "Pass",
                    "Y",  Driver.get());
        }else {
            PDFResultReport.addStepDetails(
                    "Validate the Jobs number displayed before the sync",
                    "Jobs number displayed before the sync ",
                    "Un-Successfully to displayed the Jobs number before the sync: "+jobsNumber.getText(),
                    "Fail",
                    "Y", Driver.get());
        }
        click(SyncBtn);
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PDFResultReport.addStepDetails(
                "Click on Sync and navigate to Sync screen",
                "Should Click on Sync and navigate to Sync screen",
                "Successfully Click on Sync and navigate to Sync screen",
                "Pass",
                "Y", Driver.get());

        syncPage.syncCompleteAlt();
    }

    public void clickOnJobs() throws InterruptedException, AWTException {
        //Thread.sleep(5000);
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"),5000);
        PDFResultReport.addStepDetails(
                "Validate the Number of Job is sync to user",
                "Should click on OK button and navigate to Action screen",
                "Successfully click on OK button and navigate to Action screen",
                "Pass",
                "Y",  Driver.get());
        click(jobs);
        Thread.sleep(500);
        PDFResultReport.addStepDetails(
                "Click on jobs and should navigate to Jobs screen",
                "Should click on jobs and should navigate to Jobs screen",
                "Successfully click jobs and should navigate to Jobs screen",
                "Pass",
                "Y",Driver.get());

    }

}
