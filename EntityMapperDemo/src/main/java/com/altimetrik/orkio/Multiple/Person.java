package com.altimetrik.orkio.Multiple;

import java.util.Date;

public class Person {

	private int pid;
	private String pname;
	private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	Date date;
	
	Person(){}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address  + " , " + address.getCountry()  +", date=" + date + "]";
	}

	/*
	 * @Override public String toString() { return "Person [pid=" + pid + ", pname="
	 * + pname + ", date=" + date + "]"; }
	 */

	
	
	
}
