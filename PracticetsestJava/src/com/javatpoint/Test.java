package com.javatpoint;

public class Test {

	public static void main(String[] args) {
		int i=5;
		i=i++ + ++i - i-- - --i;
		System.out.println(i);

	}

}
