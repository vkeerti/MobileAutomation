package com.quiktrak.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

//this method is driver class which prepare as singleton design pattern, but it is support parallel testing and selenium grid
public class Driver {
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();


    private Driver() {
    }

    public static WebDriver get() {

        if (driverPool.get() == null) {
            String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") : ConfigurationReader.get("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    Driver.get().manage().window().maximize();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    Driver.get().manage().window().maximize();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver(new FirefoxOptions().setHeadless(true)));
                    break;
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    WebDriverManager.iedriver().setup();
                    driverPool.set(new InternetExplorerDriver());
                    break;
                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                    Driver.get().manage().window().maximize();
                    break;
                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support Safari");
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driverPool.set(new SafariDriver());
                    Driver.get().manage().window().maximize();
                    break;
                case "remote_chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setCapability("platform", Platform.ANY);
                    try {
                        driverPool.set(new RemoteWebDriver(new URL("http://54.173.46.143:4444/wd/hub"), chromeOptions));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();

                    }

                case "mobile_iOS":
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"16.6");
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 14 Pro Max");
                    desiredCapabilities.setCapability("appPackage","com.quiktrak.rqmobile");
                    desiredCapabilities.setCapability("appActivity","crc644ddd6e0fa0b9a8bd.SplashScreen");
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
                    desiredCapabilities.setCapability(MobileCapabilityType.UDID,"00008120-001208211100201E");
                    desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:/apkfiles/Revoquest_4.0.2.01_Apkpure.apk");

                    try{
                        driverPool.set(new AppiumDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities));
                    } catch (MalformedURLException e){
                        e.printStackTrace();

                    }

                case "mobile_android":
                    DesiredCapabilities desiredCapabilities1 = new DesiredCapabilities();
                    desiredCapabilities1.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    desiredCapabilities1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13.0");
                    desiredCapabilities1.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 6 Pro API 33");
                    desiredCapabilities1.setCapability("appPackage","com.quiktrak.rqmobile");
                    desiredCapabilities1.setCapability("appActivity","crc644ddd6e0fa0b9a8bd.SplashScreen");
                    desiredCapabilities1.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
                    try{
                        driverPool.set(new AppiumDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities1));

                    } catch (MalformedURLException e){
                        e.printStackTrace();
                    }

                    try{
                        driverPool.set(new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities1));
                    } catch (MalformedURLException e){
                        e.printStackTrace();

                    }
            }
        }
        return driverPool.get();
    }

    public static void closeDriver() {
        driverPool.get().quit();
        driverPool.remove();
    }
}
