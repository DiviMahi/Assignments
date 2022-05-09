package com.dv.javaprograms.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string ..");
		String s1 = s.nextLine();
		String s2 = "";
		String str[] = s1.split(" ");
		int size = str.length;
		for (int i = 0; i < size; i++) {
			s2 = str[i] + s2;
			s2 = " " + s2;

		}
		System.out.print("The reversed sentense:" + s2);
	}
}