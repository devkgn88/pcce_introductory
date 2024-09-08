package com.gn.day22;

import java.nio.file.spi.FileSystemProvider;

public class Solution04 {
	
	// The decimal numbers continue and the decimal point,
	// which is the decimal point, is considered decimal
	// When converting a fraction to decimal
	// you want to determine whether the fraction can be expressed as a finite decimal number
	// The conditions for a fraction to become a finite decimal number are as follows.
	// When expressed as an irreducible fraction,
	// the only prime factors in the denominator must be 2 and 5
	// When two integers a and b are given as parameters
	// Complete the solution function so that it returns 1 if a/b is a finite decimal number
	// and 2 if it is an infinite decimal numbers.
	
    public int solution(int numer, int denom) {
        int answer = 0;
        
        int a = numer;
        int b = denom;
        int temp = 0;
        while(b!=0) {
        	temp = a % b;
        	a = b;
        	b = temp;
        }
        
        answer = denom/a;
        int result = 1; 
        //System.out.println("===="+answer+"====");
        for(int i = 2 ; i <= answer ;i++) {
        	while(answer % i == 0) {
        		if(!(i ==2 || i == 5)) result = 2;
        		//System.out.println(i);
        		answer /= i; 
        	}
        }
        System.out.println(result);
        return result;
    }
}
