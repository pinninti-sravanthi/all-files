package com.collections.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Contacts {

	public static void main(String[] args) {

		ArrayList<Persons> arraylist = new ArrayList<Persons>();
		arraylist.add(new Persons("sravanthi", 9010607960l, "sravanthi@full.co"));
		arraylist.add(new Persons("prashanthi", 9765434526l, "prashanthi@full.co"));
		arraylist.add(new Persons("laxmi", 9876543278l, "laxmi@full.co"));
		Collections.sort(arraylist, new Mycomparator2());
		for (Persons str : arraylist) {
			System.out.println(str.name + "" + str.phonenumber + "" + str.email);
		}
	}
}

class Persons {
	String name;
	long phonenumber;
	String email;

	public Persons(String name, long phonenumber, String email) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
	}

}
