package com.csvparserexample.domain;

public class Pharmacy {
	
	private String pharmacyType;
	private String retailer;
	private String pharmacyService;
	private String description;
	private String phoneNumber;
	private String website;
	private String wheelchairAccessible;
	private String hours;
	private String street;
	private String city;
	private String province;
	private String postalCode;
	private double latitude;
	private double longitude;
	
	
	
	public String getPharmacyType(){
		return pharmacyType;
	}
	
	public void setPharmacyType(String pharmacyType){
		this.pharmacyType = pharmacyType;
	}
	
	public String getRetailer(){
		return retailer;
	}
	
	public void setRetailer(String retailer){
		this.retailer = retailer;
	}

	public String getPharmacyService() {
		return pharmacyService;
	}

	public void setPharmacyService(String pharmacyService) {
		this.pharmacyService = pharmacyService;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}


	public String getWheelchairAccessible() {
		return wheelchairAccessible;
	}

	public void setWheelchairAccessible(String wheelchairAccessible) {
		this.wheelchairAccessible = wheelchairAccessible;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
}
