package myPackage;

import java.util.Scanner;

public class fabinouchiSeries {

	// 1 fabinouchiSeries = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

	static void myMethod(int num1, int numEnd) {

		int i = num1;
		int num2 = 1;

		while (i <= numEnd) {

			System.out.println(num1);

			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			i++;
		}

	};

	// 2 Determine whether a user entered number is an Armstrong number.

	static boolean detAmstrong(int num) {

		String numConversion = String.valueOf(num);

		String[] arrOfStr = numConversion.split("");

		double sum = 0;

		for (String a : arrOfStr) {

			double cube = Math.pow(Integer.parseInt(a), 3);

			sum = cube + sum;

		}

		return sum == num ? true : false ;
	
	}

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a start number");

	

		int num = myObj.nextInt(); // Read user input

		
		
		System.out.println(detAmstrong(num));

	};

}
