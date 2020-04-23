package com.addressbook.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.addressbook.qa.base.TestBase;
import com.addressbook.qa.pages.AddressPage;
import com.addressbook.qa.pages.HomePage;
import com.addressbook.qa.pages.SignInPage;

public class HomePageTest extends TestBase{
	SignInPage signInPage;
	HomePage homePage;
	AddressPage addressPage;	
	public HomePageTest(){
		super();
	}	
	@BeforeMethod
	public void setUp() {
		initialization();
		addressPage = new AddressPage();
		signInPage = new SignInPage();
		homePage=signInPage.signIn(prop.getProperty("email"), prop.getProperty("passward"));
	}	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Address Book","Home Page Title Not Matched");
	}	
	@Test(priority=2)
	public void verifyUserNameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}	
	@Test(priority=3)
	public void verifyAddressesLinkTest(){
	addressPage=homePage.clickOnAddressesLink();		
	}
	@Test(priority=4)
	public void verifySignOutLinkTest(){
		signInPage=homePage.clickOnsignOutLink();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
