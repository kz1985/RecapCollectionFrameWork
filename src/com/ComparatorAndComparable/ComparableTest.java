package com.ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
  1) Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of 
  			a single element such as id, name, and price
  2) Comparable affects the original class, i.e., the actual class is modified.
  3) Comparable provides compareTo() method to sort elements.
  4) Comparable is present in java.lang package.
  5) We can sort the list elements of Comparable type by Collections.sort(List) method.
 * 

	
 * */

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {

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

	
	//Compare basis of age or id
	@Override
	public int compareTo(Student s) {
	 return (this.age - s.age);
	}

	public String toString() {
		return "[ ID = " + id + " Name = " + name + " Age = " + age + " ]";
	}
}

public class ComparableTest {
	public static void main(String[] args) {
		List<Student> alist = Arrays.asList(new Student(1, "Miraz", 3), new Student(2, "Rihan", 11),
				new Student(3, "Anika", 7), new Student(4, "Arman", 5), new Student(5, "Tuhi", 13),
				new Student(6, "Tahmina", 9), new Student(7, "Ohi", 15), new Student(8, "Sayed", 22),
				new Student(9, "Sama", 26));

		//alist.stream().map(m->m.getName().toString().formatted(args)).forEach(n->System.out.println(n));
		// Print Array Elements without sorting
		System.out.println("Print Element before Sorting..\n");
		for (Student lists : alist) {

			// System.out.println(lists.getName());
			System.out.println(lists);
		}

		// Sorting List Element
		Collections.sort(alist);

		// Print Array Elements without sorting
		System.out.println("Print Element After Sorting..\n");
		for (Student lists : alist) {
			System.out.println(lists);
		}

	}

}
