package com.trics;

public class ReturnTypesDemo {
	//no param
	public int addDemo() {
		int a = 12;
		int b = 15;
		int c = a + b;
		return c;
	}
	
	//with param
	public static int demo2 (int a, int b) {
		int c = a+b;
		return c;
	}
	

	public static void main(String[] args) {
		ReturnTypesDemo rd = new ReturnTypesDemo();
			System.out.println(rd.addDemo());
			
			int currentValue = demo2(12, 12);
			System.out.println(currentValue);
			
	}

}
