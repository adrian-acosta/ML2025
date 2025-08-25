package com.mercadolibre.utils;

import org.openqa.selenium.WebDriver;



public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
    	String browser = ConfigReader.getProperty("browser");
        if (driver == null) {
           
            driver = WebDriverFactory.createDriver(browser);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}