package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPOM {

	WebDriver driver;

	public AmazonSearchPOM(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
 
	//SearchBox
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement editSearchBox;
	
	public WebElement SearchBox() {
		return editSearchBox;
			}
	
	//SearchIcon
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement clickSearchIcon;
	
	public WebElement SearchIcon() {
		return clickSearchIcon;
			}
	
	//Best Sellers
	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_1']")
	WebElement clickBestSellers;
	
	public WebElement BestSellers() {
		return clickBestSellers;
			}
	
	//Amazon Basics
	@FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_amazonbasics']")
	WebElement clickAmazonBasics;
	
	public WebElement AmazonBasics() {
		return clickAmazonBasics;
			}
	
	//Customer Service
	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_3']")
	WebElement clickCustomerService;
	
	public WebElement CustomerService() {
		return clickCustomerService;
			}
	
	//New Releases
	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_4']")
	WebElement clickNewReleases;
	
	public WebElement NewReleases() {
		return clickNewReleases;
			}
	
	//Today's Deals
	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_6']")
	WebElement clickTodaysDeal;
	
	public WebElement TodaysDeal() {
		return clickTodaysDeal;
			}
	
	
}
