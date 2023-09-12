package com.CollectionFW_Itarable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAndHashTable {
	public static void main(String[] args) {
		maps();
		tabls();
	}

	public static void maps() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("------------ HashMap --------------");

		map.put(null, "Sat");
		map.put(2, null); // <--
		map.put(1, "Thrus");
		map.put(4, null); // <---
		map.put(5, "Tues");
		map.put(6, "Wed");
		map.put(7, "Sun");
		for (Entry<Integer, String> mp : map.entrySet()) {
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}
	}

	public static void tabls() {
		Map<Integer, String> tbl = new Hashtable<Integer, String>();
		System.out.println("------------ Hashtble --------------");

		tbl.put(3, null); // Compile time error
		tbl.put(2, "Fri"); // <--
		tbl.put(1, "Thrus");
		tbl.put(4, "Mon"); // <---
		tbl.put(5, "Tues");
		tbl.put(6, "Wed");
		tbl.put(7, "Sun");
		for (Entry<Integer, String> mp : tbl.entrySet()) {
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}
	}
}
