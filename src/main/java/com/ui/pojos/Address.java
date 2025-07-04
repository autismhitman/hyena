package com.ui.pojos;

public class Address {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String passengersCount;
	private String expectedPrice ;
	
 

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getPassengersCount() {
		return passengersCount;
	}
	public void setPassengersCount(String passengersCount) {
		this.passengersCount = passengersCount;
	}
	public String getExpectedPrice() {
		return expectedPrice;
	}
	public void setExpectedPrice(String expectedPrice) {
		this.expectedPrice = expectedPrice;
	}


	@Override
	public String toString() {
		return "  [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", passengersCount=" + passengersCount + ", expectedPrice=" + expectedPrice + "]";
	}
	
	
	

}
