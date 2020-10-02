package com.perameters;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PerameterTest {
	
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","sname"})
	public void yahooLoginTest(String url, String sname) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.findElement(By.name("q")).sendKeys(sname);
	    String title = driver.getTitle();
		System.out.println(title);
	}

}
