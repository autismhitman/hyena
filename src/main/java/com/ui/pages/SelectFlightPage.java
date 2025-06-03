package com.ui.pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ui.utils.SeleniumUtils;
 
public class SelectFlightPage extends SeleniumUtils{
	
	private static final Logger logger =LoggerFactory.getLogger(SelectFlightPage.class);
	
	private static final By DEPARTURE_BTN = By.cssSelector("input[name='departure-flight']");
	private static final By ARRIVAL_BTN = By.cssSelector("input[name='arrival-flight']");
	private static final By CONFIRM_FLIGHTS_BTN = By.id("confirm-flights");
	
     
	
	public SelectFlightPage selectFlights()  {
		  
		  selectFlights(DEPARTURE_BTN); 	 
		  selectFlights(ARRIVAL_BTN); 
      	  return this;
	}
	
	public FlightConfirmationPage confirmFlights(){		
		 scrollActions(CONFIRM_FLIGHTS_BTN);
		 logger.info("Clicking on confirm flight button");
         return new FlightConfirmationPage();
    }
}
