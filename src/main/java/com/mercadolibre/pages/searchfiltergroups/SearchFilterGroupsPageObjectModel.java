package com.mercadolibre.pages.searchfiltergroups;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mercadolibre.utils.BaseTest;

public class SearchFilterGroupsPageObjectModel {
	
	private WebDriver driver;
	private BaseTest utils;

	
    private By selectCountry = By.id("MX");
   
    public SearchFilterGroupsPageObjectModel(WebDriver driver) {
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



