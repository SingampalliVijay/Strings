 package com.kn.countofstring;

public class CountofChar {

	public void iscount(String inputstring) {
	char[] crr=inputstring.toCharArray();
	int UCvowelcount=0, UCconsonantcount=0;
	int LCvowelcount=0, LCconsonantcount=0;
	int digitcount=0,spacecount=0,count=0;
	
	for(int i=0;i<crr.length;i++) {
		if(crr[i]>=(char)65 && crr[i]<=(char)90) {
			if(crr[i]=='A' || crr[i]=='E'|| crr[i]=='I'|| crr[i]=='O'|| crr[i]=='U') {
			UCvowelcount++;
		}else {
			UCconsonantcount++;
		}
	}else if(crr[i]>=(char)97 && crr[i]<=(char)122){
		if(crr[i]=='a' || crr[i]=='e'|| crr[i]=='i'|| crr[i]=='o'|| crr[i]=='u') {
			LCvowelcount++;
		}else {
			LCconsonantcount++;
		}
	}else if(crr[i]>=48 && crr[i]<=57) {
			digitcount++;
	}else if(crr[i]==32) {
			spacecount++;
	}else {
			count++;
		}
		
	}
	System.out.println("Uppercase Vowel :"+UCvowelcount);
	System.out.println("Uppercase Consonant :"+UCconsonantcount);
	System.out.println("Lowercase Vowel :"+LCvowelcount);
	System.out.println("Lowercase Consonant :"+LCconsonantcount);
	System.out.println("Digits :"+digitcount);
	System.out.println("Spaces :"+spacecount);
	System.out.println("Specail Case :"+count);
	
		
	}

}
