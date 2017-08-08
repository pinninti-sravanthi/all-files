package com.collections.examples;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorexample {
	public static void main(String[] args) {
		Vector vectorobj = new Vector();
		System.out.println(vectorobj.capacity());// 10

		for (int i = 1; i <= 10; i++) {
			vectorobj.add(i);

		}
		Enumeration enumobj = vectorobj.elements();// enumeration cursor
		while (enumobj.hasMoreElements()) {
			Integer obj = (Integer) enumobj.nextElement();
			System.out.println(obj);
		}
		/*Iterator iterobj = vectorobj.iterator();
		while (iterobj.hasNext()) {
			Integer obj = (Integer) iterobj.next();
			if (obj % 2 == 0) {
				System.out.println(obj);
			} else {
				iterobj.remove();
			}
		}*/
		ListIterator listiteratorobj = vectorobj.listIterator();
		while (listiteratorobj.hasNext()) {
			Integer obj=(Integer) listiteratorobj.next();
			if (obj.equals(5)) {
				listiteratorobj.add("54");
				System.out.println(listiteratorobj);
			}
		}
		System.out.println(vectorobj.capacity());// 10
		vectorobj.add("sdfghj");
		System.out.println(vectorobj.capacity());// 20
		System.out.println(vectorobj);
	}
}
