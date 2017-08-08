package com.Practise.examples;

import java.time.Month;
import java.util.Scanner;

public class MonthFromDateExample {
	private static int i;

	public static void main(String[] args) {
		// testcase1
		/*
		 * Month actual=month(2); String expected="FEBRUARY"; test(actual,expected);
		 */
		// testcase2
		Month actual = month(0);
		String expected = "java.time.DateTimeException";
		test(actual, expected);
	}

	private static void test(Month actual, String expected) {
		String actual1 = String.valueOf(actual);
		if ((expected).equals(actual1)) {
			System.out.println("test pass");
		}
	}

	static Month month(int i) {
		/*
		 * System.out.println("enter month number"); Scanner scan = new
		 * Scanner(System.in);
		 * 
		 * int date = scan.nextInt();
		 */

		System.out.println(Month.of(i).name());

		return Month.of(i);

		/*
		 * System.out.println("do u want to enter again(1/0)"); int ch1 =
		 * scan.nextInt(); if (ch1 != 0) { month(ch1); } else {
		 * System.out.println("done.."); } scan.close();
		 */

	}
}
