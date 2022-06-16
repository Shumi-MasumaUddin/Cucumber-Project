package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.AmazonSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonSearchFeatureCLICKtype {

	WebDriver driver;

	@Given("^user visits amazon home page$")
	public void user_visits_amazon_home_page() throws Throwable {
		
		//how to open browser
		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS for Automation Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//implicit wait - global wait.soft wait. use between browser and url open.work in second. 
		//go to next step right after browser execution.dont need to wait till time limit
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//how to open URL
		driver.get("https://www.amazon.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//pause or hold
		Thread.sleep(3000);
		

	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		AmazonSearchPOM as = new AmazonSearchPOM(driver);
		as.SearchBox().sendKeys(arg1);
		//Explicit wait- local wait.soft wait. between webelements.work in second.
		WebDriverWait wait=new WebDriverWait(driver,20);
		//hard wait-work in mili second. after execution that declared time limit u have to stop.
		//waste of time. time consuming.forcefully have to wait 3 secs
		//Thread.sleep(3000);
	}

	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		AmazonSearchPOM as = new AmazonSearchPOM(driver);
		as.SearchIcon().click();
		Thread.sleep(3000);
		//close driver
		driver.close();
	}
	
	

}
