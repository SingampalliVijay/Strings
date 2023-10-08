package com.kn.occurancecount;

public class CountOccuranceOfCharacter {
    
	public void countCharacters(String inputstring) {
		
		char []crr=inputstring.toCharArray();
		
		
		crr=sortArray(crr);
		int count=1;
		for(int i=0;i<crr.length-1;i++) 
		{
			if(crr[i]==crr[i+1]) 
			{
			  count++;
			}else
			{
			System.out.println(crr[i]+" is :"+count);
			count=1;
			}if(i+1==crr.length-1)
			{
			System.out.println(crr[i+1]+" is ="+count);
			}
	    }
	}

	  char[] sortArray(char[] crr) {
		  for(int i=0;i<crr.length;i++) {
				for(int j=0;j<crr.length-1-i;j++) {
					if(crr[j]>crr[j+1]) {
						char temp=crr[j];
						crr[j]=crr[j+1];
						crr[j+1]=temp;
					}
				}
			}
		return crr;
		
	}
}
