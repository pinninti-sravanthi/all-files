package com.date.examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("After Formatting: " + formatDateTime);
		// minus days
		LocalDateTime datetime1 = LocalDateTime.of(2017, 07, 18, 12, 25);
		LocalDateTime datetime2 = datetime1.minusDays(100);
		System.out.println("Before Formatting: " + datetime2);
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String formatDateTime1 = datetime2.format(format1);
		System.out.println("After Formatting: " + formatDateTime1);

	}
}
