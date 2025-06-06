package com.ui.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		
		 
		 try ( InputStreamReader reader  = 
				 new InputStreamReader(ResourceLoader.getResource("config/test-data/flight-reservation/passenger-1.json"));){
			 Data address=  gson.fromJson(reader, Data.class);
			return address.getData();
 
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		return null;
		    
		 
	 }
  
    
}

