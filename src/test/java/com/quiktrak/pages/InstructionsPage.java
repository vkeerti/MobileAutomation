package com.quiktrak.pages;

import com.itextpdf.text.pdf.security.XpathConstructor;
import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class InstructionsPage extends BasePage{


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    WebElement clientInstructionTag;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button")
    WebElement acceptBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement instructionWindow;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    WebElement clientNumber;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    WebElement instructionMsg;

    public void validateInstructions() throws AWTException {
        if (instructionWindow.isDisplayed()){
            PDFResultReport.addStepDetails(
                    "Validate user need to navigate the Instructions window",
                    "Should navigate to the Instructions window ",
                    "Successfully navigate to the Instruction window ",
                    "Pass",
                    "Y",  Driver.get());
        }else {
            PDFResultReport.addStepDetails(
                    "Validate user need to navigate the Instructions window",
                    "Should navigate to the Instructions window ",
                    "Un-Successfully navigate to the Instruction window ",
                    "Pass",
                    "Y",  Driver.get());
        }
        if (clientNumber.isDisplayed()){
            PDFResultReport.addStepDetails(
                    "Client number ",
                    "Client number should displayed  ",
                    "Successfully client number should be displayed, Client Number ::-- "+clientNumber.getText(),
                    "Pass",
                    "Y",  Driver.get());
        }else {
            PDFResultReport.addStepDetails(
                    "Client number ",
                    "Client number should displayed  ",
                    "Un-Successfully client should be displayed,Client Number ----"+clientNumber.getText(),
                    "Fail",
                    "Y",  Driver.get());
        }
        if (instructionMsg.isDisplayed()){
            PDFResultReport.addStepDetails(
                    "Client instructions  msg ",
                    "Client instructions  msg should displayed ",
                    "Successfully Client instructions  msg  ::-- "+instructionMsg.getText(),
                    "Pass",
                    "Y",  Driver.get());
        }else {
            PDFResultReport.addStepDetails(
                    "Client instructions  msg ",
                    "Client instructions  msg should displayed ",
                    "Un-Successfully Client instructions  msg  ::-- "+instructionMsg.getText(),
                    "Pass",
                    "Y",  Driver.get());
        }
        acceptBtn.click();


    }

}
