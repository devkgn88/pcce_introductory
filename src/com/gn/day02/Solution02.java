package com.gn.day02;

public class Solution02 {
	// compare two number
	// if two numbers are same -> return 1
	// different -> return -1
	public int solution01(int num1, int num2) {
		int answer = -1;
		if(num1 == num2) answer = 1;
		return answer;
	}
	
	public int solution02(int num1, int num2) {
		return num1 == num2 ? 1 : -1;
	}

}
