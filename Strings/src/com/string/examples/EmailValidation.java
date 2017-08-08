package com.string.examples;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
public static void main(String[] args) {
	
	String email = "";
	Scanner scan = new Scanner(System.in);
	email = scan.nextLine();
	Pattern pack=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
Matcher mat=pack.matcher(email);
	
	if(mat.matches())
	{
		System.out.println("valid mail id");
	}
	else
	{
		System.out.println("invalid mail id");
	}
	
}
}
