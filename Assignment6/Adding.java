package Assignment6;

import java.util.Scanner;

public class Adding {
	public static int add(int a[], int size) {
		int result = 0;
		for (int i = 0; i < size; i++) {
			result = result + a[i];

		}
		return result;
	}

	public static void main(String[] args) {
		int size;
		int arr[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		size = s.nextInt();
		arr = new int[size];
		System.out.println("Enter the elements  of array");
		for (int j = 0; j < size; j++) {
			int temp = s.nextInt();
			arr[j] = temp;
		}
		System.out.println("The result is:" + Adding.add(arr, size));
	}
}
