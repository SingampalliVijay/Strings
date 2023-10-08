package com.kn.palindrome;

public class PalindromeString {

	public String palindrome(String inputString) {
		
	StringBuffer outputstring=new StringBuffer();
	
	for(int i=inputString.length()-1;i>=0;i--) {
		outputstring=outputstring.append(inputString.charAt(i));
	}
	if(outputstring.toString().equals(inputString)) {
		System.out.println("String is in Palindrome");
	}else {
		System.out.println("Not a Palindrome");
	}
		return outputstring.toString();	
	}
}
