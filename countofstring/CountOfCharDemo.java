package com.kn.countofstring;

import java.util.Scanner;

public class CountOfCharDemo {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String:");
	String inputstring=scan.nextLine();
	
	CountofChar countOfChar=new CountofChar();
	countOfChar.iscount(inputstring);

	}

}
