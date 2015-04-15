package edu.spring.mvc.model;

import org.apache.log4j.Logger;

public class Address {
	
	private static final Logger logger = Logger.getLogger(Address.class);
	
	private String city;
	private String state;
	private String country;
	private Long pincode;
	
	public Address() {
		logger.debug("enters Address constructor");
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
}
