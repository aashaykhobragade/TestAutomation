package stepdefination;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.PropertiesFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class hotelbookingstepdefination {
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

      @Then("^User clicks on Hotels tab$")
    	  public void user_clicks_on_Hotels_tab() throws Throwable{
    	  driver.findElement(By.xpath("//a[@title='Find hotels in destinations around the world']")).click();
    
      }
      
	@Then("^User enters City in Where feild$")
	   public void user_enters_City_in_Where_feild(){
		
		 driver.findElement(By.xpath("//input[@title='Where do you want to go']")).sendKeys("Bangalore");
		 
		 
		 
	}
	  public static void selectDate(WebDriver driver, WebElement element, String dateValue){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].setAttribute('value','"+dateValue+"');", element);
	 
	 }
	
	@Then("^User enters Check-in and Check-out details$")
	   public void user_enters_Check_in_and_Check_out_details()  {
	    
		WebElement checkindate = driver.findElement(By.id("CheckInDate"));
		String dateValue= "14/08/2019";
		selectDate(driver, checkindate, dateValue);
		 
		 
		WebElement checkoutdate = driver.findElement(By.id("CheckOutDate"));
		String dateValue1= "21/08/2019";
		
		
	}

	
	@Then("^User clicks Search hotels$")
	public void user_clicks_Search_hotels() {
	   driver.findElement(By.xpath("//input[@type='submit' and @id='SearchHotelsButton']")).click();
		
	}

	@Then("^Close the browser$")
	public void close_the_browser()  {
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
