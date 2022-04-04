package com.dv.finalassesment;

import java.util.Comparator;

public class SortByMark implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) ((int) o2.marks - (int) o1.marks);
	}

}
