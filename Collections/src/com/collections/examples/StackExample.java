package com.collections.examples;

import java.util.Enumeration;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack stackobj = new Stack();
		stackobj.push("hello");
		stackobj.push(123);
		stackobj.push(2.56);
		System.out.println(stackobj);
		System.out.println(stackobj.search(123));
		System.out.println(stackobj.peek());
		System.out.println(stackobj.pop());
		System.out.println(stackobj);
		System.out.println(stackobj.empty());
		
	}
}
