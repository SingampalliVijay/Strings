package com.kn.strings;

public class StringMethods2 {

	public static void main(String[] args) {
		
	String s1=" Mohandas Karam Chand Ghandhi ";
	
	System.out.println("To find the length of the String");
	System.out.println(s1.length());
	
	System.out.println("");
	System.out.println(s1.startsWith(" Mo"));
	System.out.println(s1.endsWith("hi "));
	System.out.println();
	char[] crr=s1.toCharArray();
	for(int i=crr.length-1;i>=0;i--) {
		System.out.print(crr[i]);
	}
	
	System.out.println();
	String []srr = s1.split(" ");
	System.out.println("--String Starts From Backward");
	for(int i=srr.length-1;i>=0;i--) {
		System.out.print(srr[i]);
	}
	System.out.println("");
	System.out.println("--String With Split");
	for(int i=0;i<srr.length;i++) {
		System.out.print(srr[i]);
	}
	System.out.println();
	
	System.out.println();
	System.out.println(s1.trim());

	System.out.println(s1.replace('a','A'));
    System.out.println(s1.replaceAll(s1, "Mahatma"));
	}
}
