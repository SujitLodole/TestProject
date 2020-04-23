package com.addressbook.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.addressbook.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"D:\\AutoTesting\\AddressBookTest\\src\\main\\java\\com\\addressbook\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		
		String browseName=prop.getProperty("browser");		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (80 v)\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);			
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);		
		driver.get(prop.getProperty("url"));		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();					
	}
}
