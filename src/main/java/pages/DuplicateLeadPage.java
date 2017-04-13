package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeaftapsWrappers;

public class DuplicateLeadPage extends LeaftapsWrappers{
	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
}
	
	public DuplicateLeadPage enterDescription() throws InterruptedException{
		enterByXpath(prop.getProperty("DuplicateLead.enterDescription.xpath"), "This lead is duplicated");
		return this;
}
	public ViewLeadPage clickUpdateButton() throws InterruptedException{
		clickByXpath(prop.getProperty("DuplicateLead.clickUpdateButton.xpath"));
		return new ViewLeadPage(driver,test);
}

}