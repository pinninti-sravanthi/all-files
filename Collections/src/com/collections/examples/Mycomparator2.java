package com.collections.examples;

import java.util.Comparator;

class Mycomparator2 implements Comparator<Persons> {
	public int compare(Persons object1, Persons object2) {
		return object1.name.compareTo(object2.name);
	}
}
