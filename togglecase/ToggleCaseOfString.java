package com.kn.togglecase;

public class ToggleCaseOfString {
  
	public String changingCaseofString(String inputString) {
		
		
		char []crr=inputString.toCharArray();
		for(int i=0;i<crr.length;i++) {
			if(crr[i]>=(char)65&& crr[i]<=(char)90) 
			{
				crr[i]=(char)(crr[i]+32);
			}else if(crr[i]>=(char)97&& crr[i]<=(char)122)
			{
				crr[i]=(char)(crr[i]-32);
			}
		}
		StringBuffer bufferedstring=new StringBuffer();
		for(char c:crr) {
			bufferedstring.append(c);
		}
		return bufferedstring.toString();
	}
}
