package com.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Students{
	private int id;
	private String name;
	private int age;
	
	public Students(int id, String name, int age) {
		
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return"[ ID = "+id+" Name = "+name+" Age = "+age+" ]";
	}
}

public class BasicSortingAndError {
	public static void main(String[] args) {
		
	//Create student list -Method 1	
		//ArrayList<Students> alist = new ArrayList<Students>();
		//alist.add(new Student(1, "Jorna", 1))
	
	//Create student list -Method 2	
		List<Students> alist = Arrays.asList(
				new Students(1, "Miraz", 3),
				new Students(2, "Rihan", 11),
				new Students(3, "Anika", 7),
				new Students(4, "Arman", 5),
				new Students(5, "Tuhi", 13),
				new Students(6, "Tahmina", 9),
				new Students(7, "Ohi", 15),
				new Students(8, "Sayed", 22),
				new Students(9, "Sama", 26));
		
		//Print Array Elements without sorting
		System.out.println("Print Element before Sorting..\n");
		for(Students lists:alist) {
	
			//System.out.println(lists.getName());
			System.out.println(lists);
		}
/*
	//Sorting List Element	
		Collections.sort(alist);
		
	//Print Array Elements without sorting
	   System.out.println("Print Element After Sorting..\n");
		for(Students lists:alist) {
			System.out.println(lists);
		}
*/
		
	}

}
