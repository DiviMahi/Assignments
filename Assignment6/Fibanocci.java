package Assignment6;

import java.util.Scanner;

public class Fibanocci {
	public static void fibanocci(int n) {
		int f1 = -1;
		int f2 = 1;
		for (int i = 0; i < n; i++) {
			int f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int num;
		num = s.nextInt();
		System.out.println("Fibanocci Series:");
		fibanocci(num);
	}

}
