package com.kn.strings;

public class StringComparison2 {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Sita";
		String s3="Ram"+"Sita";
		String s4="Ram"+"Sita";
		if(s3==s4) {
			System.out.println("References Are Same");
		}else {
			System.out.println("References are Different");
		}
		
		if(s3.equals(s4)) {
			System.out.println("String Data are Equal");
		}else {
			System.out.println("String Data are Unequal");
		}

	}

}
