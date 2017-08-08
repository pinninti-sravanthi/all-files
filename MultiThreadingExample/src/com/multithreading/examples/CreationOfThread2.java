package com.multithreading.examples;

public class CreationOfThread2 implements Runnable {//creation of thread by Runnable interface
	public void run() {
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
		CreationOfThread2 obj = new CreationOfThread2();
		Thread obj1 = new Thread(obj);
		obj1.start();
	}
}
