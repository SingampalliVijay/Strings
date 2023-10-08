package com.kn.duplicatestring;

public class DuplicateString 
{ 
	public void isduplicate(String inputstring) 
	{
		char[] crr=inputstring.toCharArray();
		System.out.println("Duplicates in the Given String Are :");
		for(int i=0;i<crr.length;i++) 
		{
			int count=0;
			for(int j=i+1;j<crr.length;j++) 
			{
				if(crr[i]==crr[j]) 
				{
					count++;
				}	
			}
			if(count==1) {
				System.out.println(crr[i]);
			}
		}	
	}
}
