package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class SelectLocationPage extends BasePage{
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
    WebElement selectLocation;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView[4]")
    //   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView[4]
    WebElement continueBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"stckUnitTotals\"]/android.view.ViewGroup/android.view.ViewGroup")
    WebElement selectLocation1;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"footer\"])[2]/android.view.ViewGroup[3]")
    //   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView[4]
    WebElement continueBtn1;

    public void selectLocation() throws AWTException, InterruptedException {
        click(selectLocation);
        Thread.sleep(2000);
        PDFResultReport.addStepDetails(
                "Select the location",
                "Should select the location",
                "Successfully select the location",
                "Pass",
                "Y",  Driver.get());
        click(continueBtn);
        Thread.sleep(1000);

    }

    public void selectLocation1() throws AWTException, InterruptedException {
        click(selectLocation1);
        Thread.sleep(2000);
        PDFResultReport.addStepDetails(
                "Select the location",
                "Should select the location",
                "Successfully select the location",
                "Pass",
                "Y",  Driver.get());
        click(continueBtn1);
        Thread.sleep(1000);

    }
}
