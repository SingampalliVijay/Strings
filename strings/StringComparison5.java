package com.kn.strings;

public class StringComparison5 {

	public static void main(String[] args) {
	String s1="Ram";
	String s2=s1;
	String s3="Sita";
	
	String s4=s1.concat(s3);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	if(s1==s2) {
		System.out.println("References are same");
	}else {
		System.out.println("References are Different");
	}
     if(s1.equals(s2)) {
    	 System.out.println("String data Are Equal");
    }else {
    	 System.out.println("String data are Unequal");
    }
     
     System.out.println("---Concatination String---");
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
