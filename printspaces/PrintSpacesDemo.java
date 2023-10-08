package com.kn.printspaces;

public class PrintSpacesDemo {

	public static void main(String[] args) {
	
	String s1="I am Learninig Java";
	System.out.println(s1);
	System.out.println("Reversed Preserving Space String :");
	
	PrintSpaces printSpaces=new PrintSpaces();
	
	String result=printSpaces.isspace(s1);
	
	System.out.println(result);

	}

}
