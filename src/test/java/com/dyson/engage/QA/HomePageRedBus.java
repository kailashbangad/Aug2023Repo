package com.dyson.engage.QA;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRedBus extends BaseTest {

	public HomePageRedBus(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input#src.sc-bxivhb.hrsLPT")
	WebElement from;

	public void enterFrom() {

		from.sendKeys("Indore");
	}

	@FindBy(css = "input#dest.sc-bxivhb.hrsLPT")
	WebElement to;

	public void enterTo() {

		to.sendKeys("Pune");
	}

	@FindBy(css = "#onwardCal")
	WebElement calenderClick;

	public void clickCalender() {

		calenderClick.click();

	}

	@FindBy(css = "img.rb_logo")
	WebElement redBusLogo;

	public void clickLogo() {

		redBusLogo.click();

	}

	@FindBy(css = "a#contact_us_footer")
	WebElement footerLink;

	public void scrollIntoBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", footerLink);
		footerLink.click();

	}

	@FindBy(css = "a#rYde.site-links.rpool_title")
	WebElement rydeLink;

	public void clickOnRyde() {

		
		  Set<String> windows = driver.getWindowHandles();
		  
		  for(String window:windows) {
		  
		  driver.switchTo().window(window); }
		 

		rydeLink.click();

	}

	@FindBy(css = "ytp-large-play-button ytp-button ytp-large-play-button-red-bg")
	WebElement button;

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", button);
		button.click();

	}

	@FindBy(css = "#redbus_twitter")

	WebElement clickTwitter;

	public void clickOnTwitter() {
		clickTwitter.click();

	}

}
