package com.collections.examples;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
	public static void main(String[] args) {
		NavigableSet<Integer> navigablesetobject = new TreeSet<>();
		navigablesetobject.add(0);
		navigablesetobject.add(1);
		navigablesetobject.add(2);
		navigablesetobject.add(3);
		navigablesetobject.add(4);
		navigablesetobject.add(5);
		navigablesetobject.add(6);

		// Get a reverse view of the navigable set
		NavigableSet<Integer> reverseNs = navigablesetobject.descendingSet();

		// Print the normal and reverse views
		System.out.println("Normal order: " + navigablesetobject);
		System.out.println("Reverse order: " + reverseNs);

		NavigableSet<Integer> threeOrMore = navigablesetobject.tailSet(3, true);
		System.out.println("3 or more: " + threeOrMore);
		System.out.println("lower(3): " + navigablesetobject.lower(3));// Returns the greatest element in this set which
																		// is less than the given element or NULL if
																		// there is no such element.
		System.out.println("floor(3): " + navigablesetobject.floor(3));// Returns the greatest element in this set which
																		// is less than or equal to given element or
																		// NULL if there is no such element.
		System.out.println("higher(3): " + navigablesetobject.higher(3));// Returns the least element in this set which
																			// is greater than the given element or NULL
																			// if there is no such element.
		System.out.println("ceiling(3): " + navigablesetobject.ceiling(3));// Returns the least element in this set
																			// which is greater than or equal to given
																			// element or NULL if there is no such
																			// element.

		System.out.println("pollFirst(): " + navigablesetobject.pollFirst());// Retrieve and remove the first least
																				// element. Or return null if there is
																				// no such element.
		System.out.println("Navigable Set: " + navigablesetobject);

		System.out.println("pollLast(): " + navigablesetobject.pollLast());// Retrieve and remove the last highest
																			// element. Or return null if there is no
																			// such element.
		System.out.println("Navigable Set: " + navigablesetobject);

		System.out.println("pollFirst(): " + navigablesetobject.pollFirst());
		System.out.println("Navigable Set: " + navigablesetobject);

		System.out.println("pollFirst(): " + navigablesetobject.pollFirst());
		System.out.println("Navigable Set: " + navigablesetobject);

		System.out.println("pollFirst(): " + navigablesetobject.pollFirst());
		System.out.println("Navigable Set: " + navigablesetobject);

		System.out.println("pollFirst(): " + navigablesetobject.pollFirst());
		System.out.println("pollLast(): " + navigablesetobject.pollLast());
	}
}
