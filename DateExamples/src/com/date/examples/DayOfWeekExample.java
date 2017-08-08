package com.date.examples;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DayOfWeekExample {

	public static void main(String[] args) {
		System.out.println("enter day number from 1-7");
		Scanner scan = new Scanner(System.in);

		int day = scan.nextInt();

		System.out.println(DayOfWeek.of(day).minus(5));

		scan.close();

	}

}
