package com.ui.dataprovider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ui.pojos.Address;
import com.ui.pojos.Data;
import com.ui.utils.JsonUtils;

public class TestDataProvider {
	
	
	@DataProvider(parallel = false)
	public Iterator<Object[]> getData() {
         List<Address> list =JsonUtils.getLoginData();
         
	     List<Object[]> data = new ArrayList<>();
	     
	     for(Address address : list) {
	    	 
	    	 data.add(new Object[] {address});
	     }
	    return data.iterator();
	}
	
	
}
