package com.gn.day24;

public class Solution02 {
	// When two strings bin1 and bin2
	// ,which represent binary numbers
	// ,are given as parameters
	// ,complete the solution function to return the sum of the two binary numbers
	// case 1 : 0.03ms -> 10.40ms
	// case 2 : 0.04ms -> 13.27ms
	// case 3 : 0.03ms -> 13.90ms
	// case 4 : 0.04ms -> 13.49ms
	// case 5 : 0.04ms -> 5.70ms
	// case 6 : 0.03ms -> 13.63ms
	// case 7 : 0.04ms -> 13.10ms
	// case 8 : 0.05ms -> 11.89ms
	// case 9 : 0.02ms -> 16.11ms
	
    public String solution01(String bin1, String bin2) { 
        return Integer.toBinaryString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2));
    }
    
    public String solution02(String bin1, String bin2) {
    	String answer = "";
    	int num1 = 0 , num2 = 0;
    	
    	for(int i = bin1.length()-1, cnt = 1 ; i >= 0 ; i--, cnt*=2) {
    		num1 += Integer.parseInt(bin1.charAt(i)+"")*cnt;
    	}
    	
    	for(int i = bin2.length()-1, cnt = 1 ; i >= 0 ; i--, cnt*=2) {
    		num2 += Integer.parseInt(bin2.charAt(i)+"")*cnt;
    	}
    	
    	int sum = num1 + num2;
    	while(sum >= 1) {
    		answer = sum %2 + answer;
    		sum /= 2;
    	}
    	
    	return answer.equals("") ? "0" : answer;
    }
}
