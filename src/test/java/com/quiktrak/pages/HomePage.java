package com.quiktrak.pages;

import com.quiktrak.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*This page contains
 * Locaters of Web Elements
 * methods for relevant actions
 * */
public class HomePage extends BasePage {

    @FindBy(xpath = "//span[text()='Home']")
    WebElement homeTab;

    @FindBy(xpath = "//span[text()='Audits']")
    WebElement auditTab;

    @FindBy(xpath = "//span[text()='Contact']")
    WebElement contactTab;

    @FindBy(xpath = "//span[text()='Utilities']")
    WebElement UtlTab;

    @FindBy(xpath = "//span[@class='rnvText']/span")
    WebElement loggedUser;

    @FindBy(xpath = "//span[text()='Lists']")
    WebElement listsMenu;

    @FindBy(xpath = "//span[text()='Inspection Review']")
    WebElement inspcReview;

    @FindBy(id = "//div[@id='header_text']")
    WebElement inspReviewList;

    @FindBy(xpath = "//span[text()='Dealers']")
    WebElement dealerList;

    @FindBy(xpath = "//span[text()='Inspectors']")
    WebElement inspectorsList;

    @FindBy(xpath = "//span[text()='Clients']")
    WebElement clientsList;


    @FindBy(xpath = "//span[text()='Portfolio']")
    WebElement portfolioMenu;

    @FindBy(xpath = "//span[text()='Reports']")
    WebElement reportsReview;

    @FindBy(id = "//div[@id='Dashboard']")
    WebElement dashboardReview;

    @FindBy(xpath = "//span[text()='Pivot View']")
    WebElement pivotReview;

    @FindBy(xpath = "//span[text()='Inspectors']")
    WebElement inventoryReview;


    public void goToVerifyHomePage() {
        String actualText = homeTab.getText();
        String expectText = "Home";
        Assert.assertEquals(expectText, actualText);
        System.out.println("value is " + actualText);
    }

    public void verifyHomeDashboardTopMenu(String audits, String contact, String utilities, String user) {
        String actualTextAdt = auditTab.getText();
        String expectTextAdt = audits;
        String actualTextCnt = contactTab.getText();
        String expectTextCnt = contact;
        String expectTextutl = UtlTab.getText();
        String actualTextUtl = utilities;
        String actualLoggedUsr = loggedUser.getAttribute("innerText");
        String expectLoggedUsr = user;

        Assert.assertEquals(expectTextAdt, actualTextAdt);
        Assert.assertEquals(expectTextCnt, actualTextCnt);
        Assert.assertEquals(expectTextutl, actualTextUtl);
        Assert.assertEquals(expectTextutl, actualTextUtl);
        Assert.assertTrue(actualLoggedUsr.contains(expectLoggedUsr));

        System.out.println("Audit value is " + actualTextAdt);
        System.out.println("Contact value is " + actualTextCnt);
        System.out.println("Utility value is " + actualTextUtl);
        System.out.println("Actual User value is " + actualLoggedUsr);

        click(auditTab);
        BrowserUtils.waitForPageToLoad(10);
        click(contactTab);
        click(UtlTab);

        click(listsMenu);
        click(inspcReview);
        click(listsMenu);
        click(dealerList);
        click(listsMenu);
        click(inspectorsList);
        click(listsMenu);
        click(clientsList);
        BrowserUtils.waitForPageToLoad(20);

        click(portfolioMenu);
        click(reportsReview);
        click(homeTab);
        /*click(portfolioMenu);
        click(dashboardReview);
        click(portfolioMenu);
        click(pivotReview);
        click(portfolioMenu);
        click(inventoryReview);*/

    }


}
