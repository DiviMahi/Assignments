package com.dv.javaprograms;

import java.util.Scanner;

public class frequency {
	public static void main(String[] args) {
		int arr[], count[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		arr = new int[size];
		count = new int[size];
		int c = 0;

		System.out.println("Enter the elements in array..");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		for (int j = 0; j < size; j++) {
			int temp = arr[j];
			for (int k = j + 1; k < size; k++) {
				if (temp == arr[k]) {
					c = c + 1;
				}

				count[j] = c;

			}

		}
		System.out.println("Array elements with frequency...");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + ":" + count[i]);
		}

	}
}
