package com.jim.bms.controller.converter;

import java.util.Date;

import org.junit.Test;

import com.jim.common.controller.converter.DateConverter;

public class DateConverterTest {



	@Test
	public void test() {
		DateConverter dateConverter = new DateConverter();
		Date date = dateConverter.convert("2017-07-08 08:08:08");
		System.out.println(date);
	}

}
