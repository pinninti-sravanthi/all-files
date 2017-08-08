package com.Practise.examples;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		boolean result = task(30, 40, 50);
		boolean expected = true;
		test(result, expected);
	}

	private static void test(boolean result, boolean expected) {
		if (result == expected) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}

	private static boolean task(int l, int j, int k) {

		int subj1, subj2, subj3, avg;
		while (true) {
			System.out.println("enter marks for 3 subjects");
			Scanner scan = new Scanner(System.in);
			subj1 = scan.nextInt();
			subj2 = scan.nextInt();
			subj3 = scan.nextInt();
			scan.close();
			avg = (subj1 + subj2 + subj3) / 3;
			System.out.println("average is:" + avg);
			if (avg >= 90) {
				System.out.println("A grade");
				return true;
			} else if (avg >= 80 && avg < 90) {
				System.out.println("B grade");
				return true;
			} else if (avg >= 70 && avg < 80) {

				System.out.println("C grade");
				return true;
			} else if (avg < 70 && avg>30) {
				System.out.println("D grade");
				return true;
			} else {
				System.out.println("fail");
				return true;
			}

		}

	}
}
