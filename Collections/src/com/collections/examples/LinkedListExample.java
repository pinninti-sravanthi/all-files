package com.collections.examples;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(23);
		list.add("sravanthi");
		list.addFirst("hello");

		list.addLast("welcome");
		list.set(1, "sravanthi");
		System.out.println(list);
		// list.removeFirst();
		list.removeFirstOccurrence("sravanthi");
		list.add(2, "12345678");
		// list.remove("sravanthi");
		System.out.println(list);

	}
}
