package com.altimetrik.orkio.Multiple;

public class Adress2 {
	private int zipCode;
	private String country;
	private String pin;

	Adress2(){}

	public Adress2(int zipCode, String country, String pin) {
		super();
		this.zipCode = zipCode;
		this.country = country;
		this.pin = pin;
	}

	public int getZipCode() {
		return zipCode;
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

	@Override
	public String toString() {
		return "Adress2 [zipCode=" + zipCode + ", country=" + country + ", pin=" + pin + "]";
	}

	

}
