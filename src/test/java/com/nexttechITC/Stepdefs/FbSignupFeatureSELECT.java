package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.FbSignUpPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbSignupFeatureSELECT {

	WebDriver driver;

	@Given("^user visit fb homepage$")
	public void user_visit_fb_homepage() throws Throwable {

		// how to open browser
		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS for Automation Testing\\chromedriver.exe");
		driver = new ChromeDriver();

		// implicit wait - global wait.soft wait. use between browser and url open.work in second.
		// go to next step right after browser execution.dont need to wait till time limit
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// how to open URL
		driver.get("https://www.facebook.com/");

		// maximize the window
		driver.manage().window().maximize();

		// pause or hold
		Thread.sleep(3000);

	}

	@When("^user click create new account$")
	public void user_click_create_new_account() throws Throwable {

		FbSignUpPOM fb = new FbSignUpPOM(driver);
		fb.createAccount().click();
		Thread.sleep(3000);

	}

	@When("^user enter valid \"([^\"]*)\" and \"([^\"]*)\" and valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_enter_valid_and_and_valid_and_valid(String arg1, String arg2, String arg3, String arg4)
			throws Throwable {
		FbSignUpPOM fb = new FbSignUpPOM(driver);
		fb.typeFirstname().sendKeys(arg1);
		fb.typeLastName().sendKeys(arg2);
		fb.typeMobNumEmail().sendKeys(arg3);
		fb.ReTypeEmail().sendKeys(arg3);
		fb.typePassWord().sendKeys(arg4);
		Thread.sleep(3000);
	}

	@When("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		FbSignUpPOM fb = new FbSignUpPOM(driver);
		Select se1 = new Select(fb.Month);// without method webelement in pom
		se1.selectByIndex(6);

		Select se2 = new Select(fb.selectDay());
		se2.selectByVisibleText("31");

		Select se3 = new Select(fb.selectYear());
		se3.selectByVisibleText("2003");

		Thread.sleep(3000);
	}

	@Then("^user click Gender$")
	public void user_click_Gender() throws Throwable {

		FbSignUpPOM fb = new FbSignUpPOM(driver);
		fb.chooseFemale().click();
		Thread.sleep(3000);
		fb.chooseMale().click();
		Thread.sleep(3000);
		fb.chooseCustom().click();

		Select se4 = new Select(fb.selectPronoun);
		se4.selectByIndex(1);
		Thread.sleep(3000);

		fb.submit.click();
		Thread.sleep(3000);

		driver.quit();

	}

}
