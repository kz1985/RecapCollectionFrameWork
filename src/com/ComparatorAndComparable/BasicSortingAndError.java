package com.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		
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
	public int compareTo(Employee e1) {
		return this.age - e1.age;
	}
	public static Comparator<Employee> names = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};
	public String toString() {
		return"[ ID = "+id+" Name = "+name+" Age = "+age+" ]";
	}
	

};

public class BasicSortingAndError {
	public static void main(String[] args) {
		
	//Create student list -Method 1	
		//ArrayList<Students> alist = new ArrayList<Students>();
		//alist.add(new Student(1, "Jorna", 1))
	
	//Create student list -Method 2	
		List<Employee> alist = Arrays.asList(
				new Employee(1, "Miraz", 3),
				new Employee(2, "Rihan", 11),
				new Employee(3, "Anika", 7),
				new Employee(4, "Arman", 5),
				new Employee(5, "Tuhi", 13),
				new Employee(6, "Tahmina", 9),
				new Employee(7, "Ohi", 15),
				new Employee(8, "Sayed", 22),
				new Employee(9, "Sama", 26));
		
		//Print Array Elements without sorting
		System.out.println("Print Element before Sorting..\n");
		for(Employee lists:alist) {
	
			//System.out.println(lists.getName());
			System.out.println(lists);
		}

	//Sorting List Element	
	Collections.sort(alist);
	//Sorting list with comparator
	Collections.sort(alist, Employee.names);
		
	//Print Array Elements without sorting
	   System.out.println("Print Element After Sorting..\n");
		for(Employee lists:alist) {
			System.out.println(lists);
		}

		
	}

}
