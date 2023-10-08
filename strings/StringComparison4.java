package com.kn.strings;

public class StringComparison4 {

	public static void main(String[] args) {
	String s1="Ram";
	String s2="Sita";
	String s3=s1+"Sita";
	String s4=s1+"Sita";
	
	if(s3==s4) {
		System.out.println("References are same");
	}else {
		System.out.println("References are Different");
	}
     if(s3.equals(s4)) {
    	 System.out.println("String data Are Equal");
     }else {
    	 System.out.println("String data are Unequal");
     }
	}
}
