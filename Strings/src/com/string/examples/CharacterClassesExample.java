package com.string.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesExample {
public static void main(String[] args) {
	System.out.println("enter");
	Pattern patobj=Pattern.compile("[0-9]");
	Matcher match=patobj.matcher("a2@Zb0#9");
	while(match.find())
	{
		System.out.println(match.start()+" ...... "+match.group());
	}
}
}
