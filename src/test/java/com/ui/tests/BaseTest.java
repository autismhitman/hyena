package com.ui.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ui.constants.Browser;
import com.ui.drivers.Driver;

public class BaseTest {
	
	
	 
	@BeforeMethod
	public void setup() {
		 
		
		 
			String browser = System.getProperty("browserName").toUpperCase(); 
			try {
				Driver.initDriver( Browser.valueOf(browser));
			} catch (MalformedURLException e) {
				 
				e.printStackTrace();
			}
		  
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		Driver.quitDriver();
	}

}
