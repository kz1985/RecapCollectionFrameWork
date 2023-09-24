package com.WithJavaScript;

import java.util.Arrays;
import java.util.List;

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
		
		String m = "monopo_ly";
		String[] ams = m.split("_");
		for(String tt:ams) {
			System.out.print(tt);
		}
		String ton = "RAW";
		StringBuffer sb = new StringBuffer(ton);
		sb.reverse();
		System.out.println("\n"+sb);
		
		int no=123;
		int rev=0;
		while(no!=0) {
			int rem = no%10;
			rev = rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		
	}

}
