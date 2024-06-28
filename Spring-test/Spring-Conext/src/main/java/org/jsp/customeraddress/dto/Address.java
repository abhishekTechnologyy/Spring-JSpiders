package org.jsp.customeraddress.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private int housenumber;
	@Column(nullable = false)
	private String building_name;
	@Column(nullable=false)
	private String landmark;
	@Column(nullable=false)
	private String city;
	@Column(nullable=false)
	private String state;
	@Column(nullable=false)
	private String country;
	@Column(nullable=false,unique=true)
	private int pincode;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@Override
	public String toString() {
		return "Address [id=" + id + ", housenumber=" + housenumber + ", building_name=" + building_name + ", landmark="
				+ landmark + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ ", customer=" + customer + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}

	public String getBuilding_name() {
		return building_name;
	}

	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}