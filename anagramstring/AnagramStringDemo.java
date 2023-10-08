package com.kn.anagramstring;

import java.util.Scanner;

public class AnagramStringDemo {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter First String :");
	String s1=scan.nextLine();
	
	System.out.println("Enter Second String :");
	String s2=scan.nextLine();
	
	AnagramString anagramString=new AnagramString();
	boolean isanagram=anagramString.isAnagram(s1, s2);
	
	if(isanagram) 
	{
		System.out.println(s1 +" & "+ s2+ " are anagram String ");
	}else 
	  {
		System.out.println(s1 +" & "+ s2+ " are  not anagram String ");
	  }
	}

}
