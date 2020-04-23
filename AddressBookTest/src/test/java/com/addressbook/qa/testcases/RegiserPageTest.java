package com.addressbook.qa.testcases;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.addressbook.qa.base.TestBase;
import com.addressbook.qa.pages.AddressPage;
import com.addressbook.qa.pages.HomePage;
import com.addressbook.qa.pages.NewAddressRegisterPage;
import com.addressbook.qa.pages.SignInPage;
import com.addressbook.qa.util.TestUtil;

public class RegiserPageTest extends TestBase {
	SignInPage signInPage;
	HomePage homePage;	
	NewAddressRegisterPage newAddressRegiserPage;
	TestUtil testUtil;	
	
	public RegiserPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		newAddressRegiserPage = new NewAddressRegisterPage();
		homePage = new HomePage();
		signInPage = new SignInPage();	
		testUtil = new TestUtil();
		homePage = signInPage.signIn(prop.getProperty("email"), prop.getProperty("passward"));					
	}	
	@Test
	public void verifyFillUpRegisterPage(){
		newAddressRegiserPage.fillUpRegisterPage();
		newAddressRegiserPage.contentOfRegisterPage();
	//	testUtil.popUpHandle();						
	}			
	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}
}
