package com.ui.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.ui.pojos.Address;
import com.ui.pojos.Data;

public class JsonUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);
	 
	
 
	 public static List<Address> getLoginData() {
		 
		 Gson gson = new Gson();
		 
		 FileReader reader = null;
		 
		 try {
			 
			 reader = new FileReader(new File("config/test-data/flight-reservation/passenger-1.json"));
		 }catch(FileNotFoundException e) {
			 e.printStackTrace();
		 }
		    Data address=  gson.fromJson(reader, Data.class);
			return address.getData();
		 
	 }
  
    
}

