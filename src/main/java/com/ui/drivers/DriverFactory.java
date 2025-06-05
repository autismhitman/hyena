package com.ui.drivers;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.ui.constants.Browser;

public class DriverFactory {

	@SuppressWarnings("deprecation")
	public static WebDriver getBrowser(Browser browserName) throws MalformedURLException {

		WebDriver driver = null;

		if (Boolean.parseBoolean(System.getProperty("selenium.grid.enabled"))) {

			driver=RemoteDriver.getRemoteBrowser(browserName);

		} else {

			driver=LocalDriver.getLocalBrowser(browserName);

		}
		return driver;

	}
}
