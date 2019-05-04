package com.multitreading;

public class Cthread extends Bthread{

	public static void main(String[] args) {
		Athread a=new Athread();
		Bthread b=new Bthread();
		a.start();
		b.start();

	}

}
