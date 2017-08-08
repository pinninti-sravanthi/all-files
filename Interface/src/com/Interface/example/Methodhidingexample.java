package com.Interface.example;

public class Methodhidingexample {
	public static void main(String[] args) {
		Parentclass pobj = new Parentclass();
		pobj.show();
		Childclass cobj = new Childclass();
		cobj.show();

	}
}
class Childclass extends Parentclass{
	static void show() {
		System.out.println("hello i am in subclass");

	}
	
}

class Parentclass {
	static void show() {
		System.out.println("hello i am in parent class");
	}
}