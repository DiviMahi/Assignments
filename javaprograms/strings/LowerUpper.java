package com.dv.javaprograms.strings;

import java.util.Scanner;

public class LowerUpper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string in UpperCase...");
		String s1 = s.next();
		System.out.println("LowerCase Version:" + s1.toLowerCase());
		System.out.println("enter a string in LowerCase...");
		String s2 = s.next();
		System.out.println("UpperCase Version:" + s2.toUpperCase());

	}
}
