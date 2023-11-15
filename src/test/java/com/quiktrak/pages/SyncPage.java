package com.quiktrak.pages;

import com.quiktrak.utilities.MobileUtils;
import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SyncPage extends BasePage{
    @FindBy(className = "android.widget.Button")
    //xpath- /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Button
    WebElement SyncBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement syncWindow;

    @FindBy(className = "android.widget.ImageView")
    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView
    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView
    WebElement sendAndReceiveResults;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement optionsTag;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
    WebElement statusTag;
    // SyncComplete
    @FindBy(xpath = "com.quiktrak.rqmobile:id/alertTitle")
    WebElement syncComplete;

    @FindBy(xpath = "android:id/message")
    WebElement syncMsg;

    @FindBy(xpath = "android:id/button2")
    WebElement OkBtn;

    public void syncCompleteAlt() throws InterruptedException, AWTException {
        MobileUtils.waitForPresenceOfElement(By.className("android.widget.ImageView"),20000);
        click(sendAndReceiveResults);
        Driver.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        PDFResultReport.addStepDetails(
                "Click on Send and Receive Results",
                "Should click on send and receive results ",
                "Successfully click on send and receive results ",
                "Pass",
                "Y", Driver.get());
        click(SyncBtn);
        Driver.get().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        PDFResultReport.addStepDetails(
                "Click on sync button and Validate Sync is In-process ",
                "Should validate the sync is In-process ",
                "Sync is In-Process",
                "Pass",
                "Y",  Driver.get());
        // Thread.sleep(20000);
        Driver.get().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        MobileUtils.waitForAlertMsg(20000);
        Alert alert = Driver.get().switchTo().alert();
        String msg=alert.getText();
        System.out.println("Sync alert message  :- "+msg);
        PDFResultReport.addStepDetails(
                "Sync is completed",
                "Should completed the  sync ",
                "Successfully completed sync and Alert msg  :: "+msg,
                "Pass",
                "Y",  Driver.get());
        alert.accept();
    }

}
