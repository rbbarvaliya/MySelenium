package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException {
		
        Xls_Reader reader = new Xls_Reader("C:\\Users\\ravin\\eclipse-workspace\\MySelenium\\src\\com\\testdata\\EbayTestData.xlsx");
		
		String firstname = reader.getCellData("RegTestData", "firstname", 2); 
		System.out.println(firstname);
		
		String lastname = reader.getCellData("RegTestData", "lastname", 2); 
		System.out.println(lastname);
		
		String emailaddress = reader.getCellData("RegTestData", "emailaddress", 2); 
		System.out.println(emailaddress);
		
		String password = reader.getCellData("RegTestData", "password", 2); 
		System.out.println(password);
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		driver.findElement(By.id("lastname")).sendKeys(lastname);
		driver.findElement(By.id("email")).sendKeys(emailaddress);
		driver.findElement(By.id("PASSWORD")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("ppaFormSbtBtn")).click();
		
	}
	

}
