package com.ui.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ui.constants.Browser;
import com.ui.drivers.Driver;

public class BaseTest {
	
	
	 
	@BeforeMethod
	public void setup() {
		
		Driver.initDriver(Browser.CHROME);
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		Driver.quitDriver();
	}

}
