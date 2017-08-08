package com.Interface.example;

public interface College {
	 void show1();
}
class Engineering {
	public static void main(String[] args) {
		College reff;
		reff = new Student();
		reff.show1();
		reff = new Faculty();
		reff.show1();
	}
}

class Student implements College {
	public void show1() {
		System.out.println("student is in college");
	}

}

class Faculty implements College {
	public void show1() {
		System.out.println("faculty is in college");
	}
}

