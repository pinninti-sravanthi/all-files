package com.inner.classes;

abstract class Outer {
	abstract void run();
}

public class AnonymousInnerClassExample {
	public static void main(String[] args) {
		Outer outobj = new Outer() {// Anonymous inner class
			void run()// overriding abstract class method
			{
				System.out.println("it is working");
			}
		};
		outobj.run();
	}
}
