package com.ui.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ui.constants.Browser;

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

		driver = new RemoteWebDriver(new URL("http://192.168.1.7:4444/wd/hub"), cap);

		return driver;

	}
}
