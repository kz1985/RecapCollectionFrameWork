package com.OOP;

class Shapes {
	public void area() {
		System.out.println("Find the area!!");
	}

	public void area(int r) {
		System.out.println("Circle area = " + 3.14* r * r);// Math.PI / 3.14*redious*redious
	}

	public void area(double b, double h) {
		System.out.println("Triangle area = " + 0.5 * b * h);
	}

	public void area(int l, int b) {
		System.out.println("Ractangle area = " + l * b);
	}
}

public class CCC_Polymorphsms_2 {
	public static void main(String[] args) {
 
		Shapes shape = new Shapes();
		shape.area();
		shape.area(10);
		shape.area(12.3, 15.6);
		shape.area(58, 65);
		
	}

}
