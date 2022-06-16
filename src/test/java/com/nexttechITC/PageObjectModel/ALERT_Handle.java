package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ALERT_Handle {
	
	WebDriver driver;
	public ALERT_Handle(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	////button[@onclick='jsAlert()']
	////button[@onclick='jsConfirm()']
	////button[@onclick='jsPrompt()']
	
	@FindBy(xpath = "//button[@onclick='jsAlert()']")
	WebElement jsAlert;
	public WebElement clickJSAlert() {
		return jsAlert;
		
	}
	
	@FindBy(xpath = "//button[@onclick='jsConfirm()']")
	WebElement jsConfirm;
	public WebElement clickJSConfirm() {
		return jsConfirm;
		
	}
	
	@FindBy(xpath = "//button[@onclick='jsPrompt()']")
	WebElement jsPrompt;
	public WebElement clickJSPrompt() {
		return jsPrompt;
		
	}
	
}
