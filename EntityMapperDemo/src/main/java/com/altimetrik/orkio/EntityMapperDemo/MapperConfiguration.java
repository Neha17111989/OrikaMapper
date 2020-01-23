package com.altimetrik.orkio.EntityMapperDemo;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class MapperConfiguration extends ConfigurableMapper {

	
	  @Override protected void configure(MapperFactory factory) {
		  
	  factory.classMap(Employee.class, EmployeeDTO.class) 
	  .byDefault() 
	  .register();
	  }
	 

	/*
	 * @Override protected void configure(MapperFactory factory) {
	 * factory.classMap(Employee.class, EmplDiffField.class).field("eId",
	 * "id").field("fname", "name") .field("address",
	 * "residence").field("accountNumber", "accounts").register(); }
	 */
}
