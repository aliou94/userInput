package myPackage;

import java.util.Scanner;
import java.lang.*;

public class plaindrom {
	
	static void verify (String word) {

        StringBuffer sbf = new StringBuffer(word);
      
        
        sbf.reverse();
		
		
		
        
		
		 if(word.equals(sbf.toString()))
	            System.out.println(sbf + " is a plaindromr");
	        else
	            System.out.println(sbf + " is not an a plaindrom");
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a word");
		
		String word = myObj.nextLine() ; // Read user input
		
		verify(word);

	}

}
