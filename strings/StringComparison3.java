package com.kn.strings;

public class StringComparison3 {

	public static void main(String[] args) {
	String s1="Ram";
	String s2="Sita";
	String s3=s1+s2;
	String s4=s1+s2;
	
	if(s3==s4) {
		System.out.println("References are Same ");
	}else {
		System.out.println("References are Different");
	}
     if(s3.equals(s4)) {
    	 System.out.println("String data are Equal");
     }else {
    	 System.out.println("String Data are Unequal");
     }
	}

}
