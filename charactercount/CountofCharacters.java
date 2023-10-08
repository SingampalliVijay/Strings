package com.kn.charactercount;

import java.util.Scanner;

public class CountofCharacters {

	public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);
     System.out.println("Enter a String Characters");

     String s1=scan.next();
     System.out.println("Enter a Character");
     char ch =scan.next().charAt(0);
//     Creating object for countofCharacters
     CountofCharactersDemo countofCharacters=new CountofCharactersDemo();
     int count=countofCharacters.countofCharacters(s1, ch);
     System.out.println("The Count Of Character "+ch+" ="+count);
	}
}
