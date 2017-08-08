package com.collections.examples;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) throws Exception {
		TreeSet treesetobj = new TreeSet();
		//treesetobj.add("k");
		//treesetobj.add("h");
		//treesetobj.add("h");// false
		// treesetobj.add(new StringBuffer("g"));//java.lang.StringBuffer cannot be cast
		// to java.lang.Comparable
		// treesetobj.add(345);//java.lang.ClassCastException
		 treesetobj.add(null);//java.lang.NullPointerException
		//System.out.println(treesetobj);// h.k sorted form

	}
}
