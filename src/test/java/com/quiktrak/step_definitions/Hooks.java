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
        //Driver.get().manage().timeouts().implicitlyWait(Duration.of(20));
       // Driver.get().manage().window().maximize();
        System.out.println("Setup");
        PDFResultReport.suiteName = "RevoquestApp";
        PDFResultReport.generateSuiteResultFolder("c:\\Data");
        PDFResultReport.captureTestCaseStartTime();
        PDFResultReport.createPDFfile("Revoquest_Automation_Report");
    }

    @After("@mobile")
    public void tearDown(Scenario scenario) throws Exception {
       /* if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }*/
        PDFResultReport.createTestRunReport("Validating Revoquest Mobile Automation" ,"Stage");
        PDFResultReport.addSummaryReport("Validating Revoquest Mobile Automation","Revoquest Mobile Automation","80191","78171","Mobile");
        PDFResultReport.captureTestCaseEndTime();
        PDFResultReport.generatePDFSummaryReport("Mobile_Automation_Report");
        PDFResultReport.generatePDFStepdetails("StepDetailsSummary");

        Driver.closeDriver();
    }


}
