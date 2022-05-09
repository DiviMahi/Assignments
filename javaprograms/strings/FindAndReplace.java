package com.dv.javaprograms.strings;

import java.util.Scanner;

public class FindAndReplace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string ..");
		String s1 = s.nextLine();
		char c = '@';
		s1 = s1.replace(' ', c);
		System.out.println("Replaced string:" + s1);

		// int size = s1.length();
		// for (int i = 0; i < size; i++) {
		// c = s1.charAt(i);
		// int x = (int) c;
		// if (x == 32) {
		// s1 = s1.replace(c, '@');

		// }
		// }
		// System.out.println("Replaced string:" + s1);

	}
}