package myPackage;

import java.util.Scanner;

public class amstrongNumber {
	
	static void detAmstrong(int num) {
 
		 
		
		int number, temp, total = 0;
	
		  number = num;

		while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

		 if(total == num)
	            System.out.println(num + " is an Armstrong number");
	        else
	            System.out.println(num + " is not an Armstrong number");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println(" sugest an amstrong  number");
		
		int num = myObj.nextInt(); // Read user input
		

		detAmstrong(num);

	}

}
