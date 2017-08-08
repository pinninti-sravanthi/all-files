package com.Interface.example;

class Test {
	int x, y;
}

class Test2 implements Cloneable {
	int test2obj1, test2obj2; // Contains a reference of Test and implements clone with deep copy.

	Test testobj1 = new Test();

	public Object clone() throws CloneNotSupportedException {
		Test2 t = (Test2) super.clone(); // Assign the shallow copy to new refernce variable t
		t.testobj1 = new Test();// Create a new object for the field testobj1 and assign it to shallow copy obtained, to make it a deep copy
		return t;
	}
}

public class Cloneableexample {
	public static void main(String args[]) throws CloneNotSupportedException {
		Test2 t1 = new Test2();
		t1.test2obj1 = 10;
		t1.test2obj2 = 20;
		t1.testobj1.x = 30;
		t1.testobj1.y = 40;
		System.out.println(t1);
		

		Test2 t3 = (Test2) t1.clone();
		t3.test2obj1 = 100;

		// Change in primitive type of t2 will not
		// be reflected in t1 field
		t3.testobj1.x = 300;
	
		t3.testobj1.y=35;

		// Change in object type field of t2 will not
		// be reflected in t1(deep copy)
		System.out.println(t1.test2obj1 + " " + t1.test2obj2 + " " + t1.testobj1.x + " " + t1.testobj1.y);
		System.out.println(t3.test2obj1 + " " + t3.test2obj2 + " " + t3.testobj1.x + " " + t3.testobj1.y);
	}
}
