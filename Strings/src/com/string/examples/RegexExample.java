package com.string.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	static int count=0;
public static void main(String[] args) {
	Pattern patobj=Pattern.compile("ab");
	Matcher match=patobj.matcher("abababababaaa");
	while(match.find())
	{
		count++;
		System.out.println(match.start()+"......"+match.end()+"....."+match.group());
		
	}
	System.out.println("no of ocurrences "+count);
}
}
