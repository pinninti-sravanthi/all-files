package com.Practise.examples;

public class Swap {
	static int num1, num2;

	public static void main(String[] args) {
		boolean result = task(num1 = 10, num2 = 30);
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

	private static boolean task(int num1, int num2) {

		num2 = (num1 + num2) - (num1 = num2);
		System.out.println("num1= " + num1 + "; num2 = " + num2);

		return true;
	}
}
