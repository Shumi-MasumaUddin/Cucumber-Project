package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSignUpPOM {

	WebDriver driver;

	public FbSignUpPOM(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// Create new account
	@FindBy(xpath = "//a[@class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']")
	WebElement createNewAccount;

	public WebElement createAccount() {
			return createNewAccount;}
			
	//First name			
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;

	public WebElement typeFirstname() {
		return firstName;}
			
	//Last name			
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastName;

	public WebElement typeLastName() {
			return lastName;}
			
	//Mobile number or email
		@FindBy(xpath = "//input[@name='reg_email__']")
		WebElement mobNumEmail;

	public WebElement typeMobNumEmail() {
			return mobNumEmail ;}
							
	//ReEnter email
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	WebElement reEnterEmail;

	public WebElement ReTypeEmail() {
		return reEnterEmail ;}
	
	//New password
		@FindBy(xpath = "//input[@name='reg_passwd__']")
		WebElement passWord;

	public WebElement typePassWord() {
		return passWord;}
		
	//Month
		@FindBy(xpath = "//select[@id='month']")
		public WebElement Month; 
		
//		public WebElement selectMonth()
//		{return Month;}

	
	//Day
		@FindBy(xpath = "//select[@id='day']")
		WebElement Day;
		public WebElement selectDay()
		{return Day;}


	
	//Year
		@FindBy(xpath = "//select[@id='year']")
		WebElement Year;
		public WebElement selectYear()
		{return Year;}


	
	//Gender- Female
		//@FindBy(xpath = "//input[@id='u_16_2_7z']")
		@FindBy(xpath = "//input[@value='1']")
		WebElement Female;

	public WebElement chooseFemale() {
		return Female;}
		
	//Gender- Male
		//@FindBy(xpath = "//input[@id='u_2_3_fX']")
	@FindBy(xpath = "//input[@value='2']")
		WebElement Male;

	public WebElement chooseMale() {
		return Male;}
		
	//Gender- Custom
		//@FindBy(xpath = "//input[@id='u_2_4_85']")
	@FindBy(xpath = "//input[@value='-1']")
		WebElement Custom;

	public WebElement chooseCustom() {
		return Custom;
	}
	
	//select[@name='preferred_pronoun']
	//button[@name='websubmit']
	
	//select pronoun
	@FindBy(xpath = "//select[@name='preferred_pronoun']")
	public WebElement selectPronoun;
	
	
	//submit
	@FindBy(xpath = "//button[@name='websubmit']")
	public WebElement submit;
	
	public WebElement clickSubmit() {
		return submit;
	}
 

}
