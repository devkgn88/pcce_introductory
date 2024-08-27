package com.gn.day03;

public class Solution01 {
	public int solution01(int num1, int num2) {
		int answer = -1;
		answer = num1 % num2;
		return answer;
	}
	
	public int solution02(int num1, int num2) {
		return num1 % num2;
	}
	
	public int solution03(int num1, int num2) {
		while(num1 >= num2) {
			num1 = num1 - num2;
		}
		int answer = num1;
		return answer;
	}


}
