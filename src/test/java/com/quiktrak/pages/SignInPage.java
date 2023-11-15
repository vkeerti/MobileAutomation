package com.quiktrak.pages;

import com.quiktrak.utilities.MobileUtils;
import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class SignInPage extends BasePage{
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10000);
        @FindBy(className = "android.widget.EditText")
        WebElement emailAddress;

        @FindBy(className = "android.widget.TextView")
        //xpath = /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView
        //id =com.android.permissioncontroller:id/permission_message
        WebElement allowRevoquestToTakePictAndRecordsViodes;

        @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
        // id =com.android.permissioncontroller:id/permission_allow_foreground_only_button
        WebElement whileUsingAppInTakePict;

        @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")
        // id =com.android.permissioncontroller:id/permission_allow_one_time_button
        WebElement onlyThisTimeInTakePict;

        @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[3]")
        // id =com.android.permissioncontroller:id/permission_deny_button
        WebElement dontAllowInTakePict;

        @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
        WebElement locationIcon;

        @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
        WebElement allowRevoquestToAccessThisDevicesLocationMsg;

        @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RadioGroup/android.widget.RadioButton[1]")
        // id= com.android.permissioncontroller:id/permission_location_accuracy_radio_fine
        WebElement precise;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RadioGroup/android.widget.RadioButton[2]")
        //id = com.android.permissioncontroller:id/permission_location_accuracy_radio_coarse
        WebElement approximate;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
        //id = com.android.permissioncontroller:id/permission_allow_foreground_only_button
        WebElement whileUsingTheAppLocation;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
        // id = com.android.permissioncontroller:id/permission_allow_one_time_button
        WebElement onlyThisTimeLocation;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
        // id= com.android.permissioncontroller:id/permission_deny_button
        WebElement dontAllowLocation;


        @FindBy(className = "android.widget.Button")
        WebElement continueBtn;
        @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
        WebElement password;
        @FindBy(className ="android.widget.Button")
        WebElement signIn;

        @FindBy(id="android:id/message")
        WebElement invalidSignInMsg;

        @FindBy(id="android:id/button2")
        WebElement invalidOkBtn;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
        WebElement privacyPolicy;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView[2]")
        WebElement english;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView[1]")
        WebElement version;

        @FindBy(className = "android.widget.ImageView")
        WebElement revoquestImg;

        @FindBy(id="com.quiktrak.rqmobile:id/toolbar")
        WebElement SignInWindow;

        @FindBy(id="com.quiktrak.rqmobile:id/alertTitle")
        WebElement alertInValidate;

        public void signIn(String emailName) throws AWTException {
                Click(emailAddress);
                sendkeys(emailAddress,emailName);
                Driver.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                PDFResultReport.addStepDetails(
                        "Enter the email address",
                        "Should enter the email address",
                        "Successfully enter the email address : "+emailName,
                        "Pass",
                        "Y", Driver.get());
                Click(continueBtn);
                Driver.get().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
                PDFResultReport.addStepDetails(
                        "Click on continue button",
                        "Should click on continue button",
                        "Successfully click on continue button ",
                        "Pass",
                        "Y",  Driver.get());

        }

        public void launchRQMobile() throws AWTException, InterruptedException {
                if (Driver.get().isAppInstalled("com.quiktrak.rqmobile")) {
                        PDFResultReport.addStepDetails(
                                "Validate RQ Mobile app is install and launched",
                                "RQ Mobile app should installed and launched",
                                "Successfully RQ Mobile app is installed and launched",
                                "Pass",
                                "Y",Driver.get());
                        MobileUtils.waitForPresenceOfElement(By.id("com.quiktrak.rqmobile:id/toolbar"), 300);
                }else {
                        String andAppUrl=System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                                + File.separator + "java" + File.separator + "com"+ File.separator +"quiktrak" + File.separator +"APKFile"+File.separator+"com.quiktrak.rqmobile.apk";
                        Driver.get().installApp(andAppUrl);
                        Thread.sleep(10000);
                        PDFResultReport.addStepDetails(
                                "RQ Mobile app is installing ",
                                "RQ Mobile app should installing ",
                                "Successfully RQ Mobile app is installed and launched",
                                "Pass",
                                "Y",Driver.get());

                }
        }

        public void enterPassword(String pwd) throws InterruptedException {
                //  BrowserUtils.waitForPresenceOfElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"),20000);
                Thread.sleep(15000);
                Driver.get().manage().timeouts().implicitlyWait(400,TimeUnit.SECONDS);
                Click(password);
                sendkeys(password,pwd);
                click(signIn);
        }

        public void validateSignIN() throws InterruptedException, AWTException {
                // Sign Is Displayed
                MobileUtils.waitForPresenceOfElement(By.id("com.quiktrak.rqmobile:id/toolbar"),1000);
                if (SignInWindow.isDisplayed()){
                        PDFResultReport.addStepDetails(
                                "Validate user is navigate to SignIn Window",
                                "Should navigate to SignIn window",
                                "Successfully Navigate to SignIn Window",
                                "Pass",
                                "Y", Driver.get());
                }else {
                        PDFResultReport.addStepDetails(
                                "Validate user is navigate to SignIn Window",
                                "Should Navigate to SignIn window",
                                "Successfully Navigate to SignIn Window",
                                "Fail",
                                "N", Driver.get());
                }
                // RQ Logo, Version and Privacy Is Displayed
                if(revoquestImg.isDisplayed()||version.isDisplayed()||privacyPolicy.isDisplayed()){
                        PDFResultReport.addStepDetails(
                                "Validate to RQ Icon, Version and Privacy Policy is exist, RQ Version :: "+version.getText()+" , PrivacyPolicy :: "+privacyPolicy.getText(),
                                "RQ Icon, Version and Privacy Policy should be displayed, RQ Version :: "+version.getText()+" , PrivacyPolicy :: "+privacyPolicy.getText(),
                                "Successfully displayed the RQ ICON , Version and Privacy Policy",
                                "Pass",
                                "Y",  Driver.get());
                }else {
                        PDFResultReport.addStepDetails(
                                "Validate to RQ Icon, Version and Privacy Policy is exist, RQ Version :: "+version.getText()+" , PrivacyPolicy :: "+privacyPolicy.getText(),
                                "RQ Icon, Version and Privacy Policy should be displayed, RQ Version :: "+version.getText()+" , PrivacyPolicy :: "+privacyPolicy.getText(),
                                "Un-Successfully displayed the RQ ICON , Version and Privacy Policy",
                                "Fail",
                                "Y",  Driver.get());
                }

                // RQ English
                if (english.isDisplayed()){
                        PDFResultReport.addStepDetails(
                                "Validate by default english language is set as default",
                                "Should select the english language by default ",
                                "Successfully by default language is select as : "+english.getText(),
                                "Pass",
                                "Y",Driver.get());
                }else {
                        PDFResultReport.addStepDetails(
                                "Validate by default english language should selected ",
                                "Should select the english language by default ",
                                "Un-Successfully to select the language : "+english.getText(),
                                "Fail",
                                "Y", Driver.get());
                }

                // continue button is enable
                if (!continueBtn.isEnabled()){
                        PDFResultReport.addStepDetails(
                                "Validate continue button is disabled when user don't enter any email address",
                                "Continue button should be disabled ",
                                "Continue button should be disabled ",
                                "Pass",
                                "Y",  Driver.get());
                }else {
                        PDFResultReport.addStepDetails(
                                "Validate Continue button is disabled",
                                "Continue button should be disabled ",
                                "Continue button should be enabled : ",
                                "Fail",
                                "Y",  Driver.get());
                }

        }
}
