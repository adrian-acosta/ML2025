package stepsDefinitions;


import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mercadolibre.hooks.Hooks;
import com.mercadolibre.pages.homecom.HomePageObjectModel;
import com.mercadolibre.pages.homecom.MainHomePageObjectModel;
import com.mercadolibre.pages.results.ResultsPageObjectModel;
import com.mercadolibre.utils.BaseTest;
import com.mercadolibre.utils.ConfigReader;
import com.mercadolibre.utils.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {

	private WebDriver driver;
	private MainHomePageObjectModel homeMain;
	private HomePageObjectModel home;
	private ResultsPageObjectModel results;
	private BaseTest utils;
	
   
	  public SearchProductSteps() {
	        
		 this.driver = DriverManager.getDriver();  // Obtiene la instancia de WebDriver
	     homeMain = new MainHomePageObjectModel(this.driver);
	     home = new HomePageObjectModel(this.driver);
	     results = new ResultsPageObjectModel(this.driver);
	     utils = new BaseTest(this.driver);
	      
	    	
	 }


	@Given("I open the website Mercado Libre")
    public void i_open_the_website() {
		 this.driver.get(ConfigReader.getProperty("url")); 
		 
		 byte[] screenshot = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
	        Hooks.scenario.attach(screenshot, "image/png", "Home Page");
	}
    

    @When("I select {string} as country")
    public void i_select_country(String country) {
    	homeMain.select_Country();
    }
    @When("I search for {string}")
    public void i_search_for(String product) {
    	
    	home.Type_Product(product);
    	
    	 byte[] screenshot = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
	        Hooks.scenario.attach(screenshot, "image/png", "Search Product");
    	
    	home.Search_Product();
    }

    @When("I filter by condition {string}")
    public void i_filter_by_condition(String condition) {
        results.select_Nuevo_Filter();
        
        byte[] screenshot = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
        Hooks.scenario.attach(screenshot, "image/png", "Select Nuevo Filter");
    }

    @When("I filter by location {string}")
    public void i_filter_by_location(String location) {
        results.select_Local_Filter();
        
        byte[] screenshot = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
        Hooks.scenario.attach(screenshot, "image/png", "Select local Filter");
    }

    @When("I order results by {string}")
    public void i_order_results_by(String order) {
    	results.select_Menor_Precio();
    	
    	 byte[] screenshot = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
         Hooks.scenario.attach(screenshot, "image/png", "Select Menor Precio");
    }

    @Then("I obtain the first 5 products")
    public void i_obtain_the_first_5_products() {
    	// Extraer texto de los primeros 5 productos
    	Map<String, String> productosMap = results.obtenerPrimerosLista(5);
    	

    	// Imprimir el Map
        for (Map.Entry<String, String> entry : productosMap.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " | Precio: " + entry.getValue());
        }
    }

}
