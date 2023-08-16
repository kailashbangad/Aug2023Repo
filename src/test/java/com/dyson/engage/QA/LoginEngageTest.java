package com.dyson.engage.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginEngageTest {

	public static WebDriver driver = null;

	@Given("Agent open the browser hit the url")
	public void agent_open_the_browser_hit_the_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@Given("Agent on login page of engage application")
	public void agent_on_login_page_of_engage_application() {
		driver.get("");
		driver.manage().window().maximize();
	}

	@When("Agent enter the username in username field")
	public void agent_enter_the_username_in_username_field() {
		driver.findElement(By.id("")).sendKeys("");
	}

	@When("Agent enter the password in password field")
	public void agent_enter_the_password_in_password_field() {
		driver.findElement(By.id("")).sendKeys("");
	}

	@When("Agent click on login button")
	public void agent_click_on_login_button() {
		driver.findElement(By.id("")).click();
	}

	@Then("Agent should able to login successfully")
	public void agent_should_able_to_login_successfully() {
		System.out.println(driver.getTitle());
	}

}
