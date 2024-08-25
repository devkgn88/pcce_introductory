package com.gn.day02;

public class Solution01 {
	// When given the integer num1 amd num2
	// make solution method
	// to return the value of 
	// divide num1 by num2 
	// and multiply 1000
	public int solution01(int num1, int num2) {
		double answer = 0; 
		answer = (double)num1/num2*1000;
		return (int)answer;
	}
	
    public int solution02(int num1, int num2) {
        return num1 * 1000 / num2;
    }
	

}
