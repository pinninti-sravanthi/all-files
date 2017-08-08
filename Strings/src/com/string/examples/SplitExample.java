package com.string.examples;

public class SplitExample {
public static void main(String[] args) {
	String str="India is my country";
	String[] words=str.split("\\s",2);
	for(String w : words)
	System.out.println(w);
	System.out.println(str.startsWith("India"));
	System.out.println(str.substring(6,8));
	char[] arr=str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);}
	String str1="INDIA IS MY COUNtry";
	System.out.println(str1.toLowerCase());
	System.out.println(str1.toUpperCase());
	String str2="          India is my country              ";
	System.out.println(str2.trim());
String str3=String.valueOf(10);
System.out.println("sravanthi"+str3);
}
}
