package com.CommonTricks;

public class ReversInt {
	public static void main(String[] args) {
		int number =123;
		int reverse = 0;
		while(number!=0){
		int reminder = number%10;
		reverse = reverse*10+reminder;
		number = number/10;
		}
		System.out.println(reverse);

	}

}
