package com.dv.javaprograms.strings;

import java.util.Scanner;

public class CapsSmall {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string ..");
		String s1 = s.nextLine();
		StringBuffer str = new StringBuffer(s1);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				str = str.replace(i, i + 1, Character.toUpperCase(c) + "");

			} else {
				str = str.replace(i, i + 1, Character.toLowerCase(c) + "");

			}
		}
		System.out.println("Replaced String:" + str);

	}
}
