 package com.kn.printspaces;

public class PrintSpaces {

	 public String isspace(String s1) {
	
	char []arr=s1.toCharArray();
		
	char[] crr=new char[s1.length()];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				crr[i]=arr[i];
			}
		}
		int j=crr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(crr[i]!=' ') 
			{
				if(crr[j]==' ') 
				{
					j--;
				}
			     crr[j]=arr[i];
			      j--; 
		
		   }
	}
		return new String(crr);
}
}

