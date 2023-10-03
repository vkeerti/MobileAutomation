package com.quiktrak.pages;

import org.openqa.selenium.By;

public class SignINPage1 {

    String continueBtn="android.widget.Button";

    public void signIn(){
        By.className(continueBtn);
    }
}
