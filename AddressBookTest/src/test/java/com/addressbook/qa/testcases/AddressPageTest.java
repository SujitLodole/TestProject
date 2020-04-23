package com.addressbook.qa.testcases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.addressbook.qa.base.TestBase;
import com.addressbook.qa.pages.AddressPage;
import com.addressbook.qa.pages.HomePage;
import com.addressbook.qa.pages.NewAddressRegisterPage;
import com.addressbook.qa.pages.SignInPage;

public class AddressPageTest extends TestBase{
	SignInPage signInPage;
	HomePage homePage;
	AddressPage addressPage;
	NewAddressRegisterPage newAddressRegiserPage;	
	public AddressPageTest(){
		super();
	}	
	@BeforeMethod
	public void setUp(){
		initialization();
		newAddressRegiserPage = new NewAddressRegisterPage();
		homePage = new HomePage();
		signInPage = new SignInPage();
		addressPage = new AddressPage();		
		homePage=signInPage.signIn(prop.getProperty("email"), prop.getProperty("passward"));			
	}			
	
		
	@Test(priority=1)
	public void verifyAddressPageLink(){
		newAddressRegiserPage=addressPage.clickOnAddressPageLink();				
	}	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}	
}
