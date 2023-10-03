package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SignInPage extends BasePage{

        @FindBy(className = "android.widget.EditText")
        WebElement emailAddress;
        @FindBy(className = "android.widget.Button")
        WebElement continueBtn;
        @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
        WebElement password;
        @FindBy(className ="android.widget.Button")
        WebElement signIn;

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



        public void enterEmailAddress(String eAddress,String pwd) throws InterruptedException, AWTException {
               // wait.until(ExpectedConditions.presenceOfElementLocated((By) emailAddress));
                Driver.get().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
                System.out.println("******************"+SignInWindow.getText());

                if (SignInWindow.isDisplayed()){
                        PDFResultReport.addStepDetails(
                                "Navigate to SignIn Window",
                                "Should Navigate to SignIn window",
                                "Successfully Navigate to SignIn Window",
                                "Pass",
                                "Y", (AppiumDriver) Driver.get());
                }else {
                        PDFResultReport.addStepDetails(
                                "Navigate to SignIn Window",
                                "Should Navigate to SignIn window",
                                "Successfully Navigate to SignIn Window",
                                "Fail",
                                "N", (AppiumDriver) Driver.get());
                }
                if(revoquestImg.isDisplayed()){
                        PDFResultReport.addStepDetails(
                                "Validate to Revoquest Icon is exist",
                                "Revoquest Icon should be exist",
                                "Successfully Revoquest Icon is exist",
                                "Pass",
                                "Y", (AppiumDriver) Driver.get());
                }else {
                        PDFResultReport.addStepDetails(
                                "Validate to Revoquest Icon is exist",
                                "Revoquest Icon should be exist",
                                " Revoquest Icon is not exist",
                                "Fail",
                                "Y", (AppiumDriver) Driver.get());
                }
                System.out.println("******************"+version.getText());

                if (version.isDisplayed()){
                        PDFResultReport.addStepDetails(
                                "Validate the Revoquest version",
                                "Revoquest version should be displayed ",
                                "Successfully Revoquest version should be displayed : "+version.getText(),
                                "Pass",
                                "Y", (AppiumDriver) Driver.get());
                }else {
                        PDFResultReport.addStepDetails(
                                "Validate the Revoquest version",
                                "Revoquest version should be displayed ",
                                "un-Successfully to displayed the version : "+version.getText(),
                                "Fail",
                                "Y", (AppiumDriver) Driver.get());
                }

                if (english.getText().equalsIgnoreCase("English")){
                        PDFResultReport.addStepDetails(
                                "Validate by default english language should selected ",
                                "Should select the english language by default ",
                                "Successfully by default english language is select : "+english.getText(),
                                "Pass",
                                "Y", (AppiumDriver) Driver.get());
                }else {
                        PDFResultReport.addStepDetails(
                                "Validate by default english language should selected ",
                                "Should select the english language by default ",
                                "Un-Successfully to select the language : "+english.getText(),
                                "Fail",
                                "Y", (AppiumDriver) Driver.get());
                }


                Click(emailAddress);
                sendkeys(emailAddress,eAddress);
                PDFResultReport.addStepDetails(
                        "Enter valid email address",
                        "Should enter the valid email address",
                        "Successfully enter the valid email address : "+eAddress,
                        "Pass",
                        "Y", (AppiumDriver) Driver.get());
                Driver.get().manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
               // wait.until(ExpectedConditions.presenceOfElementLocated((By) continueBtn));
                Click(continueBtn);
                Driver.get().manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
               PDFResultReport.addStepDetails(
                        "Click on continue button",
                        "Should click on continue button",
                        "Successfully click on continue button ",
                        "Pass",
                        "Y", (AppiumDriver) Driver.get());
                Thread.sleep(15000);
                Click(password);
                sendkeys(password,pwd);
             /* PDFResultReport.addStepDetails(
                        "Enter the Password",
                        "Should enter the password",
                        "Successfully enter the password : "+pwd,
                        "Pass",
                        "Y", (AppiumDriver) Driver.get());*/
                click(signIn);
                 Driver.get().findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.settings:id/password_entry']")).sendKeys("8622");
                Driver.get().findElement(By.xpath("//android.widget.Button[@text='NEXT']")).click();

        }
}
