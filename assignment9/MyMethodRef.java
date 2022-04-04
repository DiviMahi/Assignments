package com.dv.assignment9;

public interface MyMethodRef {
	void add(int x, int y);

	static void msg() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		msg();

	}
}
