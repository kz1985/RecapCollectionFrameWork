package com.CommonTricks;

public class ReverseStr {

	public static String revStr(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	// Method 1
	public static void main(String[] args) {
		System.out.println("Method 1 : " + revStr("Hello World"));
		System.out.println("Method 2 : " + revStr("World Hello"));
		System.out.println();
		System.out.println("Method 3 : " + revStr2("My Name Is Khosruz."));
		System.out.println("Method 4 : " + revStr2("My Name Is Zaman."));
		System.out.println();
		strRev2();

	}

	public static String revStr2(String str2) {
		char ch[] = str2.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	public static void strRev2() {
		String name = "ZAMAN";
		StringBuffer sb = new StringBuffer(name);
		//sb.reverse();
		System.out.println(sb.reverse());

	}
}
