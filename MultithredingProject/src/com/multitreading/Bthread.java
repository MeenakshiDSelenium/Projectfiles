package com.multitreading;

public class Bthread extends Athread {

	public static void main(String[] args) {
		int b=2;
		for(int j=0;j<b;j++) {
			j++;
			System.out.println(j);
		}
		

	}

}
