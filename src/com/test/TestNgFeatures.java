package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		//int i = 9/0;
	}

	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest() {
		System.out.println("searchpage test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegpageTest() {
		System.out.println("regpage test");
	}
	
}
