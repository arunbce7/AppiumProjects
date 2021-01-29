package app_pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ResultPage {
	
	AppiumDriver<MobileElement> driver;
	
	public ResultPage(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
    @FindBy(id = "com.dyson.recruitment.test:id/weather_display_weather_value")
    public MobileElement weatherValue;
    
    @FindBy(id = "com.dyson.recruitment.test:id/weather_display_temperature_value")
    public MobileElement temperatureValue;
    
    @FindBy(id = "com.dyson.recruitment.test:id/weather_display_primary_button")
    public MobileElement doneBTN;
	
	

}
