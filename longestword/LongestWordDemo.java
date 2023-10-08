package com.kn.longestword;

public class LongestWordDemo {

	public static void main(String[] args) {
	
	String inputstring="I am Learning Java";
	
//	Create Object for LongestWord
	LongestWord longestword=new LongestWord();
	
//	call method
	String outputstring=longestword.isLongest(inputstring);
//	Print the Longest Word in a String
	System.out.println(outputstring);

	}

}
