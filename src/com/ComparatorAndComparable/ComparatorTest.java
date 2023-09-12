package com.ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*    
    1) The Comparator provides multiple sorting sequences. In other words, we can sort the collection 
    on the basis of multiple elements such as id, name, and price etc.
	2) Comparator doesn't affect the original class, i.e., the actual class is not modified.
	3) Comparator provides compare() method to sort elements.
	4) A Comparator is present in the java.util package.
	5) We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
	
*/

class Students3{
	private int id;
	private String name;
	private int age;
	
	public Students3(int id, String name, int age) {
		
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
	
//Coompare based on id
	public static Comparator<Students3> sortById = new Comparator<Students3>() {
		
		@Override
		public int compare(Students3 s1, Students3 s2) {
			// TODO Auto-generated method stub
			return (int) (s1.getId() - (s2.getId()));
		}
	};
	//Coompare based on name
	public static Comparator<Students3> sortByName = new Comparator<Students3>() {
		
		@Override
		public int compare(Students3 s1, Students3 s2) {
			// TODO Auto-generated method stub
			return s1.getName().compareTo(s2.getName());
		}
	};
	
	public String toString() {
		return"[ ID = "+id+" Name = "+name+" Age = "+age+" ]";
	}
}

public class ComparatorTest {
	public static void main(String[] args) {
		List<Students3> alist = Arrays.asList(new Students3(1, "Miraz", 3), new Students3(2, "Rihan", 11),
				new Students3(3, "Anika", 7), new Students3(4, "Arman", 5), new Students3(5, "Tuhi", 13),
				new Students3(6, "Tahmina", 9), new Students3(7, "Ohi", 15), new Students3(8, "Sayed", 22),
				new Students3(9, "Sama", 26));

		// Print Array Elements without sorting
		System.out.println("Print Element before Sorting..\n");
		for (Students3 lists : alist) {
			System.out.println(lists);
		}
		
		//Sort List of elements by ID
		Collections.sort(alist, Students3.sortById);
		
		// Print Array Elements without sorting
		System.out.println("Print Element After Sorting by ID..\n");
		for (Students3 lists : alist) {
			System.out.println(lists);
		}
		//Sort List of elements by name
		Collections.sort(alist, Students3.sortByName);
				
		// Print Array Elements without sorting
		System.out.println("Print Element After Sorting by Name..\n");
			for (Students3 lists : alist) {
				System.out.println(lists);
			}		
		
	}

}
