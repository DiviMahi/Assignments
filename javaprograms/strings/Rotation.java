package com.dv.javaprograms.strings;

import java.util.Scanner;

public class Rotation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string ..");
		String s1 = s.next();
		System.out.println("enter a string ..");
		String s2 = s.next();
		String s3 = s1 + s1;
		//System.out.println(s3);
		if (s1.length() == s2.length() && s3.contains(s2)) {
			System.out.println("True");

		} else

		{
			System.out.println("False");
		}
	}
}
