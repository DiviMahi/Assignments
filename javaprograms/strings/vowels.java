package com.dv.javaprograms.strings;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string...");
		String s1 = s.next();
		String s2 = s1.toLowerCase();
		int count = 0;
		char c;
		for (int i = 0; i < s1.length(); i++) {
			c = s2.charAt(i);

			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
				count = count + 1;
			}

		}
		System.out.println("No.of VOWELS in the string:" + count);

	}
}
