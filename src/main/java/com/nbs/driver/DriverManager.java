package com.nbs.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager(){}

    private static final ThreadLocal<WebDriver> localDriver = new ThreadLocal();

    public static WebDriver getDriver(){
        return localDriver.get();
    }

    public static void setDriver(WebDriver driver){
        localDriver.set(driver);
    }
}
