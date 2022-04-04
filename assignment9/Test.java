package com.dv.assignment9;

public class Test implements MyMethodRef {
	void add1(int x, int y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		Test test = new Test();
		MyMethodRef m = test::add1;
		m.add(5, 5);
		MyMethodRef.msg();

	}

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub

	}

}
