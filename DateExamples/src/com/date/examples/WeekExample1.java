package com.date.examples;

import java.util.Scanner;

public class WeekExample1 {
	enum Week {
		SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

		private int value;

		private Week(int value) {
			this.value = value;
		}

		public static void changeState(int i) {

			for (Week s : Week.values()) {

				System.out.println(s + "" + s.value);
			}

		}
	}

	public static void main(String[] args) {

		System.out.println("please select the number from 1-7");
		Scanner scan = new Scanner(System.in);
		int numberobj = scan.nextInt();
		switch (numberobj) {
		case 1:
			Week.changeState(1);
			break;
		case 2:
			Week.changeState(2);

			break;
		}
	}
}
