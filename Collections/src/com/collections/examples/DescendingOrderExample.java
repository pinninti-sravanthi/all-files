package com.collections.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class DescendingOrderExample {
	public static void main(String[] args) {
		TreeSet treeset = new TreeSet(new Mycomparable());
		treeset.add(50);
		treeset.add(60);
		treeset.add(20);
		treeset.add(10);
		treeset.add(5);
		treeset.add(110);
		System.out.println(treeset);
	}
}

class Mycomparable implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Integer intobj1 = (Integer) arg0;
		Integer intobj2 = (Integer) arg1;
		if (intobj1 > intobj2) {
			return -1;
		} else if (intobj1 < intobj2) {
			return +1;
		} else {
			return 0;
		}

	}

}