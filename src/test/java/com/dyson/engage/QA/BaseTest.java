package com.dyson.engage.QA;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver = null;
	public static Properties pro;
	public static File file;
	public static FileInputStream fis;
	

	@BeforeMethod
	public static WebDriver initilize() {
		try {
			
			file=new File("C:\\java_hk\\Dyson.Engage\\config.properties");
			fis=new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
			
			String browser=pro.getProperty("browserName");

			// Use Of Singleton Concept and Initilize webDriver
			if (driver == null) {
				if (browser.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					ChromeOptions op = new ChromeOptions();
					// disable notification parameter
					op.addArguments("--disable-notifications");
					driver = new ChromeDriver(op);

				} else if (browser.equalsIgnoreCase("chrome headless")) {
					WebDriverManager.chromedriver().setup();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--headless");
					driver = new ChromeDriver(options);
				} else if (browser.equalsIgnoreCase("Firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}

			}

			// Perform Basic Operations
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(pro.getProperty("URL"));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return driver;
	}

	

	

	

}
