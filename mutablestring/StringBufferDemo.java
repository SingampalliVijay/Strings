package com.kn.mutablestring;

public class StringBufferDemo {

	public static void main(String[] args) {
	
		
	StringBuffer sb1=new StringBuffer("Ram");
	
	System.out.println("Data ="+sb1);
	System.out.println("Length ="+sb1.length());
	System.out.println("Capacity ="+sb1.capacity());
	
	System.out.println("*****");
	sb1.append("Sita");
	System.out.println("Data ="+sb1);
	System.out.println("Length ="+sb1.length());
	System.out.println("Capacity ="+sb1.capacity());
	
	System.out.println("-----");
	sb1.append(" Sita");
	System.out.println("Data ="+sb1);
	System.out.println("Length ="+sb1.length());
	System.out.println("Capacity ="+sb1.capacity());
	
	System.out.println("~~~~~");
	sb1.append(" Sita ");
	System.out.println("Data ="+sb1);
	System.out.println("Length ="+sb1.length());
	System.out.println("Capacity ="+sb1.capacity());
	
	System.out.println(" ");
    sb1.append("Ram");
	System.out.println("Data ="+sb1);
	System.out.println("Length ="+sb1.length());
	System.out.println("Capacity ="+sb1.capacity());
	}

}
