package com.ui.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyUtils {

	private static Properties property=new Properties();
	private static InputStream is;
	private static final Logger log = LoggerFactory.getLogger(PropertyUtils.class);
	
	public static String getPropertyValues(String value) {
		
		try {
			is = ResourceLoader.getResource("config/config.properties");
			property.load(is);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return property.getProperty(value);
	}
}
