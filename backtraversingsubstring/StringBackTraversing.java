package com.kn.backtraversingsubstring;

public class StringBackTraversing {
  public void wordBackTraversing(String inputString) {
	  String[] srr=inputString.split(" ");
	  for(int i=0;i<srr.length;i++) 
	  {
		  char[] crr=srr[i].toCharArray();
		  for(int j=crr.length-1;j>=0;j--) 
		  {
			  System.out.print(crr[j]);
		  }
		  System.out.println(" ");
	  }
	  
  }
}
