package com.trics;

import java.util.Scanner;

public class JavaScannerCalsses {
	public static Scanner sc;

	public static void main(String[] args) {
		scannerChecks();
		scannerInputChecks();

	}

	public static void scannerChecks() {
		String welcomes = "Welcome to the Zsolution!";
		sc = new Scanner(welcomes);
		System.out.println("Message is available: " + sc.hasNext());
		System.out.println("Original message : " + sc.nextLine() + "\n");
		sc.close();
	}

	public static void scannerInputChecks() {
		String name = null;
		String Position = null;
		double salary = 0.0;
		double yearlySalary = 0.0;
		int i = 1;
		do {
			System.out.println("Person : " + i);
			System.out.println("\n--------- Please Enter your Details ---------");
			sc = new Scanner(System.in);
			System.out.print("Enter your name: ");
			name = sc.nextLine();
			System.out.print("Enter your Position: ");
			Position = sc.nextLine();
			System.out.print("Enter your Monthly Salary: ");
			salary = sc.nextDouble();
			yearlySalary = salary * 12;
			// msc.close();
			System.out.println();
			System.err.println("\n------According to avobe details-------" + "\nName: " + name + "\nDesignation : "
					+ Position + "\nSalary : " + salary + "\nYearly Salary : " + yearlySalary);
			i++;
		} while (i < 2);

	}

}
