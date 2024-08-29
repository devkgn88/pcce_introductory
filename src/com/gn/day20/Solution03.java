package com.gn.day20;

import java.util.Arrays;

public class Solution03 {
	// The Integer Array numbers is given as a parameter
	// Compelete the solution function to return the maximum value
	// that can be created by multiplying two of the elements of numbers
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        for(int i = 0 ; i < numbers.length ; i++) {
        	for(int j = 0 ; j < numbers.length ; j++) {
        		if(i != j && numbers[i]*numbers[j] > answer) {
        			answer = numbers[i]*numbers[j]; 
        		}
        	}
        }
        return answer;
    }
    
    // do not judge code by the length of code
    // solution02 needs about 10 times more time than solution01
    public int solution02(int[] numbers) {
    	Arrays.sort(numbers);
    	int leng = numbers.length;
    	return Math.max(numbers[0]*numbers[1], numbers[leng-2]*numbers[leng-1]);
    }
}
