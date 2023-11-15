package com.quiktrak.step_definitions;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.PDFResultReport;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;


// In this class we define the before and after methods that runs for each step
// After method takes the screenshot for failedscenarios at the end of step
public class Hooks {

    @Before("@mobile")
    public void setUp() {
        System.out.println("Setup");
        PDFResultReport.suiteName = "RevoquestApp";
        PDFResultReport.generateSuiteResultFolder("c:\\Data");
        PDFResultReport.captureTestCaseStartTime();
        PDFResultReport.createPDFfile("Revoquest_Automation_Report");
    }

    @After("@mobile")
    public void afterPDF() throws Exception {
        PDFResultReport.createTestRunReport("RQ Mobile Automation" ,"Stage");
        PDFResultReport.addSummaryReport("RQ Mobile Automation","1) Launch RQ Mobile App 2)Validate SignIn 3)Validate Safe Message 4)Validate sync process ,5)Select the jobs and click Open, 6) Validate Instructions, 7) Validate Home, 8) Validate Location, 9) Validate Setting, 10) Validate Auditing, 12) Validate Footer 11) Close the app" ,"BEELER TRACTOR COMPANY","Mahindra USA LLC","Mobile");
        PDFResultReport.captureTestCaseEndTime();
        PDFResultReport.generatePDFSummaryReport("Mobile_Automation_Report");
        PDFResultReport.generatePDFStepdetails("StepDetailsSummary");
        Driver.closeDriver();
    }

}
