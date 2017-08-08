package com.multithreading.examples;

public class CreationOfThread1 extends Thread {// thread creation by extending Thread class
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		CreationOfThread1 obj = new CreationOfThread1();
		obj.start();
	}
}
