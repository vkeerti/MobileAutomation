package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.MobileUtils;
import com.quiktrak.utilities.PDFResultReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class SettingPage extends BasePage {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement settingTag;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch")

    WebElement systemFoundSwitch;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"6. \"]")
    WebElement systemSearchLen;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
    WebElement selectValue;

    @FindBy(className = "android.widget.ImageButton")
    WebElement backBtn;
    public void setting() throws AWTException, InterruptedException {
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"),20);
        click(systemFoundSwitch);
        Thread.sleep(8000);
        PDFResultReport.addStepDetails(
                "Switch off the system found setting",
                "Should switch off the system found setting",
                "Successfully switch off the system found setting",
                "Pass",
                "Y",  Driver.get());
        click(systemSearchLen);
        Thread.sleep(8000);
        PDFResultReport.addStepDetails(
                "Select the system search length",
                "Should select the system search length",
                "Successfully select the system search length",
                "Pass",
                "Y",  Driver.get());
      /*  Alert alert = Driver.get().switchTo().alert();
        String msg=alert.getText();
        System.out.println("Alert message *********** "+msg);*/
        click(selectValue);
        Thread.sleep(5000);
        PDFResultReport.addStepDetails(
                "Set the search setting",
                "Should set the search setting",
                "Successfully set the search setting",
                "Pass",
                "Y",  Driver.get());
        click(backBtn);
    }
}
