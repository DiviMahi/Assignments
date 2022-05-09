package com.dv.javaprograms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string ..");
		String s1 = s.nextLine();
		System.out.println("enter a string ..");
		String s2 = s.nextLine();
		if (s1.length() != s2.length()) {
			System.out.println("The given strings are Not Anagram");
		} else {
			char[] c1 = s1.toLowerCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("The given strings are is Anagram");

			} else {
				System.out.println("The given strings are Not Anagram");

			}

		}
	}
}