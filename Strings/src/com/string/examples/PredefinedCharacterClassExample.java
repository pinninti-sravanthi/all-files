package com.string.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClassExample {
public static void main(String[] args) {
	System.out.println("space character");
	Pattern pattern=Pattern.compile("\\s");
	Matcher match=pattern.matcher("a@c 8z9");
	
	while(match.find())
	{
		System.out.println(match.start()+"...."+match.group());
	}
	System.out.println("except space character");
	Pattern pattern1=Pattern.compile("\\S");
	Matcher match1=pattern1.matcher("a@c 8z9");
	while(match1.find())
	{
		System.out.println(match1.start()+"...."+match1.group());
	}
	System.out.println("digit");
	Pattern pattern2=Pattern.compile("\\d");
	Matcher match2=pattern2.matcher("a@c 8z9");
	while(match2.find())
	{
		System.out.println(match2.start()+"...."+match2.group());
	}
	System.out.println("except digit");
	Pattern pattern3=Pattern.compile("\\D");
	Matcher match3=pattern3.matcher("a@c 8z9");
	while(match3.find())
	{
		System.out.println(match3.start()+"...."+match3.group());
	}
	System.out.println("word character");
	Pattern pattern4=Pattern.compile("\\w");
	Matcher match4=pattern4.matcher("a@c 8z9");
	while(match4.find())
	{
		System.out.println(match4.start()+"...."+match4.group());
	}
	System.out.println("except word character");
	Pattern pattern5=Pattern.compile("\\W");
	Matcher match5=pattern5.matcher("a@c 8z9");
	while(match5.find())
	{
		System.out.println(match5.start()+"...."+match5.group());
	}
	System.out.println("peroid character");
	Pattern pattern6=Pattern.compile(".");
	Matcher match6=pattern6.matcher("a@c 8z9");
	while(match6.find())
	{
		System.out.println(match6.start()+"...."+match6.group());
	}
}
}
