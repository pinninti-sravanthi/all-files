package com.multithreading.examples;

public class RunInMain extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		RunInMain threadobj1 = new RunInMain();
		RunInMain threadobj2 = new RunInMain();
		threadobj1.run();// calling run method directly from main
		threadobj2.run();

	}
}
