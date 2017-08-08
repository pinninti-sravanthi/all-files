package com.collections.examples;

import java.util.TreeSet;

public class SortingInReverseAlphabaticalOrder {
	public static void main(String[] args) {
		TreeSet treeobj = new TreeSet(new Mycomparator());
		treeobj.add("srivalli");
		treeobj.add("naveena");
		treeobj.add("prashanthi");
		treeobj.add("sravanthi");
		System.out.println(treeobj);

	}
}
