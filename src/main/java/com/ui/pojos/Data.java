package com.ui.pojos;

import java.util.List;

public class Data {
	
	List<Address> data ;

	public List<Address> getData() {
		return data;
	}

	public void setData(List<Address> data) {
		this.data = data;
	}
	
	

	public Data() {
		super();
	}

	public Data(List<Address> data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}
	
	

}
