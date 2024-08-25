package com.gn.day01;

public class Solution02 {
	// Difference between two number
	// When given the integer num1 amd num2
	// make solution method
	// to return the value of num1 minus num2
	public int solution01(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }
	
	public int solution02(int num1, int num2) {
		return num1-num2;
		
	}
	
	public int solution03(int num1, int num2) {
       int answer = 0;
       if((-50000 <= num1 && num1 <= 50000) && (-50000 <= num1 && num1 <= 50000)) {
    	   answer = num1 - num2;
	   }
        return answer;
	}
	
	
	
}
