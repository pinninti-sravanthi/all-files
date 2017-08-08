package com.multithreading.examples;

public class SleepMethodExample extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);// sleep method1
				Thread.sleep(500, 50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepMethodExample thread1 = new SleepMethodExample();
		SleepMethodExample thread2 = new SleepMethodExample();
		thread1.start();
		thread2.start();
	}
}
