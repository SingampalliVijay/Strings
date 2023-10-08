package com.kn.anagramstring;

public class AnagramString {
  
	public boolean isAnagram(String s1,String s2) 
	{
	boolean isanagram=false;
	if(s1.length()==s2.length()) 
	  {
		char[] crr1=s1.toCharArray();
		char[] crr2=s2.toCharArray();
		
		crr1=sortCharacterArray(crr1);
		crr2=sortCharacterArray(crr2);
		
		for(int i=0;i<crr1.length;i++) {
			if(crr1[i]==crr2[i]) {
				isanagram=true;
			}else {
				isanagram=false;
				break;
			}
		}
		
	  }
	return isanagram;
	}
	   
	char[] sortCharacterArray(char[] crr){
	 for(int i=0;i<crr.length;i++)
	 {
	  boolean isswapped=false;
	 for(int j=0;j<crr.length-1-i;j++) 
		{
			   if(crr[j]>crr[j+1]) 
			       {
					char temp=crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;
					isswapped=true;
				   }
		}
			if(isswapped=false)
			{
			  break;
			}
	}
	return crr;
	}
	
}