package com.ui.pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ui.utils.SeleniumUtils;

public class FlightSearchPage extends SeleniumUtils{
	
	private static final Logger logger =LoggerFactory.getLogger(FlightSearchPage.class);
	
	  private static final  By PASSENGER_SELECTION =By.id("passengers");
	  private static final  By SEARCHFLIGHT_BTN = By.cssSelector("button#search-flights");
	   
	   
	   public FlightSearchPage selectPassengers(String noOfPassengers) {   		   
		   
		   logger.info(noOfPassengers+" to be selected from passenger selection");		   
		   selectDropdownByValue(noOfPassengers,PASSENGER_SELECTION);
		   return this; 		  
	   }
	   
	   public SelectFlightPage clickSearchFlights() {		   
		   scrollActions(SEARCHFLIGHT_BTN);
		   logger.info("Search flight btn clicked");
		   return new SelectFlightPage();
	   }
	   
	   

}
