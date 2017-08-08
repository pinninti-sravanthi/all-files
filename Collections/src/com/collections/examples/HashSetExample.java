package com.collections.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashsetobj = new HashSet();
		hashsetobj.add("this");
		hashsetobj.add(2345);
		hashsetobj.add(2.456);
		hashsetobj.add("asdf123");
		hashsetobj.add("this");// is not printed
		hashsetobj.add(null);
		hashsetobj.add(null);
		System.out.println(hashsetobj);

		LinkedHashSet hashsetobj1 = new LinkedHashSet();
		hashsetobj1.add("this");
		hashsetobj1.add(2345);
		hashsetobj1.add(2.456);
		hashsetobj1.add("asdf123");
		hashsetobj1.add("this");// is not printed
		hashsetobj1.add(null);
		hashsetobj1.add(null);
		System.out.println(hashsetobj1);
	}
}
