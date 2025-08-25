package com.mercadolibre.pages.homecom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mercadolibre.utils.BaseTest;

public class MainHomePageObjectModel {
	
	private WebDriver driver;
	private BaseTest utils;
	
	private String countryStr= "";

	
    private By selectCountry = By.id("MX");
   
    public MainHomePageObjectModel(WebDriver driver) {
        this.driver = driver;
        utils = new BaseTest(this.driver);

    }
    
//Web elements methods
    
    private void click_On_Country() {
    	
    	utils.click(selectCountry);
    }
    
  //User actions methods
    
    public void select_Country() {
    	
    	click_On_Country();
    	
    }
}


