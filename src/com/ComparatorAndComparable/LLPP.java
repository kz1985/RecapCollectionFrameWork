package com.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students5 implements Comparable<Students5>{
	private int id;
	private String name;
	private int age;

	public Students5(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
		return "[ ID = " + id + " Name = " + name + " Age = " + age + " ]";
	}


	@Override
	public int compareTo(Students5 o) {
		// TODO Auto-generated method stub
		return (this.age - o.age);
	}

}
public class LLPP {
	
	public static void main(String[] args) {
		List<Students5> alist = new ArrayList<Students5>();
		alist.add(new Students5(2, "Arman", 5));	
		alist.add(new Students5(7, "Ohi", 15));	
		alist.add(new Students5(8, "Sayed", 22));
		alist.add(new Students5(3, "Anika", 7));	
		alist.add(new Students5(10, "Salama", 78));	
		alist.add(new Students5(1, "Miraz", 3));
		alist.add(new Students5(4, "Tahmina", 9));
		alist.add(new Students5(6, "Rihan", 11));
		alist.add(new Students5(5, "Tuhi", 12));	
		alist.add(new Students5(9, "Sama", 26));

		
		//Before Sorting
		System.out.println("Befor Srted Student List: \n");
		for(Students5 s1:alist) {
			System.err.println(s1);
		}
		//Sorting Apply
		Collections.sort(alist);
		
		//After Sorting
		System.out.println("\nAfter Srted Student List: \n");
		for(Students5 s1:alist) {
			System.out.println(s1);
		}
	}
}
