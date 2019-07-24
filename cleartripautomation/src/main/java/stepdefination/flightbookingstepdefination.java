package stepdefination;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.PropertiesFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class flightbookingstepdefination {

	public static WebDriver driver;
    PropertiesFileReader obj= new PropertiesFileReader();
  

    @Given("^User is already on cleartip page$") 
        public void user_on_cleartip_page() throws Throwable 
{
	    Properties properties = obj.getProperty();
	
	
	    System.setProperty("webdriver.chrome.driver", "C://Users//Selenium//Chrome//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(properties.getProperty("browser.baseURL"));
	
 }
	
    @Then("^Then User selects one way$")
        public void user_selects_one_way(){
        driver.findElement(By.xpath("//input[ @id='OneWay']")).click();
 
    }
    @Then("^Then User selects From and To$")
    public void user_selects_From_and_To(){
    	
    	driver.findElement(By.xpath("//input[ @type='text' and @id='FromTag']")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
    	driver.findElement(By.xpath("//input[ @id='ToTag']")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
    }
    @Then("^User selects Depart on$")
    public void user_selects_depart_on(){
    	 driver.findElement(By.xpath("//input[ @type='text' and @title='Depart date']")).sendKeys("12/08/2019");
    }
    @Then("^user selects number of Adults$")
    public void user_selects_number_of_adults(){
    	
    	driver.findElement(By.xpath("//select[ @id='Adults']")).click();
    	
    }
    
    @And("^User clicks on Search flights$")
    public void user_clicks_on_search_flights(){
    	
    	driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
    	
    }
    
    @Then("^Close the browser$")
	public void close_the_browser()  {
		driver.quit();
    
    
    }
    
}
