package com.trics;

public class MultipleMethods {
	public static void main(String[] args) {
		someMethod(null);

	}

	public static void someMethod(Object o) {
		System.out.println("Object method invocked");
	}
	
	public static void someMethod(String s) {
		System.out.println("String method invoked");
	}
	public static void someMethod(int n) {
		System.out.println("Int method invocked");
	}
	
}
