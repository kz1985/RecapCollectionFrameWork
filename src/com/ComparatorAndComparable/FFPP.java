package com.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students9 {
	private int id;
	private String name;
	private int age;

	public Students9(int id, String name, int age) {
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

	public static Comparator<Students9> nameComparator = new Comparator<Students9>() {
		public int compare(Students9 s1, Students9 s2) {
			return s1.getName().compareTo(s2.getName());
		}

	};
	public static Comparator<Students9> ageComparator = new Comparator<Students9>() {

		@Override
		public int compare(Students9 st1, Students9 st2) {
			// TODO Auto-generated method stub
			return st1.getAge() - st2.getAge();
		}
	};

	public String toString() {
		return "[ ID = " + id + " Name = " + name + " Age = " + age + " ]";
	}

}

public class FFPP {
	public static void main(String[] args) {
		List<Students9> alist = new ArrayList<Students9>();
		alist.add(new Students9(2, "Arman", 5));
		alist.add(new Students9(7, "Ohi", 15));
		alist.add(new Students9(8, "Sayed", 22));
		alist.add(new Students9(3, "Anika", 7));
		alist.add(new Students9(10, "Salama", 78));
		alist.add(new Students9(1, "Miraz", 3));
		alist.add(new Students9(4, "Tahmina", 9));
		alist.add(new Students9(6, "Rihan", 11));
		alist.add(new Students9(5, "Tuhi", 12));
		alist.add(new Students9(9, "Sama", 26));
		

		// Before Sorting
		System.out.println("Befor Srted Student List: \n");
		for (Students9 s1 : alist) {
			System.err.println(s1);
		}

		// Sorting applied for name
		Collections.sort(alist, Students9.nameComparator);

		// After Sorting Name
		System.out.println("\nAfter Srted Students Nmae List: \n");
		for (Students9 s1 : alist) {
			if(s1.getName().startsWith("A")) {
				
				System.out.println(s1);
			}
		}
		//sorting by Stream
		System.out.println("\nSorting by Stream");
		alist.stream().filter(f->f.getName().startsWith("A")).forEach(System.out::println);

		// sorting apply for age.
		Collections.sort(alist, Students9.ageComparator);

		// After Sorting age
		System.out.println("\nAfter Srted Students Age List: \n");
		for (Students9 s1 : alist) {
			if (s1.getAge() > 10) {

				System.out.println(s1);
			}
		}
		//sorting by Stream
		System.out.println("\nSorting by Stream");
		alist.stream().filter(n->n.getAge()>10).forEach(System.out::println);
		
		System.out.println("\nSorting by Stream with age and name");
		
		alist.stream().filter(m->m.getName().startsWith("A") && m.getAge()<10).forEach(System.out::println);
	}

}
