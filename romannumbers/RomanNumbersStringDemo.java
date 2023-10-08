package com.kn.romannumbers;

import java.util.Scanner;

public class RomanNumbersStringDemo {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number :");
	int num=scan.nextInt();
	
	RomanNumbersString romannumber=new RomanNumbersString();
     String result=romannumber.printRomanNumber(num);
     System.out.println("Roman Number For "+num+" is :"+result);
	}

}
