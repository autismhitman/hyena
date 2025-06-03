package com.ui.pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ui.utils.SeleniumUtils;

public class RegistrationConfirmationPage extends SeleniumUtils {
	
	private static final Logger logger =LoggerFactory.getLogger(RegistrationConfirmationPage.class);
	
	private static final By GOTOFLIGHTBTN = By.id("go-to-flights-search");
	
	public FlightSearchPage clickOnFlightSearch() {
		
		logger.info("Clicking on GOTOFLIGHT  button");
		click(GOTOFLIGHTBTN);
		return new FlightSearchPage();
	}
	

}
