package com.lti.entity;

import org.springframework.beans.factory.annotation.*;

public class Address {
	
	@Value("Nagercoil")
	private String city;
	
	@Value("TN")
	private String state;
	
	public Address() {
		super();
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
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

	@Override
	public String toString() {
		return " \n [city=" + city + ", state=" + state + "]";
	}
	
	
	

}
