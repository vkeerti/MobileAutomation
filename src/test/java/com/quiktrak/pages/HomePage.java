package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.MobileUtils;
import com.quiktrak.utilities.PDFResultReport;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.bs.A;
import io.cucumber.java.eo.Se;
import org.apache.http.util.Asserts;
import org.bouncycastle.crypto.tls.HandshakeType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class HomePage extends BasePage{
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement homeWindow;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement jobInformationTag;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.Button[1]")
    WebElement cameraIcon;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.Button[2]")
    WebElement informationIcon;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.Button[3]")
    WebElement menuInfo;

    @FindBy(className="android.widget.ImageButton")
    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageButton
    WebElement backButtonIcon;

    @FindBy(id="com.quiktrak.rqmobile:id/OverlayDealerText")
    WebElement jobName;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement jobNumber;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[1]")
    WebElement locationName;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.Button[1]")
    WebElement totalsTabBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.Button[2]")
    WebElement notesTabBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.Button[3]")
    WebElement auditorsTabBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement auditorsFocus;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.Button[4]")
    WebElement informationTabBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement informationJobNo;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]")
    WebElement informationName;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[6]")
    WebElement informationDivision;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[8]")
    WebElement informationLastAuditDate;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[10]")
    WebElement informationQTProc;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement informationClient;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]")
    WebElement informationClientName;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[6]")
    WebElement informationClientAddress;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc=\"stckUnitTotals\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
    WebElement unitTotalsTag;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"stckUnitTotals\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
    ////android.view.ViewGroup[@content-desc='stckUnitTotals']/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]
    WebElement TotalUnits;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"stckUnitTotals\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
    WebElement TotalFound;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"stckUnitTotals\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
    WebElement TotalException;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"stckUnitTotals\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
    WebElement TotalIncomplete;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc=\"stckBusRuleFailuresSum\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement businessRuleFailuresTag;

    @FindBy(id = "com.quiktrak.rqmobile:id/busRuleAuditButton")
    WebElement AuditsCount;

    @FindBy(id = "//android.view.ViewGroup[@content-desc=\"stckBusRuleFailuresSum\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement Audits;

    @FindBy(id = "com.quiktrak.rqmobile:id/busRulesCircleButton")
    WebElement UnitsCount;

    @FindBy(id = "//android.view.ViewGroup[@content-desc=\"stckBusRuleFailuresSum\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement Units;

    @FindBy(id = "com.quiktrak.rqmobile:id/questionCircleButton")
    WebElement QuestionsCount;

    @FindBy(id = "//android.view.ViewGroup[@content-desc=\"stckBusRuleFailuresSum\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[3]")
    WebElement Question;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc='footer'])[2]/android.view.ViewGroup[1]/android.widget.ImageView")
    WebElement footerUnits;

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc='footer'])[2]/android.view.ViewGroup[2]/android.widget.ImageView")
    WebElement footerWizard;

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc='footer'])[2]/android.view.ViewGroup[3]/android.widget.ImageView")
    WebElement footerLocations;

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc='footer'])[2]/android.view.ViewGroup[4]/android.widget.ImageView")
    WebElement footerFinalize;

    @FindBy(id= "com.quiktrak.rqmobile:id/OverlayDealerText")
    WebElement jobInfo_DealerText;

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[1]")
    WebElement jobInfo_No_location;

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement job_Num;

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement locations_num;

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
    WebElement notesName;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button")
    WebElement notesPhoneClearance;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    WebElement notePhoneInPersonSelect;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    WebElement auditorsTag;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    WebElement InformationJobInformationTag;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement InformationjobNo;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]")
    WebElement InformationName;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[6]")
    WebElement InformationDivision;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[8]")
    WebElement InformationLastAuditDate;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[10]")
    WebElement InformationQTProc;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    WebElement InformationClientInfoTag;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement InformationClient;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]")
    WebElement InformationNamea;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[6]")
    WebElement INformationAddress;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    WebElement AdditionalInformationTag;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageButton")
    WebElement backModeBtn;
    SelectLocationPage selectLocationPage = new SelectLocationPage();
    ListPage listPage = new ListPage();
    public void  validateHomeScreen() throws AWTException, InterruptedException {
        Thread.sleep(2000);
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"),2000);
        if (homeWindow.isDisplayed()){
            PDFResultReport.addStepDetails(
                    "Navigate to home screen",
                    "Should navigate to home screen",
                    "Successfully navigate to home screen",
                    "Pass",
                    "Y",Driver.get());
        }else {
            PDFResultReport.addStepDetails(
                    "Navigate to home screen",
                    "Should navigate to home screen",
                    "Un-Successfully navigate to home screen",
                    "Fail",
                    "Y",Driver.get());
        }
        Asserts.check(backButtonIcon.isDisplayed(),"BackIcon is displayed");
        Asserts.check(cameraIcon.isDisplayed(),"CameraIcon is Displayed");
        Asserts.check(informationIcon.isDisplayed(),"InformationIcon is Displayed");
        Asserts.check(menuInfo.isDisplayed(),"MenuIcon is Displayed");
        PDFResultReport.addStepDetails(
                "Validate Back button icon,Camera icon,Information icon and Menu icon is displayed",
                "Back button icon,Camera icon,Information icon and Menu icon should be displayed",
                "Back button icon,Camera icon,Information icon and Menu icon is successfully display",
                "Pass",
                "Y",Driver.get());
        Asserts.check(jobInfo_DealerText.isDisplayed(),"Dealer name is Displayed");
        Asserts.check(job_Num.isDisplayed(),"Dealer Number is Displayed");
        Asserts.check(jobInfo_No_location.isDisplayed(),"Job location  is Displayed");
        Asserts.check(locations_num.isDisplayed(),"Location Number is displayed");
        PDFResultReport.addStepDetails(
                "Validate Job Information is displayed as Deal Name :- "+jobInfo_DealerText.getText()+" , Deal No :- "+job_Num.getText(),
                "Job Information should be displayed as Deal Name :- "+jobInfo_DealerText.getText()+" , Deal No :- "+job_Num.getText(),
                "Successfully Job Information should be displayed as Deal Name :- "+jobInfo_DealerText.getText()+" , Deal No :- "+job_Num.getText(),
                "Pass",
                "Y",Driver.get());
        Asserts.check(totalsTabBtn.isDisplayed(),"Totals tab button name is Displayed");
        Asserts.check(notesTabBtn.isDisplayed(),"Notes tab button name is Displayed");
        Asserts.check(auditorsTabBtn.isDisplayed(),"Auditors tab button name is Displayed");
        Asserts.check(informationTabBtn.isDisplayed(),"Information tab button name is Displayed");
        PDFResultReport.addStepDetails(
                "Validate TOTALS Tab button,NOTES Tab button, AUDITORS Tab button and INFORMATION Tab button is displayed",
                "Should displayed TOTALS Tab button,NOTES Tab button, AUDITORS Tab button and INFORMATION Tab button",
                "Successfully displayed TOTALS Tab button,NOTES Tab button, AUDITORS Tab button and INFORMATION Tab button ",
                "Pass",
                "Y",Driver.get());

        Asserts.check(footerUnits.isDisplayed(),"Footer Units button name is Displayed");
        Asserts.check(footerFinalize.isDisplayed(),"Footer Finalize button name is Displayed");
        Asserts.check(footerLocations.isDisplayed(),"Footer Location button name is Displayed");
        Asserts.check(footerWizard.isDisplayed(),"Footer wizard button name is Displayed");
        PDFResultReport.addStepDetails(
                "Validate Footer Units button,Finalize button,Location button and Wizard button is displayed",
                "Should displayed footer Units button,Finalize button,Location button and Wizard button is displayed",
                "Successfully displayed Footer Units button,Finalize button,Location button and Wizard button is displayed ",
                "Pass",
                "Y",Driver.get());
    }

    public void capturePhoto() throws InterruptedException {
        click(cameraIcon);
    }

    public void validatingAfterAudit() throws AWTException, InterruptedException {
        Thread.sleep(2000);
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"),2000);
        if (homeWindow.isDisplayed()){
            PDFResultReport.addStepDetails(
                    "Navigate to home screen",
                    "Should navigate to home screen",
                    "Successfully navigate to home screen",
                    "Pass",
                    "Y",Driver.get());
        }else {
            PDFResultReport.addStepDetails(
                    "Navigate to home screen",
                    "Should navigate to home screen",
                    "Un-Successfully navigate to home screen",
                    "Fail",
                    "Y",Driver.get());
        }
        Asserts.check(TotalUnits.isDisplayed(),"Units  displayed");
        System.out.println("*****************"+ TotalUnits.getText());
        Asserts.check(TotalFound.isDisplayed(),"Found  displayed");
        System.out.println("*****************"+TotalFound.getText());
        Asserts.check(TotalException.isDisplayed(),"Exception  displayed");
        System.out.println("*****************"+TotalException.getText());
        Asserts.check(TotalIncomplete.isDisplayed(),"Incomplete  displayed");
        System.out.println("*****************"+TotalIncomplete.getText());
        PDFResultReport.addStepDetails(
                "Validate Total Units,Found,Exception and Incomplete is displayed before starting audit",
                "Should displayed the Total Units,Found,Exception and Incomplete before starting audit ",
                "Successfully displayed the Total Units :-- "+TotalUnits.getText()+" , Found :-- "+TotalFound.getText()+",Exception :--  "+TotalException.getText()+" and Incomplete :-- "+TotalIncomplete.getText()+" before starting audit",
                "Pass",
                "Y",Driver.get());


    }
    public void clickOnTotalTab() throws InterruptedException, AWTException {
        click(totalsTabBtn);
        Thread.sleep(1000);
        click(TotalIncomplete);
        Thread.sleep(1000);
        PDFResultReport.addStepDetails(
                "Click on Incomplete and navigate to select location window",
                "click on incomplete and should navigate to select location window",
                "Successfully click on incomplete and should navigate to select location window ",
                "Pass",
                "Y",Driver.get());
    }

    public void clickOnTotalsTab() throws InterruptedException, AWTException {
        click(totalsTabBtn);
        Asserts.check(unitTotalsTag.isDisplayed(),"Units Total tag is displayed");
        Asserts.check(TotalUnits.isDisplayed(),"Units  displayed");
        System.out.println("*****************"+TotalUnits.getText());
        Asserts.check(TotalFound.isDisplayed(),"Found  displayed");
        System.out.println("*****************"+TotalFound.getText());
        Asserts.check(TotalException.isDisplayed(),"Exception  displayed");
        System.out.println("*****************"+TotalException.getText());
        Asserts.check(TotalIncomplete.isDisplayed(),"Incomplete  displayed");
        System.out.println("*****************"+TotalIncomplete.getText());

        PDFResultReport.addStepDetails(
                "Validate Total Units,Found,Exception and Incomplete is displayed before starting audit",
                "Should displayed the Total Units,Found,Exception and Incomplete before starting audit ",
                "Successfully displayed the Total Units :-- "+TotalUnits.getText()+" , Found :-- "+TotalFound.getText()+",Exception :--  "+TotalException.getText()+" and Incomplete :-- "+TotalIncomplete.getText()+" before starting audit",
                "Pass",
                "Y",Driver.get());
        Asserts.check(businessRuleFailuresTag.isDisplayed(),"Business rule should displayed");
        System.out.println("**********  : "+businessRuleFailuresTag.getText());
        PDFResultReport.addStepDetails(
                "Validate business rules details should be displayed",
                "Should display the business rules details",
                "Successfully displayed the ",
                "Pass",
                "Y",Driver.get());
    }

    public void clickOnNotesTab() throws InterruptedException, AWTException {
        click(notesTabBtn);
        MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"),2000);
        PDFResultReport.addStepDetails(
                "Click on Notes tab and it navigate to Notes window",
                "Should navigate to Note window",
                "Successfully navigate to Note window ",
                "Pass",
                "Y",Driver.get());
        sendkeys(notesName,"Testing");
        click(notesPhoneClearance);
        click(notePhoneInPersonSelect);
        PDFResultReport.addStepDetails(
                "Enter the Notes Name and select the Phone Clearance ",
                "Should enter Notes Name and select the Phone Clearance ",
                "Successfully enter Notes Name and select the Phone Clearance ",
                "Pass",
                "Y",Driver.get());
    }

    public void clickOnAuditorsTab() throws InterruptedException, AWTException {
        click(auditorsTabBtn);
        Thread.sleep(2000);
        //MobileUtils.waitForPresenceOfElement(By.xpath(""),2000);
        PDFResultReport.addStepDetails(
                "Click on auditors tab and navigate to Auditor window",
                "Should navigate to Auditor window",
                "Successfully navigate to Auditor window ",
                "Pass",
                "Y",Driver.get());
        click(auditorsFocus);

    }

    public void clickOnInformationTab() throws InterruptedException, AWTException {
        click(informationTabBtn);
        Thread.sleep(2000);
        //MobileUtils.waitForPresenceOfElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"),2000);
        PDFResultReport.addStepDetails(
                "Click on Information tab and navigate to Information window",
                "Should navigate to Information window",
                "Successfully navigate to Information window ",
                "Pass",
                "Y",Driver.get());

        PDFResultReport.addStepDetails(
                "Dealer and Client details should displayed ",
                " Dealer number : ,"+informationJobNo.getText()+", Dealer Name : "+informationName.getText()+" , Division :"+informationDivision.getText()+", Client No : "+informationClient.getText()+", Client Name : "+informationClientName.getText()+", Client Address : "+informationClientAddress.getText(),
                "Successfully displayed the details  Dealer number : ,"+informationJobNo.getText()+", Dealer Name : "+informationName.getText()+" , Division :"+informationDivision.getText()+", Client No : "+informationClient.getText()+", Client Name : "+informationClientName.getText()+", Client Address : "+informationClientAddress.getText(),
                "Pass",
                "Y",Driver.get());
    }

    public void validateFooter() throws InterruptedException, AWTException {
        click(footerLocations);
        Thread.sleep(1000);
        PDFResultReport.addStepDetails(
                "Click on location and navigate to select the location",
                "Should click on location and select the location",
                "Successfully navigate location window to select the location ",
                "Pass",
                "Y",Driver.get());
        selectLocationPage.selectLocation1();
        click(footerUnits);
        Thread.sleep(1000);
        PDFResultReport.addStepDetails(
                "Click on units icon and navigate to List",
                "Should click on units icon and navigate to List",
                "Successfully click on units icon and navigate to List ",
                "Pass",
                "Y",Driver.get());
        listPage.backBtn();
        Thread.sleep(1000);
        click(footerWizard);
        Thread.sleep(1000);
        PDFResultReport.addStepDetails(
                "Click on FooterWizard and navigate to mode",
                "Should click on FooterWizard and navigate to mode",
                "Successfully navigate location mode window ",
                "Pass",
                "Y",Driver.get());
        click(backModeBtn);
        Thread.sleep(500);
        click(footerFinalize);
        Thread.sleep(1000);
        PDFResultReport.addStepDetails(
                "Click on Finalize and navigate to mode",
                "Should click on FooterWizard and navigate to mode",
                "Successfully navigate location mode window ",
                "Pass",
                "Y",Driver.get());
    }

    public void clickOnUnits() throws InterruptedException {
        click(TotalUnits);

    }



}
