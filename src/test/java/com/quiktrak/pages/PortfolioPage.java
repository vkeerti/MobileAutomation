package com.quiktrak.pages;

import com.quiktrak.utilities.BrowserUtils;
import com.quiktrak.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

/*This page contains
 * Locaters of Web Elements
 * methods for relevant actions
 * */
public class PortfolioPage extends BasePage {


    @FindBy(xpath = "//span[text()='Portfolio']")
    WebElement portfolioMenu;

    @FindBy(xpath = "//span[text()='Reports']")
    WebElement portfolioReports;

    @FindBy(id = "//span[text()='Dashboard']")
    WebElement dashboardReview;

    @FindBy(xpath = "//span[text()='Pivot View']")
    WebElement pivotReview;

    @FindBy(xpath = "//span[text()='Inventory View']")
    WebElement inventoryReview;

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

    public void verifyPorfolioDetailTabsLists() throws InterruptedException {
        List<String> portfolioList = Arrays.asList("Reports","Dashboard","Pivot View","Inventory View");
        portfolioList.stream().forEach(label->{
            try {
                new Actions(Driver.get()).moveToElement(portfolioMenu).perform();
                Driver.get().findElement(By.linkText(label)).click();
                BrowserUtils.waitForPageToLoad(5);
            } catch (TimeoutException e){
            }}
        );


    }

}
