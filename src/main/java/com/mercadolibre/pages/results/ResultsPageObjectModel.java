package com.mercadolibre.pages.results;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mercadolibre.utils.BaseTest;

public class ResultsPageObjectModel {
	
	private WebDriver driver;
	private BaseTest utils;

	
    private By nuevoFilterLink = By.xpath("//a//span[text()='Nuevo']");
    private By localFilterLink = By.xpath("//a//span[text()='Local']");
    
    private By cookiesBannerButton = By.xpath("//*[text()='Aceptar cookies']");
    
    private By masRelevanteSelect = By.xpath("//*[text()=\"Más relevantes\"]");
    
    private By ordenarPorPrecio = By.xpath("//li//span[normalize-space(.)='Menor precio']");

    
   
    public ResultsPageObjectModel(WebDriver driver) {
        this.driver = driver;
        utils = new BaseTest(this.driver);

    }
    
//Web elements methods
    
    private void click_On_Nuevo_Filter() {
    	
    	
    	if(utils.isElementPresent(cookiesBannerButton))
    		utils.click(cookiesBannerButton);
        	
    	utils.click(nuevoFilterLink);
    }
    
    private void click_On_Local_Filter() {
    	
    	utils.click(localFilterLink);
    }
    
    private void click_On_Mas_Relevante_Filter() {
    	
    	utils.click(masRelevanteSelect);
    	
    }
    
    private void click_On_OrdenarPorPrecio() {
    	
    	utils.click(ordenarPorPrecio);
    	utils.esperarPaginaLista(30);
    	
    }
 

 
    public  Map<String, String> obtenerPrimerosLista(int cantidad) {
     
     // Crear un HashMap
     Map<String, String> productos = new HashMap<>();

    
     for (int i = 1; i <= 6; i++) {
         try {
             // XPath relativo para cada li
             String xpath = String.format("//ol/li[%d]//div[last()]//h3//a", i);
             String xpathPrecio = String.format("//*/div/div[2]/section/div[5]/ol/li[%d]//div[2]/div/div//span[2]", i);

                                   
             WebElement elemento = driver.findElement(By.xpath(xpath));
             WebElement elementoPrecio = driver.findElement(By.xpath(xpathPrecio));
             
             productos.put(elemento.getText().trim(), elementoPrecio.getText().trim());
                        
             
             
         } catch (Exception e) {
             System.out.println("No se pudo extraer el texto del li[" + i + "]: " + e.getMessage());
         }
     }

     return productos;
 }



    
  //User actions methods
    
    public void select_Nuevo_Filter() {
    	
    	
    	click_On_Nuevo_Filter();
    	
    	
    }
    public void select_Local_Filter() {
    	
    	click_On_Local_Filter();
    	
    }
    
    public void select_Menor_Precio(){
    	click_On_Mas_Relevante_Filter();
    	click_On_OrdenarPorPrecio();
    }
}


