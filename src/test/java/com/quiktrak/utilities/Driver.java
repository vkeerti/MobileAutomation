package com.quiktrak.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
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

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

//this method is driver class which prepare as singleton design pattern, but it is support parallel testing and selenium grid
public class Driver {
    private static InheritableThreadLocal<AppiumDriver> driverPool = new InheritableThreadLocal<>();
    private Driver() {
    }
    public static AppiumDriver get() {
        if (driverPool.get() == null) {
            String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") : ConfigurationReader.get("browser");
            switch (browser) {
                case "mobile_iOS":
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"16.6");
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 14 Pro Max");
                    desiredCapabilities.setCapability("appPackage","com.quiktrak.rqmobile");
                    desiredCapabilities.setCapability("appActivity","crc644ddd6e0fa0b9a8bd.SplashScreen");
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
                    desiredCapabilities.setCapability(MobileCapabilityType.UDID,"00008120-001208211100201E");
                    String iosAppAPKPath=System.getProperty("user.dir")+ File.separator+"scr"+File.separator+"test"+File.separator+"java"+File.separator+"com"+
                            File.separator+"quicktrak"+File.separator+"APKFile"+ File.separator+"com.quiktrak.rqmobile.apk";
                    desiredCapabilities.setCapability(MobileCapabilityType.APP,iosAppAPKPath);
                    try{
                        driverPool.set(new IOSDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities));
                    } catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                case "mobile_android":
                    DesiredCapabilities desiredCapabilities1 = new DesiredCapabilities();
                    desiredCapabilities1.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    desiredCapabilities1.setCapability(MobileCapabilityType.PLATFORM_VERSION,ConfigurationReader.get("Android_deviceVersion"));
                    desiredCapabilities1.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigurationReader.get("Android_deviceName"));
                    desiredCapabilities1.setCapability("appPackage",ConfigurationReader.get("Android_appPackage"));
                    desiredCapabilities1.setCapability("appActivity",ConfigurationReader.get("Android_appActivity"));
                    desiredCapabilities1.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
                    desiredCapabilities1.setCapability("autoGrantPermissions","true");
                    desiredCapabilities1.setCapability("unlockType","pin");
                    desiredCapabilities1.setCapability("unlockKey","8622");
                    try{
                        driverPool.set(new AndroidDriver<AndroidElement> (new URL("http://localhost:4723/wd/hub"),desiredCapabilities1));
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
