package com.dv.assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashlist {
	public static void main(String[] args) {

		Office o1 = new Office(101, "dv", "ceo");
		Office o2 = new Office(102, "keerti", "manager");
		Office o3 = new Office(103, "aru", "tl");
		LinkedHashSet<Office> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(o2);
		linkedHashSet.add(o1);
		linkedHashSet.add(o3);
		System.out.println(linkedHashSet);
		System.out.println();
		System.out.println("After sorting...");
		ArrayList<Office> arrayList = new ArrayList<>(linkedHashSet);
		Collections.sort(arrayList);
		System.out.println("After sorting by comparable by name...");
		for (Office i : arrayList) {
			System.out.println(i);
		}
		System.out.println();

		Collections.sort(arrayList, new SortById());
		Iterator<Office> iterator = arrayList.iterator();
		System.out.println("After sorting by comparator by id...");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}