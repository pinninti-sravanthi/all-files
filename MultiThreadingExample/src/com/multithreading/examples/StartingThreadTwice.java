package com.multithreading.examples;

public class StartingThreadTwice extends Thread {
	public void run() {
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
		StartingThreadTwice thread1 = new StartingThreadTwice();
		thread1.start();
		thread1.start();

	}
}
