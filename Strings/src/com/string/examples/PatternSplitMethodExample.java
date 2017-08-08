package com.string.examples;

import java.util.regex.Pattern;

public class PatternSplitMethodExample {
public static void main(String[] args) {
	Pattern pat=Pattern.compile("i");
	String[] str=pat.split("This is sravanthi");
	for(String w:str)
	{
		System.out.println(w);
	}
	System.out.println("period is a special case");
	Pattern pat1=Pattern.compile("[.]");//  \\.
	String[] str1=pat1.split("www.google.com");
	for(String w:str1)
	{
		System.out.println(w);
	}
}
}
