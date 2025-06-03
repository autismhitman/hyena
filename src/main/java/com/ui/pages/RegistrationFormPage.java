package com.ui.pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ui.pojos.Address;
import com.ui.utils.SeleniumUtils;

public class RegistrationFormPage extends SeleniumUtils {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationFormPage.class);

	private static final By FIRSTNAME_FIELD = By.id("firstName");
	private static final By LASTNAME_FIELD = By.id("lastName");
	private static final By EMAIL_FIELD = By.id("email");
	private static final By PASSWORD_FIELD = By.id("password");
	private static final By STREET_FIELD = By.name("street");
	private static final By CITY_FIELD = By.name("city");
	private static final By STATE_FIELD = By.id("inputState");
	private static final By ZIP_FIELD = By.name("zip");
	private static final By REGISTER_BTN = By.id("register-btn");
    
	/*
	 * public RegistrationFormPage openLink() { goToWebSite(); return this; }
	 */
	public RegistrationFormPage enterUserDetails(String firstName, String lastName) {
		enterText(firstName, FIRSTNAME_FIELD);
		enterText(lastName, LASTNAME_FIELD);
		return this;
	}

	public RegistrationFormPage enterUserCredentials(String email, String password) {
		enterText(email, EMAIL_FIELD);
		enterText(password, PASSWORD_FIELD);
		return this;
	}

	public RegistrationFormPage enterAddress(String street, String city, String state, String zip) {
		enterText(street, STREET_FIELD);
		enterText(city, CITY_FIELD);
		selectDropdownByText(state, STATE_FIELD);
		enterText(zip, ZIP_FIELD);
		return this;
	}

	public RegistrationConfirmationPage clickOnRegister() {

		click(REGISTER_BTN);
		logger.info("Successfully entered the passenger details and click on register btn");
		return new RegistrationConfirmationPage();
	}

}
