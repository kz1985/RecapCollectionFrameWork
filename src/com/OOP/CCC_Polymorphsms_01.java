package com.OOP;

class MySelf{
	public void communications() {
		System.out.println("The communication approach are: ");
	}
	

	public void calculations(int a, int b) {
		int result = a+b;
		System.out.println("MySelf : "+result);
		
	}
}
class Friends extends MySelf{
	@Override
	public void communications() {
		System.out.println("With my friends,");
		System.out.println("I preffer to Text Message!!");
	}

	@Override
	public void calculations(int a, int b) {
		 
		int result = a*b;
		System.out.println("Friends : "+ (result-25));
	}
	
}
class Family extends Friends{
	@Override
	public void communications() {
		System.out.println("With my Family, ");
		System.out.println("I preffer phone call!!");
	
	}
}
public class CCC_Polymorphsms_01 {
	public static void main(String[] args) {
		MySelf ms = new MySelf();
		MySelf ms2 = new Friends();
		MySelf ms3 = new Family();
		
		ms.communications();
		ms2.communications();
		ms3.communications();
		ms.calculations(15, 12);
		ms2.calculations(14, 10);
	}

}
