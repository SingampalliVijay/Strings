package com.kn.palindrome;

import java.util.Scanner;

public class PalindromeStringDemo {

	public static void main(String[] args) {
//	take input from the user
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter a String Palindrome");
	String inputString=scan.nextLine();
	
//	create object to method PalindromeString
	PalindromeString ispalindrome=new PalindromeString();
//	call a method 
	String outputstring=ispalindrome.palindrome(inputString);
	
//	Print Palindrome
	System.out.println("Reversed String :"+outputstring);
	}
}
