package com.quiktrak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationsPage extends BasePage{

    //android.widget.Button[@text="NEXT"]
    //android.widget.ListView/android.widget.LinearLayout[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView
    @FindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement location1;
    //android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView

    @FindBy(xpath = "//android.widget.Button[@text='NEXT']")
    WebElement nextBtn;

    @FindBy(xpath = "   //android.widget.Button[@text='AUDITOR']")
    WebElement auditorBtn;

    @FindBy(xpath = "//android.widget.Button[@text='ACCEPT']")
    WebElement acceptBtn;


    //android.widget.Button[@text="AUDITOR"]
    //android.widget.Button[@text="ACCEPT"]

}

