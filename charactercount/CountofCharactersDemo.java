package com.kn.charactercount;

public class CountofCharactersDemo {
   public int countofCharacters(String s1,char ch) {
	   
	char[] crr=s1.toCharArray();
	 int count =0;
	 for(int i=0;i<crr.length;i++) 
	 {
	   if(crr[i]==ch) 
	   {
	    count++;
	   } 
	 }   
	return count;   
   }
}
