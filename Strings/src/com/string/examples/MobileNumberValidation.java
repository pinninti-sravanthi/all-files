package com.string.examples;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
public static void main(String[] args) {

	Pattern pat=Pattern.compile("(0|91)?[789][0-9]{9}");
	
Matcher mat=pat.matcher("917894561234");
if(mat.matches())
{
	System.out.println("valid mobile number");
}
else
{
	System.out.println("invalid mobile number");
}
}
}
