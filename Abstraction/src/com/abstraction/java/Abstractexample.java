package com.abstraction.java;

public class Abstractexample extends Person {
	private int empid;

	Abstractexample(String name, String gender, int empid) {
		super(name, gender);
		this.empid = empid;
	}

	public void work() {
		if (empid == 0) {
			System.out.println("not working");
		} else {
			System.out.println("working");
		}
	}

	public static void main(String[] args) {
		Person obj1 = new Abstractexample("sri", "female", 0);
		Person obj2 = new Abstractexample("santhosh", "male", 123);
		obj1.work();
		obj2.work();
		System.out.println(obj1);
	obj1.changeName("xyz");	
	}
}

 abstract class Person {
	private String name;
	private String gender;

	Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	 abstract void work();

	 void changeName(String newName) {
		this.name = newName;
		System.out.println(this.name);
	}

}