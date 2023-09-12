package com.OOP;

public class BBB_Inharitance_Chile extends BBB_Inharitance_parant {
	String chieldMessage = "I am a chield. ";
	
	
	public static void main(String[] args) {
		BBB_Inharitance_Chile c = new BBB_Inharitance_Chile();
		c.grandParant(12, 12, 12);
		c.chields(12, 10);
		c.parants(25, 5);
		c.setPrivateValues(18);
		System.out.println(c.getPrivateValues());
		System.out.println("Include grandparant value : "+ (10+c.prtVal));
		
		System.out.println("Include grandparant value : "+ (10+c.getPrivateValues()));
		
		

		
	}
	public void chields(int a, int b) {
		int result = a*b;
		System.out.println(chieldMessage);
		System.out.println(a + "*" + b + " = " + result);
	}
}
