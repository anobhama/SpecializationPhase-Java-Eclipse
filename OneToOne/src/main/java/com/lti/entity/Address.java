package com.lti.entity;

import javax.persistence.*;

@Entity
@Table(name="ADDRESS_OTO")
public class Address {
	
	@Id
	@Column(name="ADDRESS_ID")
	private int addId;
	
	@Column(name="ADDRESS_CITY")
	private String city;
	
	@Column(name="ADDRESS_STATE")
	private String state;

	
	@Column(name="ADDRESS_COUNTRY")
	private String country;
	
	public Address() {
		super();
	}

	public Address(int addId, String city, String state, String country) {
		super();
		this.addId = addId;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
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

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
