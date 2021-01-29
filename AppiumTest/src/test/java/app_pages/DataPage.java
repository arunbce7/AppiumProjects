package app_pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DataPage {
	
	AppiumDriver<MobileElement> driver;
	
	public DataPage(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
    @FindBy(id = "com.dyson.recruitment.test:id/fetch_data_title")
    public MobileElement dataCollectedTXT;
    
    @FindBy(id = "com.dyson.recruitment.test:id/fetch_data_primary_button")
    public MobileElement viewResultsBTN;
	
	

}
