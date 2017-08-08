package com.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		generics(list);
		// list.add(10);
		list.add(null);
		list.add("A");
		System.out.println(list);
		list.add(3, "B");
		list.add("K");
		System.out.println(list);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("sravanthi");
		generics2(list2);
		//list2.add(28);
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
		list2.removeAll(list2);
		System.out.println(list2);
		list2.retainAll(list2);
		System.out.println(list2);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void generics2(ArrayList<String> list2) {
		// TODO Auto-generated method stub
		list2.add(new Integer(28), null);
		
	}

	private static void generics(ArrayList<?> list) {
		list.add(new Integer(10), null);
		

	}

}
