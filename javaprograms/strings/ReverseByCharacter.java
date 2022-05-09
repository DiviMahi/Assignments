package com.dv.javaprograms.strings;

import java.util.Scanner;

public class ReverseByCharacter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string ..");
		String s1 = s.next();
		char c;
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			c = s1.charAt(i);
			// System.out.println(c);
			s2 = c + s2;

		}
		System.out.println("Reversed String:" + s2);
	}
}
