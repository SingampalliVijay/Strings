package com.kn.ceasercipher;

public class CeaserCipher {

	public String isCipher(String s1,int n) {
		while(n>26) {
			n=n-26;
		}
		char[] crr=s1.toCharArray();
		for(int i=0;i<crr.length;i++) 
		{
			if(crr[i]>=65 && crr[i]<=90-n ||crr[i]>=97 && crr[i]<=122-n) 
			{
			   crr[i]=(char)(crr[i]+n);	
				}else {
				crr[i]=(char)(crr[i]+n-26);
		      }
		 }
	   
		StringBuffer sb=new StringBuffer();
		for(char c: crr) {
			sb.append(c);
		}
		return sb.toString();	
	}
}
