package com.JavaUtilityTrics;

import java.util.Random;

public class JavaUtilPackgFunctions {
	
	public static void main(String[] args) {
		randomNum();
		mathUtilities();
	}
	
	
	
	
	public static void randomNum() {
		Random ran = new Random();
		int randomNumber = ran.nextInt(6)+1; // 1 will start
		int randomNUmber2 = ((int)(Math.random()*6)+1);
		System.out.println("Random demo 1: "+randomNumber);
		System.out.println("Random demo 2: "+randomNUmber2);
	}
	public static void mathUtilities() {
		int a = 4;
		int b = 8;
		int c = 12;
		int d = 8;
		int m = 14;
		double t = 2;
		double q = 4;
		
		//Max Value
		int maximumValue = Math.max(a, b);
		System.out.println("Maximum between "+a+" and "+b+",  is : "+maximumValue);
		
		//Min Value
		int minimumValue = Math.min(a, d);
		System.out.println("Minimum between "+a+" and "+d+",  is : "+minimumValue);
		
		
		//conflict Value
		int conflictValue =Math.min(b, b);
		System.out.println("Maximu between "+b+" and "+b+",  is : "+conflictValue);
		
		//absulute Value
		int absuluteValue =Math.abs(m);
		System.out.println("Absulute Value of "+m +",  is : "+absuluteValue);
		
		//pwer of Value
		double powerofValue =Math.pow(t, q);
		System.out.println("Power of Value between "+t +" and "+q+",  is : "+powerofValue);
		
		//pwer of next UP 
		double powerofnextUp = Math.nextUp(powerofValue);
		System.out.println("Power of next UP from "+powerofValue +",  is : "+powerofnextUp);
		
		//pwer of next DOWN 
		double powerofnextDown = Math.nextDown(powerofValue);
		System.out.println("Power of next DOWN from "+powerofValue +",  is : "+powerofnextDown);
		
		//Multiply Value
		int multiply =Math.multiplyExact(a, b);
		System.out.println("Multiplay between "+a+" and "+d+",  is : "+multiply);
		
		
	}

}
