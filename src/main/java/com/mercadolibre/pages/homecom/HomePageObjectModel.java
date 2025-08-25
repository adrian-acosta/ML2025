package com.mercadolibre.pages.homecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mercadolibre.utils.BaseTest;

public class HomePageObjectModel {
	
	private WebDriver driver;
	private BaseTest utils;
	
	private By searchBox = By.id("cb1-edit");
	private By searchButton = By.className("nav-search-btn");
   
    public HomePageObjectModel(WebDriver driver) {
        this.driver = driver;
        utils = new BaseTest(this.driver);

    }
    
//Web elements methods
    
    private void click_On_searchBox() {
    	
    	utils.click(searchBox);
    }
    
    
    private void type_On_searchBox(String product) {
    	
    	utils.typeText(searchBox,product);
    }
    
    private void click_On_searchButton() {
    	
    	utils.click(searchButton);
    }
    
  //User actions methods
    
    public void Type_Product(String product) {
    	
    	click_On_searchBox();
    	type_On_searchBox(product);
    	  	
    }
    
    public void Search_Product() {
    	
    	click_On_searchButton();
    }
}
