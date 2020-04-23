package com.addressbook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.addressbook.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'pqr@gmail.com')]")
	WebElement userNameLabel;	
	@FindBy(xpath="//a[text()='Addresses']")
	WebElement addressesLink;	
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOutLink;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public AddressPage clickOnAddressesLink(){
		addressesLink.click();
		return new AddressPage();
	}
	
	public SignInPage clickOnsignOutLink(){
		addressesLink.click();
		return new SignInPage();
	}
}
