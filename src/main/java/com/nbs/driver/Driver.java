package com.nbs.driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.nbs.config.ConfigFactory;


public final class Driver {

    private Driver() {
    }

    public static void initDriver() {  
        if (DriverManager.getDriver() == null) {
            String browser = ConfigFactory.getConfig().browser();
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        }
    }

    public static void tearDown() {
        if (DriverManager.getDriver() != null) {  
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
