package com.multithreading.examples;

public class ConsoleExample {
	public static void main(String args[]) {
		try {
			System.out.println("Enter your name: ");
			String n = System.console().readLine();
			System.out.println("Welcome " + n);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
