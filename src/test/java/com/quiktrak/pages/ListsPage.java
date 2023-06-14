package com.quiktrak.pages;

import com.quiktrak.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*This page contains
 * Locaters of Web Elements
 * methods for relevant actions
 * */
public class ListsPage extends BasePage {
    @FindBy(xpath = "//span[@class='rnvText']/span")
    WebElement loggedUser;
    @FindBy(xpath = "//span[text()='Lists']")
    WebElement listsMenu;

    @FindBy(xpath = "//span[text()='Inspection Review']")
    WebElement inspcReview;

    @FindBy(xpath = "//span[text()='Dealers']")
    WebElement dealerList;

    @FindBy(xpath = "//span[text()='Inspectors']")
    WebElement inspectorsList;

    @FindBy(xpath = "//span[text()='Clients']")
    WebElement clientsList;

    @FindBy(xpath = "//span[text()='Locations']")
    WebElement locationsList;

    @FindBy(xpath = "//span[text()='Inventory']")
    WebElement inventoryList;

    @FindBy(xpath = "//span[text()='Statistics']")
    WebElement statisticsList;

    @FindBy(xpath = "//span[text()='Limitations']")
    WebElement limitationsList;

    @FindBy(xpath = "//span[text()='Messages']")
    WebElement messagesList;

    @FindBy(xpath = "//span[text()='Calendar']")
    WebElement calendarList;

    @FindBy(xpath = "//tr[@id='ctl00_ctl00_cphPageContent_cphPageContent_RadGrid1_ctl00__0']")
    WebElement jobSelect;

    @FindBy(xpath = "//span[text()='Edit']/ancestor::button")
    WebElement edtMstTab;

    @FindBy(xpath = "//button[@name='ctl00$cphPopupContent$fvAuditDetails$btnSave']//span[text()='Save']")
    WebElement saveMstTab;

    @FindBy(xpath = "//div[@id='cphPageContent_pageview_MasterDetails']/iframe")
    WebElement iPanel;

    @FindBy(xpath = "//span[text()='Units']")
    WebElement unitsTab;

    @FindBy(xpath = "//span[text()='Locations']")
    WebElement locationsTab;

    @FindBy(xpath = "//span[text()='Reports']/parent::span")
    WebElement reportsTab;

    public void verifyListsDetails() throws InterruptedException {

        //click(listsDetail);
        listValues();
        click(inspcReview);
        click(jobSelect);
        Driver.get().switchTo().frame(wait.until(ExpectedConditions.elementToBeClickable(iPanel)));
        click(edtMstTab);
        click(saveMstTab);
        Driver.get().switchTo().parentFrame();
        click(unitsTab);
        click(locationsTab);
        click(reportsTab);
        listValues();
        click(dealerList);
        click(jobSelect);
        click(locationsList);
        click(inventoryList);
        listValues();
        click(inspectorsList);
        click(jobSelect);
        click(statisticsList);
        click(limitationsList);
        click(messagesList);
        click(calendarList);
        listValues();
        click(clientsList);

    }

    public void listValues() throws InterruptedException {

        WebElement listMenu = listsMenu;
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(listMenu).perform();

    }

}

