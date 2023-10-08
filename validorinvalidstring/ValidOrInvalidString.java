package com.kn.validorinvalidstring;

public class ValidOrInvalidString {

	public boolean validOrInvalid(String s1) {
	
	int paranthesis=0;
	int curly=0;
	int square=0;
	char []crr=s1.toCharArray();
	for(int i=0;i<crr.length;i++) {
		if(crr[i]=='(') {
			paranthesis++;
		}else if(crr[i]==')') {
			paranthesis--;
		}else if(crr[i]=='{') {
			curly++;
		}else if(crr[i]=='}') {
			curly--;
		}else if(crr[i]=='[') {
			square++;
		}else if(crr[i]==']') {
			square--;
		}
	}
    if(paranthesis==0 && curly ==0 && square==0) {
		
		return true;
    }
//	}else {
//		System.out.println("Invalid String");
//	//	return false;
//	}
		return false;
	}

}
