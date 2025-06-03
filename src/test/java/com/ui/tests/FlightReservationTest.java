package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ui.pages.RegistrationFormPage;
import com.ui.pojos.Address;

public class FlightReservationTest  extends BaseTest {
	
	

	@Test(dataProviderClass=com.ui.dataprovider.TestDataProvider.class,dataProvider="getData")

	public void flightReservationTest(Address address) {

       String actualPrice= new RegistrationFormPage() 
    		   .enterUserDetails(address.getFirstName(), address.getLastName())
	   .enterUserCredentials(address.getEmail(), address.getPassword())
	   .enterAddress(address.getStreet(), address.getCity(), address.getState(),
			                address.getZip()).clickOnRegister().clickOnFlightSearch()
	 .selectPassengers(address.getPassengersCount()).clickSearchFlights()
     .selectFlights().confirmFlights().getPrice();
 
	 Assert.assertEquals(actualPrice, address.getExpectedPrice());
 
	       }

}
