package com.mercadolibre.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mercadolibre.utils.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public static Scenario scenario;

		@Before
	    public void setup(Scenario scenario) {
		   System.out.println("Configuring WebDriver...");
	       DriverManager.getDriver(); // Inicializa el WebDriver
	       Hooks.scenario = scenario; // guardamos para usarlo en los steps
	       System.out.println("WebDriver configurado...");
	        
	    }

	    @After
	    public void tearDown() {
	    	 System.out.println("Closing WebDriver...");
	       
	        if (scenario.isFailed()) {
	            byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "Error al ejecutar el step");
	        }
	        DriverManager.quitDriver(); // Cierra el WebDriver al final de cada escenario
	        
	    }
	        
	    
	 // Método para acceder al WebDriver
	    public static WebDriver getDriver() {
	        return DriverManager.getDriver();
	    }
	    
	    

	   

	    
	
}
