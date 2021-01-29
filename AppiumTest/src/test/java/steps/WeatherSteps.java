package steps;

import java.net.MalformedURLException;

import org.junit.Assert;


import app_pages.DataPage;
import app_pages.MainPage;
import app_pages.ResultPage;
import appiumdriver.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeatherSteps {
	
	public static String featureName;
	public AndroidDriver driverClass=new AndroidDriver();
	AppiumDriver<MobileElement> driver;
	
	private MainPage mainPage;
	private DataPage dataPage;
	private ResultPage resultPage;
	
	@Before
	 public void before() throws MalformedURLException {	 	 
		driver=driverClass.setUpDriver();	
		mainPage=new MainPage(driver);
		dataPage=new DataPage(driver);
		resultPage=new ResultPage(driver);
	 }
	
	@After
	 public void after(){
		driverClass.closeDriver();
	  
	 }
	
	@Given("I have an internet connection")
	public void i_have_an_internet_connection() {
					  
	  String connectionText=mainPage.internetConnectionDisplay.getText();
	  Assert.assertEquals("Connected",connectionText );
	 		
	  MobileElement fetchDataBTN=mainPage.fetchDataBTN;
      fetchDataBTN.click();	   
	}


	@When("I have successfully downloaded the weather data")
	public void i_have_successfully_downloaded_the_weather_data() {
	    
		MobileElement dataCollectedTXT=dataPage.dataCollectedTXT;
		Assert.assertEquals("Data collected",dataCollectedTXT.getText());
		
		MobileElement viewResultsBTN=dataPage.viewResultsBTN;
		viewResultsBTN.click();				
	}
	
	@Then("I can see the weather and temperature for today")
	public void i_can_see_the_weather_and_temperature_for_today() {
		
		MobileElement weatherValue=resultPage.temperatureValue;
		Assert.assertTrue(weatherValue.isDisplayed());
		
		MobileElement temperatureValue=resultPage.weatherValue;
		Assert.assertTrue(temperatureValue.isDisplayed());
		
		MobileElement doneBTN=resultPage.doneBTN;
		doneBTN.click();
	}


}
