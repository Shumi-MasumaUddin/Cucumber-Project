package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.DellPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSolutionsFeatureMOUSEhover {
	
	WebDriver driver;
	
	@Given("^user visit Dell Homepage$")
	public void user_visit_Dell_Homepage() throws Throwable {
		// how to open browser
				System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS for Automation Testing\\chromedriver.exe");
				driver = new ChromeDriver();

				// implicit wait - global wait.soft wait. use between browser and url open.work
				// in second.
				// go to next step right after browser execution.dont need to wait till time
				// limit
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				// how to open URL
				driver.get("https://www.dell.com/en-us");

				// maximize the window
				driver.manage().window().maximize();

				// pause or hold
				Thread.sleep(3000); 
	}

	@When("^user go to Solutions dropdown  menu & able to see view All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_able_to_see_view_All_Solutions() throws Throwable {
		Actions act =new Actions (driver);
		  DellPOM  obj =new DellPOM (driver);
		  //act.moveToElement(obj.Solutions()).build().perform();
		  act.moveToElement(obj.Solutions()).build().perform();
		  //obj.AllSolutions().click();
		  //WebDriverWait wait=new WebDriverWait(driver,30);
		  Thread.sleep(5000);
	}

	@Then("^user click to All Solutions$")
	public void user_click_to_All_Solutions() throws Throwable {
		 DellPOM  obj =new DellPOM (driver);
		 obj.AllSolutions().click();
		 Thread.sleep(3000);
		 driver.quit();
	}


}
