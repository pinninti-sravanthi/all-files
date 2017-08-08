package com.string.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierExample {
public static void main(String[] args) {
	System.out.println("Quantifiers using a");
	Pattern patobj=Pattern.compile("a");
	Matcher matchobj=patobj.matcher("abaabaaab");
	while(matchobj.find()) {
		System.out.println(matchobj.start()+"..."+matchobj.group());
	}
	System.out.println("Quantifiers using a+");
		Pattern patobj1=Pattern.compile("a+");
		Matcher matchobj1=patobj1.matcher("abaabaaab");
		while(matchobj1.find()) {
			System.out.println(matchobj1.start()+"..."+matchobj1.group());
		}
		System.out.println("Quantifiers using a*");
			Pattern patobj2=Pattern.compile("a*");
			Matcher matchobj2=patobj2.matcher("abaabaaab");
			while(matchobj2.find()) {
				System.out.println(matchobj2.start()+"..."+matchobj2.group());
			}
			System.out.println("Quantifiers using a?");
				Pattern patobj3=Pattern.compile("a?");
				Matcher matchobj3=patobj3.matcher("abaabaaab");
				while(matchobj3.find()) {
					System.out.println(matchobj3.start()+"..."+matchobj3.group());
	}
}
}
