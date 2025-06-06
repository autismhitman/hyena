package com.ui.drivers;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.ui.constants.Browser;
import com.ui.constants.Constants;

public class DriverFactory {

	@SuppressWarnings("deprecation")
	public static WebDriver getBrowser(Browser browserName) throws MalformedURLException {

		WebDriver driver = null;

		if (Boolean.parseBoolean(System.getProperty(Constants.GRID_ENABLED))) {

			driver=RemoteDriver.getRemoteBrowser(browserName);

		} else {

			driver=LocalDriver.getLocalBrowser(browserName);

		}
		return driver;

	}
}
