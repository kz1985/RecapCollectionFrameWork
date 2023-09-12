package com.TypeParsing;

public class DataTypeParsing {
	
	public static void main(String[] args) {
		int i = 10;
		String name = "10";
		
		// int Parsre
		System.out.println("Int value befor parsing "+(i+1));
		String s2 = String.valueOf(i);
		System.out.println("Int value After parsing with String:  "+(i+s2));
		System.out.println();
		
		//String Parsre
		
		System.out.println("Befoe parsing Str and Int : "+(i+name));
		int prsInt = Integer.parseInt(name);
		System.out.println("After parsing Str and Int : "+(i+prsInt));
		
		System.out.println();
		//Double parse
		double d1 = 12.25;
		System.out.println("Befor parsing Str and Double :"+(d1+name));
		double d2 = Double.parseDouble(name);
		System.out.println("After parsing Str and Double :"+(d1+d2));
		
		System.out.println();
		int a = 10;
		String n = "50";
		System.out.println("String and int : "+(a+n));
		int a2 =Integer.parseInt(n);
		System.out.println("String and int : "+(a+a2));
		
		
		System.out.println();
		int a3 = 15;
		String n2 = "15";
		System.out.println("a3 and n3 : "+(a3+n2));
		int a4 = Integer.parseInt(n2);
		System.out.println("a3 and a4 : "+(a3+a4));
		
		System.out.println();
		double d3 = Double.parseDouble(name);
		System.out.println("String to Double : "+d3);
		
		System.out.println();
		float f = Float.parseFloat(name);
		System.out.println("String to Float : "+f);
		
		System.out.println();
		short s = Short.parseShort(name);
		System.out.println("String to Short :"+s);
		
		System.out.println();
		long l = Long.parseLong(name);
		System.out.println("String to Long : "+l);
		
		System.out.println();
		boolean b = Boolean.parseBoolean(name);
		System.out.println("String to Boolean : "+(b));
		
	}

}
