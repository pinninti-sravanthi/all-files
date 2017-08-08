package com.date.examples;

import java.time.LocalDate;

public class LocalDateExample {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("today is " + date);
		System.out.println("yesterday is :" + date.minusDays(1));
		System.out.println("tomorrow is :" + date.plusDays(1));
	}
}
