package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
//	<test thread-count="6" name="Test" parallel="methods">
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.ebay.ca/");
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3,groups="logo",enabled=false)
	public void googlelogoTest() {
       boolean b= driver.findElement(By.xpath("//img[@id='gh-logo']")).isDisplayed();
       System.out.println("Logo: " + b);
	}
	
	@Test(priority=2,groups="link",enabled=false)
	public void maillinkTest() {
		driver.findElement(By.linkText("Sign in")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test (priority=5,groups="Test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test (priority=6,groups="Test1")
	public void test3() {
		System.out.println("test3");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
