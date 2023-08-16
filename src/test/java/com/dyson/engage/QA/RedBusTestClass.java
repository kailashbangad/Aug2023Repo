package com.dyson.engage.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedBusTestClass extends BaseTest {

	
	
	

	@Test
	   public void redbusAssignment() throws InterruptedException {
	       //Create object of HomePage Class
	       HomePageRedBus home = new HomePageRedBus(driver);
	       home.enterFrom();
	       Thread.sleep(1000);
	       home.enterTo();
	       
	       Thread.sleep(1000);
	       
	       home.clickCalender();
	      
	       home.clickLogo();
	      
	       home.scrollIntoBottom();
	       Thread.sleep(2000);
	       home.clickOnRyde();
	       Thread.sleep(1000);
	       home.scroll();
	       
	       Thread.sleep(5000);
	       
	       driver.navigate().to("https://www.redbus.in/");
	       
	       Thread.sleep(2000);
	       home.clickOnTwitter();
	       
	      

}
	
}
