package com.ui.drivers;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ui.constants.Browser;

public class LocalDriver {

	
	public static WebDriver getLocalBrowser(Browser browserName)   {

		WebDriver driver = null;
		 

			if (browserName == Browser.CHROME) {

				ChromeOptions options = new ChromeOptions();
				Map<String, Object> prefs = new HashMap<>();
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				prefs.put("autofill.profile_enabled", false);
				prefs.put("autofill.credit_card_enabled", false);
				options.setExperimentalOption("prefs", prefs);
				options.addArguments("--disable-notifications");
				options.addArguments("--disable-infobars");
				options.addArguments("--disable-save-password-bubble");

				driver = new ChromeDriver(options);
			} else if (browserName == Browser.EDGE) {

				driver = new EdgeDriver();
			}

			else if (browserName == Browser.FF) {

				driver = new FirefoxDriver();
			}

		
		return driver;

	}
}
