package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

WebDriver driver;

    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) {
		
		System.out.println("Browser Name is:"+ browserName );
		System.out.println("Thred ID:" + Thread.currentThread().getId());
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		    driver = new ChromeDriver();
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ravin\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}else if(browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\Downloads\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test()
	public void googleTitleTest() {
	
		driver.get("https://www.google.ca/");
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "title is not matched");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("test is successful.");
		driver.quit();
	}
}
