package com.addressbook.qa.pages;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.addressbook.qa.base.TestBase;
import com.addressbook.qa.util.TestUtil;

public class NewAddressRegisterPage extends TestBase{
	
	@FindBy(name="address[first_name]")
	WebElement firstName;
	@FindBy(name="address[last_name]")
	WebElement lastName;
	@FindBy(name="address[address1]")
	WebElement address1;
	@FindBy(name="address[address2]")
	WebElement address2;
	@FindBy(name="address[city]")
	WebElement city;
	//StateField------- DropDown:
	@FindBy(xpath="//select[@name='address[state]']")	
	WebElement state;
	@FindBy(name="address[zip_code]")
	WebElement zip_code;
	@FindBy(name="address[country]")
	WebElement country;
	@FindBy(name="address[birthday]")
	WebElement birthday;
	/*ColourField------ PopUp Handle
	@FindBy(name="address[color]")
	WebElement color;*/	
	@FindBy(name="address[age]")
	WebElement age;
	@FindBy(name="address[website]")
	WebElement website;
	/*PictureField------- AutoIT:
	@FindBy(xpath="//input[@id='address_picture']")
	WebElement picture;
    RuntimegetRuntime().exec("D:\\Sujit\\FileUploadScript.exe")*/;
	@FindBy(name="address[phone]")
	WebElement phone;
	@FindBy(xpath="//input[@id='address_interest_climb']")
	WebElement commonInterests;
	@FindBy(xpath="//textarea[@id='address_note']")
	WebElement note;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	//Address and NewAddress:
	@FindBy(xpath = "//a[text()='New Address']")
	WebElement newAddressLink;		
	@FindBy(xpath = "//a[text()='Addresses']")
	WebElement addressPageLink;
		
	public NewAddressRegisterPage() {
		PageFactory.initElements(driver, this);
	}	
	public void fillUpRegisterPage() {
		addressPageLink.click();
		newAddressLink.click();		
	}	
	public HomePage contentOfRegisterPage(){
		firstName.sendKeys("Raj");
		lastName.sendKeys("Singh");
		address1.sendKeys("Street-1");
		address2.sendKeys("Street-2");
		city.sendKeys("Pune");
		Select sta=new Select(state);
		sta.selectByIndex(2);		
	//	State------- DropDown:--------------
		zip_code.sendKeys("411052");
		country.click();
		birthday.sendKeys("12/12/2012");		
	//	color.click();------ PopUp Handle:---------		
		age.sendKeys("25");
		website.sendKeys("http://a.testaddressbook.com/");
	//	Picture -------------Auto-IT:-------------
		phone.sendKeys("9876543210");
		commonInterests.click();
		note.sendKeys("Hello Selenium");
		submit.click();
		return new HomePage();		
	}	
}	
	
	
	
	/*public void registerPage() throws Exception{
		
		driver.findElement(By.name("address[first_name]")).sendKeys("John");
		driver.findElement(By.name("address[last_name]")).sendKeys("Roy");
		driver.findElement(By.name("address[address1]")).sendKeys("Line-1");
		driver.findElement(By.name("address[address2]")).sendKeys("Line-2");
		driver.findElement(By.name("address[city]")).sendKeys("Italy");		
		WebElement state=driver.findElement(By.xpath("//select[@name='address[state]']"));
		Select select = new Select(state);
		select.selectByIndex(2);		
		driver.findElement(By.name("address[zip_code]")).sendKeys("446688");
		driver.findElement(By.name("address[country]")).click();
		driver.findElement(By.name("address[birthday]")).sendKeys("10/10/2010");		
	//	driver.findElement(By.name("address[color]")).click();
		driver.findElement(By.name("address[age]")).sendKeys("22");
		driver.findElement(By.name("address[website]")).sendKeys("http://a.testaddressbook.com/");		
		//picture
	//	driver.findElement(By.xpath("//input[@id='address_picture']"));
	//    Runtime.getRuntime().exec("D:\\Sujit\\FileUploadScript.exe");				
		driver.findElement(By.name("address[phone]")).sendKeys("9988664422");		
		WebElement cheakbox = driver.findElement(By.xpath("//input[@id='address_interest_climb']"));
		cheakbox.click();
		boolean b = cheakbox.isSelected();
		System.out.println(b);	
		driver.findElement(By.xpath("//textarea[@id='address_note']")).sendKeys("Hello");		
		driver.findElement(By.xpath("//input[@type='submit']")).click();										
	}	*/
	
	
	
	
		
	
	
	
	
	
	


