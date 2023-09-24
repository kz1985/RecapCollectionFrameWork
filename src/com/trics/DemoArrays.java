package com.trics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class DemoArrays {
	public static void main(String[] args) {
		//Static array
		System.out.print("Static: ");
		int s[]= {1,2,3,4,5,6};
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+", ");
		}

		//Dynamic array
		System.out.print("\nDynamic: ");
		int d[];
		 d = new int[5];
		 d[0]=4;
		 d[1]=9;
		 d[2]=11;
		 d[3]=8;
		 for(int i =0; i<d.length; i++) {
			 System.out.print(d[i]+", ");
		 }
		String lol = "tot_tom";
		String[] a = lol.split("_");
		for(String m:a) {
			System.out.print("\n"+m);
		}
	}
	


}
