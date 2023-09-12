package com.CollectionFW_Itarable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAndLinkedHashMap {
	public static void main(String[] args) {
		 mapsAndHashMaps() ;
		 linkedHashMaps() ;
		 hashTables();
	}
	
	public static void mapsAndHashMaps() {
	Map<Integer, String> map = new HashMap<Integer, String>();
	System.out.println("------------ HashMap --------------");
	
	map.put(3, "Sat");
	map.put(2, "Fri"); //<--
	map.put(1, "Thrus");
	map.put(4, "Mon"); // <---
	map.put(5, "Tues");
	map.put(6, "Wed");
	map.put(7, "Sun");
	for(Entry<Integer, String> mp:map.entrySet()) {
		System.out.println(mp.getKey()+" : "+mp.getValue());
	}
	}
	public static void linkedHashMaps() {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		System.out.println("------------ LinkedHashMap --------------");
		
		map.put(3, "Sat");
		map.put(2, "Fri"); //<--
		map.put(1, "Thrus");
		map.put(4, "Mon"); // <---
		map.put(5, "Tues");
		map.put(6, "Wed");
		map.put(7, "Sun");
		for(Entry<Integer, String> mp:map.entrySet()) {
			System.out.println(mp.getKey()+" : "+mp.getValue());
		}
		
	}
	public static void hashTables() {
		Map<Integer, String> map = new Hashtable<Integer, String>();
		System.out.println("------------ HashTable --------------");
		
		map.put(3, "Sat");
		map.put(2, "Fri"); //<--
		map.put(1, "Thrus");
		map.put(4, "Mon"); // <---
		map.put(5, "Tues");
		map.put(6, "Wed");
		map.put(7, "Sun");
		for(Entry<Integer, String> mp:map.entrySet()) {
			System.out.println(mp.getKey()+" : "+mp.getValue());
		}
		
	}


}
/*	map.put(3, "Sat");
	map.put(2, "Fri"); //<--
	map.put(1, "Thrus");
	map.put(4, "Mon"); // <---
	map.put(5, "Tues");
	map.put(6, "Wed");
	map.put(7, "Sun");
	map.put("Yot", 4);
	map.put("Aot", 1);
	====================
		map.put("Bot", 3);
	map.put("Aot", 11); //<--
	map.put("Kot", 1);
	map.put("Yot", 5); // <---
	map.put("Aot", 5);
	map.put("Tot", 2);
	map.put("Sot", 11);
	map.put("Yot", 4);
	map.put("Aot", 1);
	==========================
		map.put("E", 3);
	map.put("A", 10);
	map.put("B", 5);
	map.put("F", 2);
	map.put("D", 6);
	map.put("C", 4);
	*/