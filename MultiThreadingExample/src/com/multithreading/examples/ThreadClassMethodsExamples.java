package com.multithreading.examples;

class ThreadExample implements Runnable {
	public void run() {
		System.out.println("Thread started:::" + Thread.currentThread().getName() + " " + "Thread Id is:"
				+ Thread.currentThread().getId() + " " + "Thread priority is " + Thread.currentThread().getPriority());// current
																														// thread
																														// name
																														// priority
																														// id

	}

}

public class ThreadClassMethodsExamples {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadExample(), "t1");
		Thread t2 = new Thread(new ThreadExample(), "t2");
		Thread t3 = new Thread(new ThreadExample(), "t3");
		System.out.println(t1.getName());// default thread name

		t1.start();

		t1.setName(" Name: FirstThread");// set name for thread
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t2.setName(" Name: Second Thread");
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.start();
		t3.setName(" Name: Third Thread");
		t3.setPriority(Thread.MAX_PRIORITY);

	}
}
