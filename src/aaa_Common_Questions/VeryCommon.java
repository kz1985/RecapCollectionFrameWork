package aaa_Common_Questions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class VeryCommon {

	public static void main(String[] args) {
//		gapRemoval();
//		stringRev();
//		numberRev();
//		sumOfInt();
//		commonItems();
//		combineTWOarrays();
//		compareOperation();
//		combineTWOarrays2();
//		int arr[]= {1,3,4,5,6,7};
//		System.out.println(missingNumber(arr));
		
		stringImmutable();
		
	}

	// What is the difference between == and equals()
	public static void compareOperation() {
		// What is the difference between == and equals
		// == is relational operators used to compare value
		// .equal is a method used to compare between two reference.

		// == Operations
		String a1 = "Khosruz";
		String a2 = "Khosruz";
		boolean a3 = (a1 == a2);
		System.out.println("Result of = = Operator : " + a3);

		// .equals() Operations
		String str1 = new String("Khosruz");
		String str2 = new String(str1);
		boolean str3 = (str1.equals(str2));
		System.out.println("Result of  .equals() Operator : " + str3);
	}
	// Gap Removal

	public static void gapRemoval() {
		System.out.println("************ Gap Removal ************");
		String name = "Khsoruz_zaman";
		String[] remove = name.split("_");
		for (String ac : remove) {
			System.out.println(ac);
		}
	}

	// String Reverse
	public static void stringRev() {
		System.out.println("************ String Reverse ************");
		String name = "ovoneL";
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		System.err.println("Reversed String is : " + sb);

	}

	// Int Reverse
	public static void numberRev() {
		System.out.println("************ Number Reverse ************");
		int number = 6789;
		int reverse = 0;
		while (number != 0) {
			int remember = number % 10;
			reverse = reverse * 10 + remember;
			number = number / 10;
		}
		System.err.println("Reversed Number is : " + reverse);
	}

	// Sum of Array
	public static void sumOfInt() {
		int[] numArrey = { 1, 2, 3, 4, 5, 6, 7 };
		int finalSum = 0;
		for (int i = 0; i < numArrey.length; i++) {
			finalSum = finalSum + numArrey[i];
		}
		System.out.println("Sum Of Integer is : " + finalSum);
	}

	// Find common Items from the list
	public static void commonItems() {
		System.out.println("******** Common Item ***********");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Multiple numbers.");
		int n = sc.nextInt();
		TreeSet list = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			list.add(n);
		}
		System.out.println("Found Common Item from the list is : " + Math.abs(n - list.size()));
	}

	// Mearge two Array
	public static void combineTWOarrays() {
		System.out.println("******** Merge multiple arrays Method 1.***********");
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 0 };

		int a1 = a.length;
		int b1 = b.length;

		int c1 = a1 + b1;

		int c[] = new int[c1];

		for (int i = 0; i < a1; i = i + 1) {
			c[i] = a[i];
		}
		for (int i = 0; i < b1; i = i + 1) {
			c[a1 + i] = b[i];
		}
		for (int i = 0; i < c1; i = i + 1) {
			System.out.print("[" + c[i] + "]");
		}
		
	}
	// Mearge two Array
	public static void combineTWOarrays2() {
			System.out.println("******** Merge multiple arrays Method 1.***********");
			int a[] = { 1, 2, 3, 4, 5 };
			int b[] = { 6, 7, 8, 9, 0 };
			//Find the length
			int a1 = a.length;
			int b1 = b.length;
			//resultant array 
			int c1 = a1+b1;
			//Both length store in another resultant array 
			int c[] = new int[c1];
			
			// using predefined system arraycopy
			
			System.arraycopy(a, 0, c, 0, a1);
			System.arraycopy(b, 0, c, a1, b1);
			
			//Print final arrays
			System.out.println("Final combination is [ "+Arrays.toString(c)+" ]");
			
		}
	//Find the missing number from array
	public static int missingNumber(int arr[]) {
	// Algorithm is : (n)*(n+1)/2

		int sum = 0; //updated data
		int max = 0; //size of array
		for(int n:arr) {
			sum = sum+n; // updated data will store into the sum
			if(n>max) // if input arrey is more then Maximum Value
				max=n; // then we swap input arry into the maximum value
		}
		return ((max)*(max+1)/2)-sum;
	}
	//String is immutable
	public static void stringImmutable() {
		//Actual String
		String n = "Khosruz";
		n.concat("Zaman");
		System.out.println("Replace \"Zaman\" without creating object : "+n);
		n = new String("Zaman");
		System.out.println("Replace \"Zaman\" After creating a new object : "+n);
	}
}
