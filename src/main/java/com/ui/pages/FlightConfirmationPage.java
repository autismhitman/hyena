package com.ui.pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ui.utils.SeleniumUtils;

public class FlightConfirmationPage extends SeleniumUtils {
	
	private static final Logger logger =LoggerFactory.getLogger(FlightConfirmationPage.class);
	
	private static final By FLIGHCONFIRMATIONELEMENT = 
			By.cssSelector("#flights-confirmation-section .card-body .row:nth-child(1) .col:nth-child(2)");
	                        
	private static final By TOTALPRICEELEMENT = 
			By.cssSelector("#flights-confirmation-section .card-body .row:nth-child(3) .col:nth-child(2)");
	                        
	public String getPrice() {
		
		logger.info("Return the total price of the booking made" + captureText(TOTALPRICEELEMENT));
		return captureText(TOTALPRICEELEMENT);
		
	}

}
