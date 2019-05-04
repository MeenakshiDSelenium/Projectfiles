package com.multitreading;

public class Athread extends Thread {
	public void run() {
		System.out.println("it's a run method");
	}


	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<a;i++) {
			i++;
			System.out.println(i);
			
		}

	}

}
