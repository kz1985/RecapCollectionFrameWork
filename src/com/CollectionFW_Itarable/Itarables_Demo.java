package com.CollectionFW_Itarable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
 

public class Itarables_Demo {
	public static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		
		
		//With ForEach
		list.add("one");
		list.add("Two");
		list.add("Three");
		System.out.print("ForEach Loop : ");
		for( String l:list) {
			System.out.print(l+", ");
		}
		
		//With iterator
		System.out.print("\nIterators : ");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}

		
		
	}

}
