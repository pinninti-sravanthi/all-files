package com.inner.classes;

public class StaticInnerclassWithInstance {
	static private String str = "hello";

	static class Inner {
		void msg() {
			
			System.out.println(str);
		}
		static void show()
		{
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		StaticInnerclassWithInstance.Inner obj = new StaticInnerclassWithInstance.Inner();//non static method
		obj.msg();
		StaticInnerclassWithInstance.Inner.show();//static method
	}
}
