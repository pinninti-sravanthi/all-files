package com.Interface.example;

public interface myinterface {
	void display1();

	void display2();

	void display3();

	void display4();
}
abstract class Person3 implements myinterface {
	public void display3() {
		System.out.println("I am in third display");
	}
}

class Person1 extends Person3 {
	public void display1() {
		System.out.println("I am in display1");
	}

	public void display2() {
		System.out.println("I am in display2");
	}

	public void display4() {
		System.out.println("I am display4");
	}
}

class Society {
	public static void main(String args[]) {
		myinterface obj = new Person1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}
}
