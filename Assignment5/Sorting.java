package com.dv.Assignment5;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		int[] arr;
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		size = s.nextInt();
		arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the " + (i + 1) + "th element");
			int num = s.nextInt();
			arr[i] = num;

		}
		System.out.println("Array Elements are...");

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println();
		System.out.println("Sorted array...");

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
