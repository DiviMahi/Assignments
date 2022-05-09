package com.dv.javaprograms.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string ..");
		String s1 = s.next();
		String str[]=s1.split(" ");
		int size=str.length;
		ArrayList<String> al = new ArrayList<>();
		for(int i=0;i<size;i++) {
			//if(str[i].contains(al)) {
				//str1=str1+str[i];
			//	String x=str[i];
				
				
			}
	//	}
		
		
		
		//char c;
		//String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
		//	c = s1.charAt(i);
			// System.out.println(c);
			//s2 = c + s2;

		}
		System.out.println("Reversed String:" + s1);
	}

}
