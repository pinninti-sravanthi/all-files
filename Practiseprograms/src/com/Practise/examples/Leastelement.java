package com.Practise.examples;

import java.util.Scanner;

public class Leastelement {
	public static void main(String[] args) {
		int least, size, i;
		String ch;
		int arr[] = {7,4,3,6};
		//String[] arr = new String[]{"5","3","2"};
		
		
		int result = task(arr);
		int expected = 3;
		test(result, expected);
	}

	

	private static void test(int result, int expected) {
		// TODO Auto-generated method stub
		if (result==expected) {
			System.out.println("test pass");
		} else {
			System.out.println("test fails");
		}

	}
	
	private static int task(int[] arr) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * do { System.out.println("enter size"); size = scan.nextInt(); for (i = 1; i
		 * <= size; i++) { System.out.println("enter elements to sort "); arr[i] =
		 * scan.nextInt();
		 * 
		 * }
		 */

		// System.out.println("searching for least element ...");
		int least = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (least > arr[i]) {

				least = arr[i];
			}
			
		}
		/*
		 * System.out.println("least element in array is:" + least);
		 * 
		 * System.out.println("do you want to enter more elements(y/n)");
		 * 
		 * ch = scan.next();
		 * 
		 * }
		 * 
		 * } while (ch == "y");
		 * 
		 * 
		 * scan.close();
		 */
		System.out.println(least);
		return least;
	}
}
