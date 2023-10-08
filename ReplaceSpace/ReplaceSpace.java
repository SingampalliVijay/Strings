package com.kn.ReplaceSpace;

public class ReplaceSpace {
    public String replaceSpace(String inputString) {
    	
    	StringBuffer outputString=new StringBuffer(inputString);
    	for(int i=0;i<outputString.length();i++) {
    	if(inputString.charAt(i) ==' ') {
    		outputString.setCharAt(i, '$');	
    	}
    	}
		return outputString.toString();	
    }
}
