package com.quiktrak.step_definitions;

import com.quiktrak.utilities.Driver;
import com.quiktrak.utilities.ResponseWriter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

// In this class we define the before and after methods that runs for each step
// After method takes the screenshot for failedscenarios at the end of step
public class Hooks {


    @Before("@ui")
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After("@ui")
    public void tearDown(Scenario scenario){
    if(scenario.isFailed()){
        final byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");
    }
        Driver.closeDriver();
    }

    @After("@api")
    public void tearDown() throws Exception {
        ResponseWriter.writer.close();
    }
}
