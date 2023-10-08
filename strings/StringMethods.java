package com.kn.strings;

public class StringMethods {

	public static void main(String[] args) {
	String s1="Raja Ram Mohan Roy";
	
	System.out.println("To Convert String Data In Upper Case");
	System.out.println(s1.toUpperCase());

	System.out.println("To Convert String Data in Lower Case");
	System.out.println(s1.toLowerCase());
	
	System.out.println("To Find Character of Specified Index Number");
	System.out.println(s1.charAt(5));
	
	System.out.println("Returns  Index value of first value for specified character");
	System.out.println(s1.indexOf('a'));
	
	System.out.println("Returns Index value of last value for Specified Character");
	System.out.println(s1.lastIndexOf('a'));
	
	System.out.println("Returns String starting from specified index");
	System.out.println(s1.substring(15));
	
	System.out.println("String Starting from specified index to lastindex(Excluded)");
	System.out.println(s1.substring(5, 14));
	
	System.out.println("Returns True if String founds else False");
	System.out.println(s1.contains("Roy"));
	
	System.out.println(" ----- ");
	}
}
