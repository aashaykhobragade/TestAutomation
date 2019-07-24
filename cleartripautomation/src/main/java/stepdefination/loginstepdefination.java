package stepdefination;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.PropertiesFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginstepdefination {
    
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
		//driver.get("https://www.cleartrip.com/");
		
		//ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://www.cleartrip.com/");
		
	}
	
	@When("^Title of the login page in cleartrip$")
	public void title_of_the_login_page_in_cleartrip(){ 
	     
		String title = driver.getTitle();
        System.out.println(title);
	    Assert.assertEquals("Cleartrip","title");
	}
	
	@Then("^User clicks on Your Trips icon and Sign In button$")
	 public void user_click_your_trips_signin_button(){
		
		driver.findElement(By.xpath("//a[@id='userAccountLink']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Then("^User clicks Sign In button in pop up$")
	public void user_click_signinbutton_popup(){
		driver.findElement(By.xpath("//button[@type='submit' and @id='signInButton']")).click();
	}
	
	@Then("^Error message is displayed$")
	public void errormsg_displayed(){
		
		String errors1 = driver.findElement(By.xpath("//div[@id='errors1']")).getText();
		System.out.println(errors1);
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
        driver.quit();
		
	}
	
}
