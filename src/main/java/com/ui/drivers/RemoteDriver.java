package com.ui.drivers;

import java.io.ObjectInputFilter.Config;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ui.constants.Browser;
import com.ui.constants.Constants;
import com.ui.utils.PropertyUtils;

public class RemoteDriver {

	public static WebDriver getRemoteBrowser(Browser browserName) throws MalformedURLException {

		WebDriver driver = null;

		Capabilities cap = null;

		if (browserName == Browser.CHROME) {

			cap = new ChromeOptions();
		} else if (browserName == Browser.FF) {

			cap = new FirefoxOptions();
		} else if (browserName == Browser.EDGE) {

			cap = new EdgeOptions();
		}

		String urlFormat = PropertyUtils.getPropertyValues(Constants.GRID_URL_FORMAT);
		String hubHost = PropertyUtils.getPropertyValues(Constants.GRID_HUB_HOST);
		String url = String.format(urlFormat, hubHost);

		driver = new RemoteWebDriver(new URL(url), cap);

		return driver;

	}
}
