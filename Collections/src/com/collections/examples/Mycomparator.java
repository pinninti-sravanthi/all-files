package com.collections.examples;

import java.util.Comparator;

public class Mycomparator implements Comparator {

	@Override
	public int compare(Object object1, Object object2) {
		String str1 = (String) object1;
		String str2 = (String) object2;

		return str2.compareTo(str1);
	}

}
