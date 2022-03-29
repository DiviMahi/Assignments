package com.dv.assignment8;

public class Office implements Comparable<Office> {
	int id;
	String Name;
	String dsn;

	public Office(int id, String name, String dsn) {
		super();
		this.id = id;
		Name = name;
		this.dsn = dsn;
	}

	@Override
	public String toString() {
		return "Office [id=" + id + ", Name=" + Name + ", dsn=" + dsn + "]";
	}

	@Override
	public int compareTo(Office o) {
		// TODO Auto-generated method stub
		return this.Name.compareTo(o.Name);
		// return this.id - o.id;
	}

}
