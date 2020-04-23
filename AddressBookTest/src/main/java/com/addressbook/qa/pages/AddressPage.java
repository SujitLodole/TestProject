package com.addressbook.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.addressbook.qa.base.TestBase;

public class AddressPage extends TestBase {
	
	@FindBy(xpath = "//a[text()='New Address']")
	WebElement newAddressLink;
		
	@FindBy(xpath = "//a[text()='Addresses']")
	WebElement addressPageLink;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
		
	public NewAddressRegisterPage clickOnAddressPageLink() {
		addressPageLink.click();
		newAddressLink.click();
		return new NewAddressRegisterPage();
	}
		 
}
