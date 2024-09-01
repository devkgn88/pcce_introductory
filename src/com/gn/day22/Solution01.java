package com.gn.day22;

public class Solution01 {
    public int solution01(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i++) {      	
        	answer++;
        	// you can use contains of when you
        	// check that there is a certain word in String
        	while(answer%3 == 0 || String.valueOf(answer).indexOf("3") != -1) {
        		answer ++;
        	}
        }
        return answer;
    }	
    
    public int solution02(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i++) {      	
        	answer ++;
        	if(answer%3 == 0 || String.valueOf(answer).indexOf("3") != -1) {
        		i--;
        	}
        }
        return answer;
    }	
}
