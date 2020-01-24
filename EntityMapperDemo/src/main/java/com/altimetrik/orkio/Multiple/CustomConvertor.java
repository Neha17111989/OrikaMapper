package com.altimetrik.orkio.Multiple;

import java.util.Date;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class CustomConvertor extends CustomConverter<Address, Adress2> {

	public Adress2 convert(Address source, Type<? extends Adress2> destinationType) {
		System.out.println("inside convertor:" + source.getCountry());
		Adress2 obj = new Adress2();
		obj.setZipCode(source.getZipCode());
		obj.setCountry(source.getCountry());
		obj.setPin(source.getPin());

		return obj;

	}
	// return add2; }

	/*
	 * public MyDate convert(Date source, Type<? extends MyDate> destinationType) {
	 * System.out.println("inside convertor"); MyDate myDate=new MyDate();
	 * myDate.setDojDate(source.getDay()); myDate.setDojMonth(source.getMonth());
	 * return myDate; }
	 */

}
