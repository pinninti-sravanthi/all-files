package com.date.examples;

import java.time.LocalTime;

public class LocalTimeExample {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalTime time1 = LocalTime.of(13, 12, 10);// hh:mm:ss
		System.out.println(time1);
		System.out.println(time1.minusHours(2));
		System.out.println(time1.minusMinutes(10));
		System.out.println(time1.plusHours(2));
		System.out.println(time1.plusMinutes(20));

	}
}
