package com.dv.assignment8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(80);
		linkedList.add(20);
		linkedList.add(20);
		linkedList.add(50);
		System.out.println(linkedList);
		Collections.sort(linkedList);
		System.out.println("After sorting the Linked List...");
		Iterator<Integer> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
