package com.kn.duplicatestring;

import java.util.Scanner;

public class DuplicateStringDemo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter A String Data");
	
	String inputstring=scan.nextLine();
	
	DuplicateString duplicate=new DuplicateString();
	
     duplicate.isduplicate(inputstring);


	}

}
