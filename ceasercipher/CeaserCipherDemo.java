package com.kn.ceasercipher;

import java.util.Scanner;

public class CeaserCipherDemo {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String :");
	String s1=scan.nextLine();
	
	System.out.println("Condition for rotation:");
	int n=scan.nextInt();
	
//	create object 
	CeaserCipher ceaserCipher=new CeaserCipher();
    String OutputString= ceaserCipher.isCipher(s1, n);
    
    System.out.println("Ceaser Cipher for "+s1+"is : "+OutputString);
	}

}
