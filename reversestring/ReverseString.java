package com.kn.reversestring;

public class ReverseString {
   
	public String reverse(String inputstring) {
		
	StringBuffer outputString=new StringBuffer();
	
	for(int i=inputstring.length()-1;i>=0;i--) {
	outputString=outputString.append(inputstring.charAt(i));
	}
	return outputString.toString();
	}
}