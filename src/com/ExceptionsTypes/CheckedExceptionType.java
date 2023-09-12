package com.ExceptionsTypes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionType {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		runtimeException();
//		compileTimeExcep1();
//		compileTimeExcep2();

	}

	// checked or compiletime exception
	public static void compileTimeExcep1() {
		System.out.println("checked or compiletime exception 1");
		try {
			FileReader fr = new FileReader("me.text");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			System.out.println("Compile time exceptions!!");
		}
	}

	// checked or compiletime exception
	public static void compileTimeExcep2() throws IOException {
		System.out.println("checked or compiletime exception 2");
		FileReader fr = new FileReader("me.text");
	}

	

	public static void runtimeException() {
		System.out.println("\nUnchecked or Runtime exception");
		int arr[] = new int[2];
		arr[0] = 1;
		arr[1] = 8;
		//arr[2] = 3;
		for (int i : arr) {
			System.out.print(i);
		}
	}

}
