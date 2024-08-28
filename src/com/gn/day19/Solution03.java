package com.gn.day19;

public class Solution03 {
	// When an array containing integers
	// and an integer n are given as parameters
	// complete the solution function
	// to return how many n are in the array
	public int solution01(int[] array, int n) {
        int answer = 0;
        for(int i : array) {
        	if(n == i) answer ++;
        }
        return answer;
    }
	
	public int solution02(int[] array, int n) {
        int answer = 0;
        for(int i : array) {
        	answer += n==i ? 1 : 0; 
        }
        return answer;
    }
}
