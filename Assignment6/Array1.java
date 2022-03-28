package Assignment6;

import java.util.Scanner;

public class Array1 {

	static int size;
	static int arr[];
	static Scanner s = new Scanner(System.in);

	public static void array(int size) {
		System.out.println("Enter the elements  of array");
		for (int j = 0; j < size; j++) {
			int temp = s.nextInt();
			arr[j] = temp;
		}
		NewArray(arr, size);

	}

	public static void NewArray(int arr[], int size) {

		System.out.println("The new array:");
		if (size != 1) {
			int arr1[];
			int n = 2;
			arr1 = new int[n];
			for (int j = 0; j < 2; j++) {
				int temp;
				temp = arr[j];
				arr1[j] = temp;
				System.out.println(arr1[j]);

			}
		} else {
			for (int j = 0; j < size; j++) {
				System.out.println(arr[j]);
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of array");
		size = s.nextInt();
		arr = new int[size];
		array(size);

	}

}
