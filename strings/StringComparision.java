package com.kn.strings;

public class StringComparision {

	public static void main(String[] args) {
	String s1="Vijay";
	String s2="Vijay";
	String s3=new String("Ajay");
	String s4=new String("Ajay");
	String s5=new String("ajay");
	
	System.out.println("--- Related to s1 & s2 ---");
	if(s1==s2) {
		System.out.println("References are point to same object");
	}else {
		System.out.println("References are point to Different Objects");
	}
	if(s1.equals(s2)) {
		System.out.println("String Object DATA is Equal");
	}else {
		System.out.println("String Object DATA is Unequal");
	}
	
    System.out.println(" ");
	System.out.println("--- Related to s3 & s4 ---");
	if(s3==s4) {
		System.out.println("References are point to same object");
	}else {
		System.out.println("References are point to Different object");
	}
	if(s3.equals(s4)) {
		System.out.println("String Object DATA is Equal");
	}else {
		System.out.println("String Object DATA is Unequal");
	}
	
	System.out.println(" ");
	System.out.println("If Data Differs");
	if(s3.equals(s5)) {
		System.out.println("String Object DATA is Equal");
	}else {
		System.out.println("String Object DATA is Unequal");
	}
	}

}
