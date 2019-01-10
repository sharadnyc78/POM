package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class AmazonHome extends TestBase {
	
	//1) OR - object repo
	
	@FindBy(xpath= "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	
	
	//2)  initialise in constructor
	
	public AmazonHome() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	
	// 3) Actions
	
	public void sendKeystosearchbox() {
		
		searchbox.sendKeys("ipod");
	}
	
	
	
	

}
