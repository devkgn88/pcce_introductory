package com.gn.day18;

public class Solution02 {
	// The Integer that results 
	// when a natural number is squared 
	// is called a square number.
	// Given Integer n as parameter
	// return 1 if n is squared number
	// return 2 if n is not a squared number
	
    
	// caution : do not try to check squared number
	// use square root
	public int solution01(int n) {
        double squareRoot = Math.sqrt(n);
        return squareRoot % 1 == 0 ? 1 : 2;
    }
    
    public int solution02(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
    
}
