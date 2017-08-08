package com.inner.classes;

public class StringConversionExamples {
	public static void main(String[] args) {
		// string to int

		String str = "230";
		int i = Integer.parseInt(str);// converting string to integer
		System.out.println(str + 20);// prints 23020 because it concatenates as it is a string
		System.out.println(i + 20);// prints 250 because it is converted to integer

		// int to string using String.valueOf()
		int i1 = 20;
		String str1 = String.valueOf(i1);// converting integer to string using valueof()
		System.out.println(i1 + 30);// prints 50
		System.out.println(str1 + 30);// prints 2030

		// int to string using toString()
		int i2 = 20;
		String str2 = Integer.toString(i2);// converting integer to string using toString()
		System.out.println(i2 + 30);// prints 50
		System.out.println(str2 + 30);// prints 2030

		// string to long

		String str3 = "230";
		long l = Long.parseLong(str3);// converting string to long
		System.out.println(str3 + 20);// prints 23020 because it concatenates as it is a string
		System.out.println(l + 2034567654);// prints 2034567884 because it is converted to integer

	}
}
