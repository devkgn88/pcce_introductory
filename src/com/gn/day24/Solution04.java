package com.gn.day24;

public class Solution04 {
	// In the numbers 1 to 13, 1 appears 6 times: 1, 10, 11, 12, and 13.
	// When integers i, j, k are given as parameters
	// Complete the solution function to return how many times k appears from i to j.
    public int solution(int i, int j, int k) {
        String str = "";
        for(int a = i ; a <= j ; a++) {
        	str+= a;
        }
        return str.length()- str.replace(String.valueOf(k), "").length();
    }
}
