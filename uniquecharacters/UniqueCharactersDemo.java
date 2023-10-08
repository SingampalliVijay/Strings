package com.kn.uniquecharacters;

import java.util.Scanner;

public class UniqueCharactersDemo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter a String Characters");
	String s1=scan.nextLine();
	
	UniqueCharacters unique=new UniqueCharacters();
	unique.isunique(s1); 
	
	}
}
