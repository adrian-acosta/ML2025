package com.mercadolibre.runner;

import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resources/features", // Ruta de archivos .feature
    glue = {"stepsDefinitions","com.mercadolibre.hooks"}, // Paquete donde están Step Definitions
   
   
    plugin = {
    		 "pretty",                             		// salida legible en consola
             "html:target/cucumber-html-report.html",   // reporte HTML
             "json:target/cucumber.json"          		 // reporte JSON
    },
    monochrome = true 
)
public class TestRunner extends AbstractTestNGCucumberTests {
   
	
	
}
