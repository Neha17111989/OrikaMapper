package com.altimetrik.orkio.Multiple;

import java.util.Date;

import ma.glasnost.orika.MapperFacade;

public class Demo {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		MapperFacade mapper= new MultipleFieldMapper();
		Address address=new Address();
		Person p=new Person();
		p.setPid(133);
		p.setPname("MMM");
		address.setCountry("INDIA");
		address.setPin("9090");
		address.setZipCode(140901);
		p.setAddress(address);
		//Address add=new Address();
		//p.setPaddress(new Address(111, "ind", "11111"));
		//p.setDate(new Date());
		System.out.println(p);
		
		UserDTO obj=mapper.map(p, UserDTO.class);
		System.out.println(obj);
		 long end = System.currentTimeMillis();
		 System.out.println("Counting to 10000000 takes " + (end - start) + "ms");
		
		
	}
}
