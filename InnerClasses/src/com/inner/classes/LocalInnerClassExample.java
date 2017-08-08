package com.inner.classes;

public class LocalInnerClassExample {
	private String str = "sravanthi";

	void display() {
		int data = 20;// since java 1.8
		class InnerClass// local inner class
		{
			void show() {
				System.out.println(data);//local variable accessing since java 1.8
				System.out.println(str);
			}
		}
		InnerClass innobj = new InnerClass();// instantiating inside the method only
		innobj.show();
	}

	public static void main(String[] args) {
		LocalInnerClassExample outobj = new LocalInnerClassExample();
		outobj.display();
	}
}
