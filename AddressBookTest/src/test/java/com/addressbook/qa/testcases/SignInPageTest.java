package com.addressbook.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.addressbook.qa.base.TestBase;
import com.addressbook.qa.pages.HomePage;
import com.addressbook.qa.pages.SignInPage;

public class SignInPageTest extends TestBase{	
	SignInPage signInPage;
	HomePage homePage;
	
	public SignInPageTest(){
		super();
	}		
	@BeforeMethod
	public void setUp() {
		initialization();
		signInPage = new SignInPage();
	}	
	@Test(priority=1)
	public void signInPageTitleTest(){
		String title=signInPage.validateSignInPageTitle();
		Assert.assertEquals(title, "Address Book - Sign In");
	}	
	@Test(priority=2)
	public void addressBookHeadingTest(){
		boolean flag = signInPage.validateSignInHeading();
		Assert.assertTrue(flag);
	}	
	@Test(priority=3)
	public void signInTest() {
		homePage=signInPage.signIn(prop.getProperty("email"), prop.getProperty("passward"));
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	
}
