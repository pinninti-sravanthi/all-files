package com.string.examples;

public class StringBuilderExample {
public static void main(String[] args) {
	StringBuilder strbuilder=new StringBuilder("I am in ");
	System.out.println(strbuilder.append("string"));
	System.out.println(strbuilder.insert(0, "String builder:"));
}
}
