package com.OOP;

public class BBB_Inharitance_Grand_Parant {
	String GrandParantMessage = "I am Grand Parants. ";
	private static int privateValues = 15;
	protected int prtVal =11;
	
	public static int getPrivateValues() {
		return privateValues;
	}

	public static void setPrivateValues(int privateValues) {
		BBB_Inharitance_Grand_Parant.privateValues = privateValues;
	}

	public void grandParant(int a, int b, int c) {
		int result = a+b+c;
		System.out.println(GrandParantMessage);
		System.out.println(a +"+"+b+"+"+c+" = "+result);
	}

	private void grandParant2(int n, int m) {
		int result = n/m;
	 
		System.out.println(n + "/" + m + " = " + result);
	}
	
}
