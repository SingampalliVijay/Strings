package com.kn.firstuniquechar;

import java.util.Scanner;

public class NonRepeatingCharDemo {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String Data :");
		String s1=scan.nextLine();
		
		NonRepeatingChar nonrepeating=new NonRepeatingChar();
		char result=nonrepeating.uniqueChar(s1);
		
		System.out.println("First non Repeating String :"+result);
		

	}

}
