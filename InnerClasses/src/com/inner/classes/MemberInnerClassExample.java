package com.inner.classes;

public class MemberInnerClassExample {
	private int data = 20;

	class Innerclass {
		void show() {
			System.out.println(data);// accessing private data from outer class
		}
	}

	public static void main(String[] args) {
		MemberInnerClassExample outerobj = new MemberInnerClassExample();
		MemberInnerClassExample.Innerclass innerobj = outerobj.new Innerclass();
		innerobj.show();
	}
}
