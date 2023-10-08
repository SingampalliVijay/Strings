package com.kn.longestword;

public class LongestWord {
	
	public String isLongest(String inputstring) 
	{	
	String []srr=inputstring.split(" ");
	
	String temp="";
	for(String s:srr)
	{
		if(s.length()>temp.length()) 
		{
			temp =s;
		}
	}
//	StringBuffer temp =new StringBuffer();
//	for(String s:srr) {
//		temp=new StringBuffer(s);
//	}
	
		return temp;
		
	}

}
