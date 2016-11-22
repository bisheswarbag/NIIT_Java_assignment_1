package assignment_1;

import java.util.Scanner;

public class Fabbonaci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of fabbonaki ");
		int range = scan.nextInt();
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		System.out.print(f1);
		for (int count = 0; count < range; count++) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			System.out.print("\t" + sum);
		}

	}

}
