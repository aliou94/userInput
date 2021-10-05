package myPackage;

import java.util.Scanner;

public class FabSeries {
	
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a start number");
		
		 int num1 = myObj.nextInt(); // Read user input

		 System.out.println("Enter a end number");
		 int numEnd = myObj.nextInt();

		 myMethod(num1, numEnd);

}
	

}
