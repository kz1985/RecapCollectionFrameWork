package com.CollectionFW_Itarable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ArrayVsLinkedList {
	public static void main(String[] args) {
	
		//ArrayList
		System.err.println("-----------------ArrayList-----------------");
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(21);
		aList.add(35);
		aList.add(15);
		aList.add(18);
		aList.add(97);
		aList.add(70);
		aList.add(52);
		aList.add(84);
		aList.add(null);
		aList.add(-10);
		aList.add(-10);
		System.out.println("The Array List is : "+aList);
		System.out.println("Total number of elements : "+aList.size());
		
		aList.stream().distinct().forEach(System.out::println);
		System.out.println("Split : "+aList.set(10, aList.get(10)));
		
		//Linked List
		System.err.println("\n-----------------LinkedList-----------------");
		List<String> lList = new LinkedList<String>();
		lList.add("This");
		lList.add("is");
		lList.add("a");
		lList.add("LinkedList");
		lList.add("To");
		lList.add("Implement");
		lList.add("With");
		lList.add("List");
		lList.add("Interface");
		lList.add(null);
		System.out.println(lList);
		
		//Get the length of each element
		for (String l : lList) {
			//System.out.print(l.length()+", ");
		}
		
		for(int i=0; i<lList.size(); i++) {
			System.out.println(lList.get(i));
		}
		
		
		//Dqueu Interface
		System.out.println("\n-----------------Queue-----------------");
		Queue<String>lListdque  = new LinkedList<String>();
		lListdque.add("This");
		lListdque.add("is");
		lListdque.add("a");
		lListdque.add("LinkedList");
		lListdque.add("To");
		lListdque.add("Implement");
		lListdque.add("With");
		lListdque.add("Queue");
		lListdque.add("Interface");
		lListdque.add(null);
		System.out.println("Queue :"+lListdque);
		
		for(String dq:lListdque) {
			System.out.println(dq.length());
		}
		
	
		
	}

}
