package by.htp.les03.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("Enter a");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Enter a");
		}
		a = scan.nextInt();

		System.out.println("Enter b");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Enter b");
		}
		b = scan.nextInt();

		System.out.println("Enter c");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Enter c");
		}

		if (a == 0) {
			System.out.println("Incorrect input");
			return;
		}

		double z = 0;
		double temp;

		temp = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a);
		z = temp - (Math.pow(a, 3) * c) + b;

		System.out.println(z);
	}

}