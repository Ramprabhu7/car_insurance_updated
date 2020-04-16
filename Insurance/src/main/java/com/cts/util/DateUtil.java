package com.cts.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String dateToBeConverted)
			throws ParseException {

		return new SimpleDateFormat("dd/MM/yyyy").parse(dateToBeConverted);
	}
	
	/*
	 * public LocalDate date = formatter.parseLocalDate("18/08/2012");
	 * System.out.println(date.getYear());
	 * System.out.println(date.getMonthOfYear());
	 * System.out.println(date.getDayOfMonth());
	 */
}
