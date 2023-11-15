package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.MobileUtils;
import com.quiktrak.utilities.PDFResultReport;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class UnitLevelPhotosPage extends BasePage{


    @FindBy(className = "android.widget.TextView")
    WebElement unitLevelPhotosTag;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Trash\"]")
    WebElement deleteIcon;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Camera\"]\n")
    WebElement cameraIcon;

    @FindBy(id = "com.android.camera2:id/shutter_button")
    WebElement pictIcon;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    WebElement doneIcon;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Retake\"]")
    WebElement retakeIcon;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Cancel\"]")
    WebElement cancelIcon;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement captionNoteforPict;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageButton")
    WebElement backIcon;


    public void takingUnitPhoto() throws InterruptedException, AWTException {
        Thread.sleep(1500);
        Click(pictIcon);
        MobileUtils.waitFor(15);
        click(doneIcon);
        MobileUtils.waitFor(15);
        sendkeys(captionNoteforPict,"Test photo");
        PDFResultReport.addStepDetails(
                "Save the Unit level picture",
                "Should save the Unit level  picture in Audit",
                "Successfully saved the Unit level picture",
                "Pass",
                "Y", Driver.get());
        click(backIcon);

    }
}
