package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*This page contains
 * Locaters of Web Elements
 * methods for relevant actions
 * */
public class UtilitiesPage extends BasePage {

    @FindBy(xpath = "//span[text()='Audits']")
    WebElement auditTab;

    @FindBy(xpath = "//span[@class='rnvText']/span")
    WebElement loggedUser;

    @FindBy(xpath = "//span[text()='Portfolio']")
    WebElement portfolioMenu;

    @FindBy(xpath = "//span[text()='Reports']")
    WebElement reportsReview;

    @FindBy(xpath = "//span[@id='ctl00_ctl00_cphPageContent_cphPageContent_RadGrid1_ctl00_ctl04_lblJobNo']")
    WebElement adtDetail;

    @FindBy(xpath = "//span[text()='Edit']/ancestor::button")
    WebElement edtMstTab;

    @FindBy(xpath = "//button[@name='ctl00$cphPopupContent$fvAuditDetails$btnSave']//span[text()='Save']")
    WebElement saveMstTab;

    @FindBy(xpath = "//span[text()='Analysis']")
    WebElement analysisTab;

    @FindBy(xpath = "//span[text()='Units']")
    WebElement unitsTab;

    @FindBy(xpath = "//span[text()='Locations']")
    WebElement locationsTab;

    @FindBy(xpath = "//span[text()='Reports']/parent::span")
    WebElement reportsTab;

    @FindBy(xpath = "//div[@id='cphPageContent_pageview_MasterDetails']/iframe")
    WebElement iPanel;

    public void verifyAuditDetailTabsLists() throws InterruptedException {

        click(auditTab);
        click(adtDetail);
        Driver.get().switchTo().frame(wait.until(ExpectedConditions.elementToBeClickable(iPanel)));
        click(edtMstTab);
        click(saveMstTab);
        Driver.get().switchTo().parentFrame();
        click(analysisTab);
        click(unitsTab);
        click(locationsTab);
        click(reportsTab);

    }

}
