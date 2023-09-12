package com.WithJavaScript;

public class GapRemoval {
	public static void main(String[] args) {
		String s = "  Welcome to Java  ";
		String arr[]= s.split(" ");
	
//		System.out.println(arr[1]);
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
		
//		for (String sr : arr) {
//			System.err.println(sr.);
//		}
		
		System.out.println("Befor trim"+s.length());
		System.out.println("After Trim:"+s.trim());
		System.out.println("after trim"+s.length());
	}

}
