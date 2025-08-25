package com.mercadolibre.utils;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BaseTest {

	protected WebDriver driver;
    private WebDriverWait wait;

    // Constructor para inicializar el WebDriver y WebDriverWait
    public BaseTest(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("timeout"))));
    }

    
    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    
    public WebElement waitForClickability(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    
    public void click(By locator) {
        waitForClickability(locator).click();
    }
    
    

    public void typeText(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    
    public void esperarPaginaLista(int tiempoMaxSegundos) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoMaxSegundos));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                return js.executeScript("return document.readyState").toString().equals("complete");
            }
        });
    }

    
    public static String takeScreenshot(WebDriver driver, String nombreArchivo) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            String destino = "target/screenshots/" + nombreArchivo + ".png";
            Files.createDirectories(Paths.get("target/screenshots"));
            Files.copy(src.toPath(), Paths.get(destino));
            return destino;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
  
}

