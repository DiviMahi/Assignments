package com.dv.assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		Office o1 = new Office(101, "dv", "ceo");
		Office o2 = new Office(102, "keerti", "manager");
		Office o3 = new Office(103, "aru", "tl");
		Office o4 = new Office(103, "aru", "tl");

		TreeSet<Office> ts = new TreeSet<>();
		ts.add(o1);
		ts.add(o2);
		ts.add(o4);
		ts.add(o3);
		System.out.println(ts);
		System.out.println("After Sorting by comparable..");
		ArrayList<Office> arrayList = new ArrayList<>(ts);
		Collections.sort(arrayList);
		Iterator<Office> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
