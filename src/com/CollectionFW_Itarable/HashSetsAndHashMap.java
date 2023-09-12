package com.CollectionFW_Itarable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetsAndHashMap {
	public static void main(String[] args) {
		// hashSets();
		// linkedHashSets();


	}

	public static void hashSets() {
		// hashSet
		System.out.println("---------------------HashSet with String ---------------------");

		Set<String> hSet = new HashSet<String>();
		hSet.add("FIVE");
		hSet.add("ONE");
		hSet.add("EIGHT");
		hSet.add("THREE");
		hSet.add("SIX");
		hSet.add("TWO");
		hSet.add("SEVEN");
		hSet.add("FOUR");

		hSet.add(null); // .Length() can not execute if null value is available withing the list
		hSet.add(null); // .Length() can not execute if null value is available withing the list
		hSet.add(null); // .Length() can not execute if null value is available withing the list
		if (hSet.contains(null)) {
			hSet.remove(null);
			// System.out.println(hSet.add(null));
			System.out.println(hSet);
		}

		for (String hh : hSet) {
			System.out.print(hh + " = ");
			System.out.println(hh.length() + ", ");
		}
		// Traversing
		Iterator<String> its = hSet.iterator();
		while (its.hasNext()) {
			System.out.print(its.next() + ",");
		}
		System.out.println("---------------------HashSet with Int---------------------");

		Set<Integer> hSetInt = new HashSet<Integer>();
		hSetInt.add(6);
		hSetInt.add(2);
		hSetInt.add(7);
		hSetInt.add(4);
		hSetInt.add(8);
		hSetInt.add(1);
		hSetInt.add(5);
		hSetInt.add(3);

		System.out.println(hSetInt);

	}

	public static void linkedHashSets() {
		// Linked Hash Set
				System.out.println("\n---------------------- Linked Hash Set ------------------------------");
				LinkedHashSet<String> linkedHshSet = new LinkedHashSet<String>();
				linkedHshSet.add("SIX");
				linkedHshSet.add("TWO");
				linkedHshSet.add("SEVEN");
				linkedHshSet.add("FOUR");
				linkedHshSet.add("FIVE");
				linkedHshSet.add("ONE");
				linkedHshSet.add("EIGHT");
				linkedHshSet.add("THREE");
				linkedHshSet.add("NINE");
				// linkedHshSet.add(null); // .Length() can not execute if null value is
				// available withing the list

				System.out.println("Size of Linked Hash Set :" + linkedHshSet.size());
				// Iterable
				Iterator ir = linkedHshSet.iterator();
				while (ir.hasNext()) {
					System.out.println(ir.next());

				}
				System.out.println();
				for (String lh : linkedHshSet) {
					System.out.print(lh+" = ");
					System.out.println(lh.length()+" , ");
				}
			System.out.println("\n ---------------------LinkedHashSet with Int---------------------");
				
				Set<Integer> lhSet = new LinkedHashSet<Integer>();
				lhSet.add(6);
				lhSet.add(2);
				lhSet.add(7);
				lhSet.add(4);
				lhSet.add(8);
				lhSet.add(1);
				lhSet.add(5);
					lhSet.add(3);
			
				System.out.println(lhSet);
	}





}