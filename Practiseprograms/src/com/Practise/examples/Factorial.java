package com.Practise.examples;

import java.util.Scanner;

public class Factorial {
	static String e1;
	public static void main(String[] args) throws  Exception{
		
		System.out.println("enter number to find factorial");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		scan.close();
		int factorial = fact(num);
		System.out.println("factorial is " + factorial);
		//testcase1
		int result = fact(5);
		int expected = 120;
		test(result, expected);
		
		
		//testcase2
		int result2 = 0;
			if(fact(0) !=-1) {
				result2 = fact(0);
			}
			else
			{
				System.out.println("Their is exception here");
			}
				String expected2 = "java.lang.StackOverflowError";
				test(result2, expected2);

	}

	private static void test(int result, int expected) {
		if (result == expected) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}

	
	private static int fact(int num) {
		try {
		if (num == 1) {
			return 1;
		} else {
			return num * fact(num - 1);
		}
	
		}
	catch(Exception e)
	{
		
		System.out.println(e1=e.getMessage());
		return -1;
	}
		
		
}
}