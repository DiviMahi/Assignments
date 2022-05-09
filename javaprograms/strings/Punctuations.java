package com.dv.javaprograms.strings;

import java.util.Scanner;

public class Punctuations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string...");
		String s1 = s.next();
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '.') {
				count = count + 1;

			}
		}
		System.out.println("No.of Punctuations in the string:" + count);

	}

}
