package com.gn.day17;

public class Solution03 {
    public int solution01(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] arr = str.split("");
        for(String s : arr) {
        	answer += Integer.parseInt(s);
        }
        return answer;
    }
    
    public int solution02(int n) {
    	int answer = 0 ;
    	while(n > 0) {
    		answer += n % 10;
    		n /= 10;
    	}
    	return answer;
    }
}
