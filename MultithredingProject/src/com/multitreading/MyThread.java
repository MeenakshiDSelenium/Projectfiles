package com.multitreading;

public class MyThread extends Thread {
	public void run() {
		System.out.println("run metthod is executed by jvm");
	}

	public static void main(String[] args) {
		MyThread td=new MyThread();
	      // Thread t=new Thread();
		 
		 td.start();
		 
	}

}
