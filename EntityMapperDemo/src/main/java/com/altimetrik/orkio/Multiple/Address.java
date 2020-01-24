package com.altimetrik.orkio.Multiple;

public class Address {

	private int zipCode;
	private String country;
	private String pin;

	public int getZipCode() {
		return zipCode;
	}

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", country=" + country + ", pin=" + pin + "]";
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Address(int zipCode, String country, String pin) {
		super();
		this.zipCode = zipCode;
		this.country = country;
		this.pin = pin;
	}
	Address(){}
}
