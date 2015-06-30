package Day3;

import java.util.Scanner;

public class Squareroot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		// System.out.println(Math.sqrt(5));
		// System.out.printf("Square root is %.03f", square_root(s.nextInt()));
		System.out.printf("Square root is %.03f", sqr(s.nextInt()));

	}

	public static double square_root(int x) {
		double number = 1.0, temp = 1;
		int first = x;
		for (double i = 1.0; i <= first; i++) {

			/*
			 * temp = i * i; if (temp == x) { number = i; break; }
			 */

			temp = x / i;
			if (temp == i) {
				number = i;
				break;
			} else if (temp != i) {
				double a = 1, b = x;
				while (Math.abs(a - b) > 1) {
					a = (a + b) / 2;
					b = x / a;
				}
				number = a;

			}

		}
		return number;
	}

	/*
	 * public static double square_root(int x) { double temp = 1.0; if (x < 0) {
	 * System.out.println("Not a valid number"); }
	 * 
	 * double a = 1, b = x; while (Math.abs(a - b) > 1) { a = (a + b) / 2; b = x
	 * / a; } return a * 100 / 100.00;
	 * 
	 * }
	 */

	/* The below method is working perfectly */

	public static double sqr(int x) {
		return test(x, 2);
	}

	public static double test(double x, double y) {
		if (closeenough(x / y, y))
			return y;
		else
			return test(x, nextguess(x, y));

	}

	public static boolean closeenough(double d, double y) {

		boolean b = (Math.abs(d - y) < 0.001);
		return b;
	}

	public static double nextguess(double x, double y) {
		double d = ((y + x / y) / 2);
		return d;
	}
}
