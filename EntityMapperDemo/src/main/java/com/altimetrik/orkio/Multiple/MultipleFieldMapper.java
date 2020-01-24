package com.altimetrik.orkio.Multiple;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class MultipleFieldMapper extends ConfigurableMapper {

	

	@Override
	protected void configure(MapperFactory factory) {
		System.out.println("called mapper");
		factory.classMap(Person.class, UserDTO.class).field("pid", "uId").field("pname", "uname").byDefault()
				.register();
		 ConverterFactory cf = factory.getConverterFactory();
		 System.out.println(cf);
		cf.registerConverter(new CustomConvertor());
	}

}
