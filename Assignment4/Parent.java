package com.dv.Assignment4;

public abstract class Parent {
	void Parent() {
		System.out.println("This is constructor of abstract class");
	}

	abstract void a_method();

	void method() {
		System.out.println("This is normal method from the abstract class");
	}
}
