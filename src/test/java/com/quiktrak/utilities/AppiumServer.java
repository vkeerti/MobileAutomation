package com.quiktrak.utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.time.Duration;

public class AppiumServer {
    static AppiumDriverLocalService server;

    public static void start() {
       /* server= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\svankadari\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();*/
        server.start();
    }

    public static void stop() {
        server.stop();
    }


}
