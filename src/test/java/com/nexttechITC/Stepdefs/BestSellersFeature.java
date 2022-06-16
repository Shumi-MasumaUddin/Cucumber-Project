package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.BestSellersPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BestSellersFeature {
	WebDriver driver;

	@Given("^user visits amazon homepage$")
	public void user_visits_amazon_home_page() throws Throwable {

		// how to open browser
		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS for Automation Testing\\chromedriver.exe");
		driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// how to open URL
		driver.get("https://www.amazon.com/");

		// maximize the window
		driver.manage().window().maximize();

		// pause or hold
		Thread.sleep(3000);

	}

	@Then("^user click on BestSellers$")
	public void user_click_on_BestSellers() throws Throwable {

		BestSellersPOM bs = new BestSellersPOM(driver);
		bs.BestSellers().click();

	}

}
