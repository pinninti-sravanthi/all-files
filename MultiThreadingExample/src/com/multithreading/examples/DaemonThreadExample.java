package com.multithreading.examples;

public class DaemonThreadExample {
	public static void main(String args[]) {

		Thread daemonThread1 = new Thread(new Runnable() {

			public void run() {
				try {
					while (true) {
						System.out.println("Daemon thread is running");
					}

				} catch (Exception e) {

				} finally {
					System.out.println("Daemon Thread exiting"); // never called
				}
			}
		}, "Daemon-Thread");

		daemonThread1.setDaemon(true); // making this thread daemon
		daemonThread1.start();

	}
}
