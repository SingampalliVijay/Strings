package com.kn.ReplaceSpace;

import java.util.Scanner;

public class ReplaceSpaceDemo {

	public static void main(String[] args) {
	
//		Take input From the User
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String inputstring=scan.nextLine();
//		Create Object to replaceSpace
		ReplaceSpace replacespace=new ReplaceSpace();
		
//		call method 
		String outputString=replacespace.replaceSpace(inputstring);
		
//		Print the Replaced String 
		System.out.println("Repalce String :"+outputString);
//    Release the resource
		scan.close();
	}

}
