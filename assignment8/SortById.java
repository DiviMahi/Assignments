package com.dv.assignment8;

import java.util.Comparator;

public class SortById implements Comparator<Office> {

	@Override
	public int compare(Office o1, Office o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}

}
