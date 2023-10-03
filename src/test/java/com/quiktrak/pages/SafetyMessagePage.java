package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import io.appium.java_client.AppiumDriver;
import org.junit.rules.Timeout;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.time.Duration;
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

    public void clickOk() throws InterruptedException, AWTException {
        Thread.sleep(3000);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String safemsg=getOfText(safetyMsg);
        System.out.println("Safe message : ----------------  "+safemsg);
      if (safetyMsg.isDisplayed())
         PDFResultReport.addStepDetails(
                "Validate the Safe message",
                "Should validate the safe message ",
                "Successfully to validate the safe message  :  "+safemsg,
                "Pass",
                "Y", (AppiumDriver) Driver.get());
        else{
            PDFResultReport.addStepDetails(
                    "Validate the Safe message",
                    "Should validate the safe message ",
                    "Un-Successfully to validate the safe message  :  "+safemsg,
                    "fail",
                    "Y", (AppiumDriver) Driver.get());
        }
       click(OkBtn);
    }

}

