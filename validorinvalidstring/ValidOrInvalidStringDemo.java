package com.kn.validorinvalidstring;

import java.util.Scanner;

public class ValidOrInvalidStringDemo {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String Data");
		String s1=scan.nextLine();
		
		ValidOrInvalidString validorInvalid=new ValidOrInvalidString();
		
		boolean result=validorInvalid.validOrInvalid(s1);
		
		if(result) {
		System.out.println("Valid String");
		}else {
			System.out.println("Invalid String");
		}
		

	}

}
