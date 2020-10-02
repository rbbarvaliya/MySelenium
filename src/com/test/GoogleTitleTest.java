package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups= {"AllClassTest"})
public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.google.ca/");
	}
	
	@Test(groups= {"sanity","smoke","regression"})
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "title is not matched");
//		Assert.assertTrue(true)	
	}
	
	@Test(groups= {"smoke"})
	public void test1() {
		String title = driver.getTitle();
		System.out.println("test1 title" + title);
	}
	
	@Test (groups= {"sanity"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test ()
	public void test3() {
		System.out.println("test2");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
