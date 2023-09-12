package com.trics;

import java.util.Iterator;
import java.util.Scanner;

public class SingleAndMultiDimArray {
	public static void main(String[] args) {

/*		
		//Single Dimention 
		 System.out.println("Single Dimention : ");
		 int [] anArray;
		 
		 //Allocate memory for 3 int
		 anArray = new int[3];
		 
		 anArray[0]=9;
		 anArray[1]= 12;
		 anArray[2]=11;
		 
		 for(int i =0; i<anArray.length; i++) {
			 System.err.println("Element of Index "+i+" : "+anArray[i]);
		 }
		//Single Dimentional with user input
		
		 System.out.println("Single Dimentional with user input");
		 Scanner sc = new Scanner(System.in);
		 System.err.println("Enter the Length of array: ");
		 int arrayLength = sc.nextInt();
		 int inArray[]= new int[arrayLength];
		 System.out.println("Enter the element of array: ");
		 for(int l=0; l<arrayLength; l++) {
			 anArray[l]=sc.nextInt();
		 }
		 System.out.println("You desire list of arrays are: ");
		 for (int k=0; k<arrayLength; k++) {
			 
			 System.out.print(anArray[k]+", ");
		 }
		 
		 //Multidimensional array
			System.out.println("Multi Dimention : ");

			
			
			
			int[][] mary1 = new int[2][2];
			 mary1[0][0] = 1;
			mary1[0][1] = 2;
			mary1[1][0] = 3;
			mary1[1][1] = 4;

			System.out.println("With Loop: ");
			for (int a = 0; a < mary1.length; a++) {
				for (int x = 0; x < mary1.length; x++) {
					int f = mary1[a][x];
					System.out.print(f + " \n");
				}
			}
			System.out.println("\nWithout Loop: ");
			System.out.println(mary1[0][0] + " " + mary1[0][1]);
			System.out.println(mary1[1][0] + " " + mary1[1][1]);
		 */
			//MultiDimentional array
		 System.out.println("Single Dimentional with user input");
		 Scanner sc = new Scanner(System.in);
		 System.err.println("Enter the column Length of array: ");
		 int colLength = sc.nextInt();
		 System.err.println("Enter the row Length of array: ");
		 int rowLength = sc.nextInt();
		 

		 
			int[][] intArry= new int[colLength][rowLength];
			System.out.println("Arrays elements are: ");
			for(int b=0; b<colLength; b++) { //Row
				for(int c=0; c<rowLength; c++) { //Col
					intArry[b][c]=b+1; //Assigning value in each array
					System.out.print(intArry[b][c]+" "); // Print array
				}
				System.out.println();
			}
			System.out.println("Valu of this array : "+intArry[8-1][5-1]);
			
					
			
			
			
			
		 
		}



}
