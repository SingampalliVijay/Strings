package com.kn.titlecase;

import java.util.Scanner;

public class TitleCaseDemo {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String :");
	
	String inputstring=scan.nextLine();
	
	TitleCase titlecase=new TitleCase();
	
	String Output=titlecase.titleCase(inputstring);
    System.out.println(Output);
	}

}
