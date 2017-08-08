package com.collections.examples;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		SortedSet sortsetobj = new TreeSet();
		sortsetobj.add("z");
		sortsetobj.add("d");
		sortsetobj.add("k");
		System.out.println(sortsetobj.first());
		System.out.println(sortsetobj.last());
		System.out.println(sortsetobj.headSet("k"));
		System.out.println(sortsetobj.tailSet("k"));
		System.out.println(sortsetobj.subSet("d", "z"));
		System.out.println(sortsetobj.comparator());
	}
}
