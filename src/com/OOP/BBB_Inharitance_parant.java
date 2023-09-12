package com.OOP;

public class BBB_Inharitance_parant extends BBB_Inharitance_Grand_Parant {
	String parantMessage = "I am Parant.";

	public void parants(int a, int b) {
		int result = a - b;
		System.out.println(parantMessage);
		System.out.println(a + "-" + b + " = " + result);
	}
	

}
