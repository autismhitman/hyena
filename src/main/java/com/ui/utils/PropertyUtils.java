package com.ui.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

	private static Properties property=new Properties();
	private static FileReader reader;
	
	public static String getPropertyValues(String value) {
		
		try {
			reader = new FileReader(new File("./src/test/resources/config/config.properties"));
			property.load(reader);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return property.getProperty(value);
	}
}
