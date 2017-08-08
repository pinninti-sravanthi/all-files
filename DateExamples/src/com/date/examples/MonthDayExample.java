package com.date.examples;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExample {
	public static void main(String[] args) {
		MonthDay monthday1 = MonthDay.now();
		long monthofyear = monthday1.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("month of year" + monthofyear);

		ValueRange monthofyear1 = monthday1.range(ChronoField.MONTH_OF_YEAR);
		System.out.println("month of year range" + monthofyear1);
		ValueRange dayofmonth = monthday1.range(ChronoField.DAY_OF_MONTH);
		System.out.println("day of month range" + dayofmonth);

		LocalDate date = monthday1.atYear(2017);
		System.out.println(date);// 2017-07-18
		boolean validyear = monthday1.isValidYear(2017);
		System.out.println("Is a valid year" + validyear);

		/*
		 * MonthDay monthday2 = MonthDay.of(2, 30); System.out.println(monthday2);
		 * boolean b1 = monthday2.isValidYear(2017); System.out.println(b1);
		 */

	}
}
