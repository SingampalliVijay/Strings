package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
//	Take input from User
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String =");
		
        String inputstring=scan.nextLine();
//		Create a Object to of reverseString
		ReverseString reverseString=new ReverseString();
//		Call a Method
		String outputstring=reverseString.reverse(inputstring);
//		Print the reverse String 

		System.out.println("Reverse String :"+outputstring);
//	Release the resource
		scan.close();
	}

}
