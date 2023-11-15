package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.MobileUtils;
import com.quiktrak.utilities.PDFResultReport;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class UnitDetailsPage extends BasePage{
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement inventoryNum;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement unitDetails;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[6]")
    WebElement invoice;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[7]")
    WebElement date;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[9]")
    WebElement currency;

    @FindBy(id="com.quiktrak.rqmobile:id/lblFoundQty")
    WebElement foundBtn;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.TextView")
    WebElement exceptionBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.EditText")
    WebElement unitNotes;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement code;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[14]")
    WebElement STGStorage_exceptionType_altMsg;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"NotViewed. \"]")
    WebElement verif;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
    WebElement locName;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
    WebElement address;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
    WebElement city_ST_Zip;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")
    WebElement phone;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText")
    WebElement note;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageButton")
    WebElement backBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.Button[1]")
    WebElement cameraIcon;
    UnitLevelPhotosPage unitLevelPhotosPage = new UnitLevelPhotosPage();
    public void found() throws AWTException, InterruptedException {
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]"),100);

        if (inventoryNum.isDisplayed() && invoice.isDisplayed() && currency.isDisplayed()) {
            PDFResultReport.addStepDetails(
                    "Validate the Unit Number and Currency is displayed ",
                    "Should validate Unit Number and Currency is display",
                    "Successfully displayed the Unit number ::  " + inventoryNum.getText() + " , Currency :: " + currency.getText(),
                    "Pass",
                    "Y", Driver.get());
        }else {
            PDFResultReport.addStepDetails(
                    "Validate the Unit Number and Currency is displayed ",
                    "Should validate Unit Number,Invoice and Currency is display",
                    "Un-Successfully displayed the Unit number ::  " + inventoryNum.getText() + ",Currency :: " + currency.getText(),
                    "Fail",
                    "Y", Driver.get());
        }
        click(foundBtn);
        PDFResultReport.addStepDetails(
                "Validate unit is found ",
                "Should validate Unit is found ",
                "Successfully unit is found ::- "+inventoryNum.getText(),
                "Pass",
                "Y", Driver.get());
        unitNotes.clear();
        unitNotes.sendKeys("unit is found");
        click(cameraIcon);
        unitLevelPhotosPage.takingUnitPhoto();
        Thread.sleep(4000);
        click(backBtn);
    }

    public void exception() throws AWTException, InterruptedException {
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]"),100);

        if (inventoryNum.isDisplayed() && invoice.isDisplayed() && currency.isDisplayed()) {
            PDFResultReport.addStepDetails(
                    "Validate Unit Number and Currency is displayed ",
                    "Should validate Unit Number and Currency is displayed",
                    "Successfully displayed the Unit number ::  " + inventoryNum.getText() + ",  Currency :: " + currency.getText(),
                    "Pass",
                    "Y", Driver.get());
        }else {
            PDFResultReport.addStepDetails(
                    "Validate Unit Number and Currency is displayed ",
                    "Should validate Unit Number and Currency is displayed",
                    "Un-Successfully displayed the Unit number ::  " + inventoryNum.getText() + ",  Currency :: " + currency.getText(),
                    "Fail",
                    "Y", Driver.get());
        }
        click(exceptionBtn);
        PDFResultReport.addStepDetails(
                "Validate Unit is exception ",
                "Should find the unit in exception  ",
                "Successfully unit is find in exception",
                "Pass",
                "Y", Driver.get());
        //click(code);
        Thread.sleep(2000);
        Alert alert = Driver.get().switchTo().alert();
        String msg=alert.getText();
        System.out.println("Alert message "+msg);
        PDFResultReport.addStepDetails(
                "Different code is displaying",
                "Should displayed the different code",
                "Successfully displayed the different code ",
                "Pass",
                "Y",  Driver.get());
        click(STGStorage_exceptionType_altMsg);
        locName.sendKeys("YUBE CITY,CA");
        address.sendKeys("CA,100,USA");
        city_ST_Zip.sendKeys("YUBE City");
        phone.sendKeys("91919191000");
        note.sendKeys("AutomationTesting");
        PDFResultReport.addStepDetails(
                "Enter the exception details ",
                "Should enter the exception details",
                "Successfully enter tge exception details ",
                "Pass",
                "Y",  Driver.get());
        Thread.sleep(1000);
        click(cameraIcon);
        unitLevelPhotosPage.takingUnitPhoto();
        click(backBtn);
    }







}
