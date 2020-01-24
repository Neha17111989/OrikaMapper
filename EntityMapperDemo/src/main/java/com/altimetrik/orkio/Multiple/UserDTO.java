package com.altimetrik.orkio.Multiple;

public class UserDTO {

	private int uId;
	private String uname;

	public Adress2 getAddress() {
		return address;
	}

	public void setAddress(Adress2 address) {
		this.address = address;
	}

	private Adress2 address;
	//MyDate date;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@Override
	public String toString() {
		return "UserDTO [uId=" + uId + ", uname=" + uname +  ", address= "+ address.getCountry() +" , "+address.getPin() +" . "+address.getZipCode()+"]";
	}

	

}
