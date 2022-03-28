package Assignment6;

import java.util.Scanner;

public class Array2 {
	static int size;
	static int arr[];
	static Scanner s = new Scanner(System.in);

	public static void array(int size) {
		System.out.println("Enter the elements  of array");
		for (int j = 0; j < size; j++) {
			int temp = s.nextInt();
			arr[j] = temp;
		}
		add(arr, size);
	}

	public static void add(int a[], int size) {
		int i = 0, j[];
		j = new int[3];
		int count = 0;
		while (i < size) {
			if (a[i] != 3) {
				i++;
			} else {
				count += 1;
				i++;

			}
		}
		if (count == 3) {
			// if (j[i] + 1 != j[1 + 1])
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter the size of array");
		size = s.nextInt();
		arr = new int[size];
		array(size);

	}

}
