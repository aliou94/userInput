package myPackage;

import java.util.Scanner;

public class calculator {
	
	
	static void add(int a, int b) {
		
	System.out.print(a+b);
		
	}
	
static void subtract(int a, int b) {
		
	System.out.print(a-b);
		
	}


static void divde (double a, double b) {
	
	System.out.print(a / b);
	
}

static void  multiply (int a, int b) {
	
	System.out.print(a*b);;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a first number");
		
		 int num1 = myObj.nextInt(); // Read user input

		 System.out.println("Enter a second number");
		 int num2 = myObj.nextInt();
		 
		 System.out.println("Enter an operation");
		 String operation = myObj.next();
		 
		 
		 switch(operation.toUpperCase()) {
		  case "ADD":
		      add(num1, num2);
		    break;
		  case "SUBTRACT":
		       subtract(num1, num2);
		    break;
		  case "MULTIPLY":
			  multiply (num1,num2);
			    break;
		  case "DIVIDE":
			  divde(num1, num2);
			    break;
		  default:
			  System.out.println("enter a valid operation / thanks for using calculator");
		}

	}

}