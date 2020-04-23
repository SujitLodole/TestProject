package com.addressbook.qa.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.addressbook.qa.base.TestBase;
import com.addressbook.qa.util.TestUtil;

public class SignInPage extends TestBase {		
	//Page Factory:
	
	@FindBy(name="session[email]")
	WebElement email;	
	@FindBy(name="session[password]")
	WebElement passward;	
	@FindBy(name="commit")
	WebElement signInBtn;	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement signUpBtn;	
	@FindBy(xpath="//*[@id='clearance']/h2")
	WebElement signInHeading;
	
	//Initializing the page Object:
	public SignInPage(){
	PageFactory.initElements(driver, this);	
	}
	
	//Actions:
	public String validateSignInPageTitle(){
		return driver.getTitle();
	}	
	public boolean validateSignInHeading(){
		return signInHeading.isDisplayed();
	}	
	public HomePage signIn(String un,String psw){
		email.sendKeys(un);
		passward.sendKeys(psw);
		signInBtn.click();					
		return new HomePage();				
	}			
}
