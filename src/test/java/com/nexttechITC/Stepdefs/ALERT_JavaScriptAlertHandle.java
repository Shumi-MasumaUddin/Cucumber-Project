package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nexttechITC.PageObjectModel.ALERT_Handle;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ALERT_JavaScriptAlertHandle {
	
	WebDriver driver;
	
	@Given("^user visit JavaScript Alert Page$")
	public void user_visit_JavaScript_Alert_Page() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "D:\\\\DRIVERS for Automation Testing\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	    
	}

	@When("^user click for JS Alert button$")
	public void user_click_for_JS_Alert_button() throws Throwable {
		ALERT_Handle al= new ALERT_Handle (driver);
		al.clickJSAlert().click();
		
		Thread.sleep(3000);
	    
	}


	@When("^user click on OK from pop up alert$")
	public void user_click_on_OK_from_pop_up_alert() throws Throwable {
		driver.switchTo().alert().accept();
	}

	@Then("^user will able to see the result that alert is clicked$")
	public void user_will_able_to_see_the_result_that_alert_is_clicked() throws Throwable {
		//String actualText=driver.switchTo().alert().getText();
		String actualText= driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(actualText);
		String expectedText = "You successfully clicked an alert";
		Assert.assertEquals(actualText, expectedText);
		
		
		//if(driver.getPageSource().contains("You successfully clicked an alert"))
		//System.out.println("You successfully clicked an alert");
		
		
		driver.quit();
	}

	@When("^user click for JS confirm button$")
	public void user_click_for_JS_confirm_button() throws Throwable {
		ALERT_Handle al= new ALERT_Handle (driver);
		al.clickJSConfirm().click();
		Thread.sleep(3000);
	}

	@When("^user click on Cancel from pop up alert$")
	public void user_click_on_Cancel_from_pop_up_alert() throws Throwable {
		driver.switchTo().alert().dismiss(); 
	}

	@Then("^user will able to see the result that alert is cancelled$")
	public void user_will_able_to_see_the_result_that_alert_is_cancelled() throws Throwable {
	    driver.quit();
	}

	@When("^user click for JS Prompt button$")
	public void user_click_for_JS_Prompt_button() throws Throwable {
		ALERT_Handle al= new ALERT_Handle (driver);
		al.clickJSPrompt().click();
		Thread.sleep(3000);
	}

	@When("^user type \"([^\"]*)\"$")
	public void user_type(String arg1) throws Throwable {
		driver.switchTo().alert().sendKeys(arg1);
		Thread.sleep(3000);
	}

	@When("^user click on OK button$")
	public void user_click_on_OK_button() throws Throwable {
	    driver.switchTo().alert().accept();
	}

	@Then("^user will able to see the what he typed on the pop up alert$")
	public void user_will_able_to_see_the_what_he_typed_on_the_pop_up_alert() throws Throwable {
	  
		driver.quit();
	}



}


