package com.dv.codingjava;

public class Pop extends Music {
	static String PopType;

	public Pop(String Type, String PT) {
		super(Type);
		PopType = PT;
		System.out.println("This is POP World!");
	}
}
