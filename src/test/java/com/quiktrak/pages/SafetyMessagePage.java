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

public class SafetyMessagePage extends BasePage{
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    WebElement safetyMsg;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    WebElement safetyMsgTg;
    @FindBy(className = "android.widget.Button")
    WebElement OkBtn;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement safetyMessageWindow;

    public void validateSafeMessage() throws InterruptedException, AWTException {
        // Thread.sleep(15000);
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView"),20000);
        // Driver.get().manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        String safemsg=getOfText(safetyMsg);
        System.out.println("Safe message : ----------------  "+safemsg);
        if (safetyMsg.isDisplayed())
            PDFResultReport.addStepDetails(
                    "Validate the Safe message is displayed",
                    "Should validate the safe message ",
                    "Successfully to validate the safe message  :  "+safemsg,
                    "Pass",
                    "Y",Driver.get());
        else{
            PDFResultReport.addStepDetails(
                    "Validate the Safe message",
                    "Should validate the safe message ",
                    "Un-Successfully to validate the safe message  :  "+safemsg,
                    "fail",
                    "Y",  Driver.get());
        }
        click(OkBtn);
        Driver.get().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        PDFResultReport.addStepDetails(
                "Click on Ok Button and Navigate to Action screen",
                "Should Click on Ok Button and Navigate to Action screen",
                "Successfully Click on Ok Button and Navigate to Action screen",
                "Pass",
                "Y", Driver.get());
    }

}

