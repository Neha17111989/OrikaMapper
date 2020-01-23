package com.altimetrik.orkio.EntityMapperDemo;

import java.util.Date;

import ma.glasnost.orika.MapperFacade;

public class MapperDemo {

	public static void main(String[] args) {
		
		MapperFacade facade = new MapperConfiguration();
		// System.out.println(facade.toString());
		// Employee employee=new Employee(6812, "neha", "mehta", "chandigarh",
		// "122225555",
		/*
		 * System.out.println(employee); EmployeeDTO employeeDTO = facade.map(employee,
		 * EmployeeDTO.class); System.out.println(employeeDTO);
		 */

		Employee employee = new Employee(6812, "neha", "mehta", "chandigarh", "122225555","yerwada",
				"PB", "pune",777, "pawan", "renu",
				1, "CITI-", "russia IP", "chandan", 5,"AGILE",
				"ODC-citi","srijan","srijan manmeet","india","lalru",14090,
				"dera bassi","asia","nn","VM","01919191",
				"dept","manger","master",
				  "THINKPAD","THINKPAD BATTERY BANK","WILDCRAFT",
				  "NO","add1","add2","add3","12L",
				  "XS","00000","000001","CIAZ","8888","D block","2020",new Date(),new Date(),"F49","F50");

		System.out.println(employee);
		long start = System.currentTimeMillis();
		EmployeeDTO employeeDTO = facade.map(employee, EmployeeDTO.class);
		
		long end = System.currentTimeMillis();
		System.out.println(employeeDTO);
		System.out.println("Counting to 10000000 takes " + (end - start) + "ms");

		/*
		 * System.out.println(employee); EmplDiffField diffField = facade.map(employee,
		 * EmplDiffField.class); System.out.println(diffField);
		 */
	}

}
