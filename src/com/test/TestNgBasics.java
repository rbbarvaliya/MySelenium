package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//How may type or diff of annotation ?
	//There are diff annotations- all prerequisites annotation, test case annotation 
	//and post condition annotation that you can design your test cases in sequencing manner.
	
	
	//@BeforeSuite---setup system property for chrome--1
	//@BeforeTest---launchBrowser--2
	//@BeforeClass---login to app---3
	
	//@BeforeMethod--enter URL
	//@Test---Google Title Test
	//@AfterMethod---logout from app
	
	//@BeforeMethod--enter URL
	//@Test---google logo Test
	//@AfterMethod---logout from app
	
	//@BeforeMethod--enter URL
	//@Test--search Test
	//@AfterMethod---logout from app
	
	//@AfterClass---Close Browser
	//@AfterTest---deleteAllCookies
	
	
	//Pre-condition annotation---starting with@Before
	
	@BeforeSuite//1
	public void setUp() {
		System.out.println("@BeforeSuite---setup system property for chrome");
	}
	
	@BeforeTest//2
	public void launchBrowser() {
	System.out.println("@BeforeTest---launchBrowser");
    }
	
	@BeforeClass//3
	public void login() {
		System.out.println("@BeforeClass---login to app");
	}

	/*
	 * @BefroreMethod
	 * @Test-1
	 * @AfterMethod
	 * 
	 * @BeforteMethod
	 * @Test-2
	 * @AfterMethod
	 * 
	 * @BeforteMethod
	 * @Test-3
	 * @AfterMethod
	 * 
	 * 
	 */
	
	@BeforeMethod//4
	public void enterURL() {
		System.out.println("@BeforeMethod--enter URL");
	}
	
	//test case-- starting with@Test
	@Test//5
	public void googleTitle() {
		System.out.println("@Test---Google Title Test");
	}

	@Test
	public void searchTest() {
	System.out.println("@Test--search Test");	
	}
	
	@Test
	public void googlelogoTest() {
	System.out.println("@Test---google logo Test");	
	}
	
	//post condition--- starting with @After
	@AfterMethod//6
	public void logOut() {
		System.out.println("@AfterMethod---logout from app");
	}
	
	@AfterClass//7
	public void closeBrowser() {
		System.out.println("@AfterClass---Close Browser");
	}
	
	@AfterTest//8
	public void deleteAllCookies() {
	System.out.println("@AfterTest---deleteAllCookies");	
	}
	
	
	

	
	
}
