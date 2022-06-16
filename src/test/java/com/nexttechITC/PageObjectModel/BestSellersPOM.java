package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellersPOM {

	WebDriver driver;

	public BestSellersPOM(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
 
	
	
	//Best Sellers
	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_1']")
	WebElement clickBestSellers;
	
	public WebElement BestSellers() {
		return clickBestSellers;
			}
	
	
	
}
