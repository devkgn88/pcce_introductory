package com.gn.day16;

public class Solution03 {
	// my_string is a mathematical expression
	// it goes like this "3 + 5"
	// when parameter my_string is given,
	// make solution method
	// which returns result of the mathmetical expression
	// there are only + and - operations
	// there is no empty space in the start and end of the string
	// there is no number starts with 0
	// there is no wrong expression
    public int solution01(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        for(int i = 0 ; i < arr.length ; i++) {
        	if("+".equals(arr[i]) || "-".equals(arr[i])) {
        		int before = Integer.parseInt(arr[i-1]);
        		int after = Integer.parseInt(arr[i+1]);
        		
        		if("+".equals(arr[i])) arr[i+1] = String.valueOf(before+after);
        		else arr[i+1] = String.valueOf(before-after);
        	}
        }
        answer = Integer.parseInt(arr[arr.length-1]);
        return answer;
    }
    
    public int solution02(String my_string) {
    	int answer = 0; 
    	String[] arr = my_string.split(" ");
    	int oper = 1;
    	for(String s : arr) {
    		if("+".equals(s) || "-".equals(s)) {
    			oper = "+".equals(s) ? 1 : -1;
    		}else {
    			answer += Integer.parseInt(s)*oper;
    		}	
    	}
    	return answer;
    }
}
