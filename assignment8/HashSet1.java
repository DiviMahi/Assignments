package com.dv.assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		Office o1 = new Office(101, "dv", "ceo");
		Office o2 = new Office(102, "keerti", "manager");
		Office o3 = new Office(103, "aru", "tl");
		HashSet<Office> hs = new HashSet<>();
		hs.add(o1);
		hs.add(o2);
		hs.add(o1);
		hs.add(o3);
		System.out.println(hs);
		System.out.println();
		System.out.println("After b sorting by comparable by name");
		ArrayList<Office> l = new ArrayList<>(hs);
		Collections.sort(l);

		Iterator<Office> iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
