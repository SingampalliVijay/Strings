package com.kn.togglecase;

import java.util.Scanner;

public class ToggleCaseOfStringDemo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter a String :");
	String inputstring=scan.nextLine();
	
	ToggleCaseOfString changeCase=new ToggleCaseOfString();
	
	String Output=changeCase.changingCaseofString(inputstring);
	
   System.out.println(Output);
	}

}
