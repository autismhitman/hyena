package com.ui.drivers;

import java.net.MalformedURLException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;

import com.ui.constants.Browser;
import com.ui.utils.PropertyUtils;

public class Driver {	
	
	public static void initDriver(Browser browserName) throws MalformedURLException {
		
		 if(Objects.isNull(DriverManager.getDriver())) {
			   
		       WebDriver driver = DriverFactory.getBrowser(browserName);
		       DriverManager.setDriver(driver);
		       DriverManager.getDriver().get(PropertyUtils.getPropertyValues("url"));
		   	   DriverManager.getDriver().manage().window().maximize();
		 }
		 
		 
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
		
	}

}
