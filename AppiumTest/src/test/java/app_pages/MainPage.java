package app_pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainPage {
	
	AppiumDriver<MobileElement> driver;
	
	public MainPage(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
    @FindBy(id = "com.dyson.recruitment.test:id/connection_display_title")
    public MobileElement internetConnectionDisplay;
    
    @FindBy(id = "com.dyson.recruitment.test:id/connection_display_primary_button")
    public MobileElement fetchDataBTN;
	
	

}
