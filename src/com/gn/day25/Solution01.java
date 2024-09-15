package com.gn.day25;

public class Solution01 {
    // In the string "hello", if we move each character
	// one space to the right and move the last character to the front, 
	// we get "ohell".
	// If we define this as pushing a string, 
	// when strings A and B are given as parameters,
	// Complete the solution function so that if A can be pushed to reach B,
	// it returns the minimum number of times it must be pushed, 
	// and if it cannot be pushed to B, it returns -1.
	// 	 solution01 -> solution02
	// test1 : 0.22 -> 1.86
	// test2 : 0.31 -> 1.21
	// test3 : 0.16 -> 1.31
	// test4 : 1.00 -> 1.09
	// test5 : 0.15 -> 1.63
	// test6 : 0.43 -> 1.26
	// test7 : 0.44 -> 1.16
	// test8 : 0.25 -> 1.13
	public int solution01(String A, String B) {
        int answer = -1;
        String[] arr = A.split("");
        int len = A.length();
        String[] brr = new String[B.length()];
        for(int i = 0 ; i < len ; i++) {
        	//System.out.println("=== "+i+" ===");
        	for(int x = 0 ; x < i ; x++) {
        		//System.out.println("brr : "+x+"arr : "+(len-i+x));
        		brr[x] = arr[len-i+x];
        	}
        	for(int y = 0 ; y < len-i ; y++) {
        		brr[i+y] = arr[y];
        		//System.out.println((i+y)+" : "+ y);
        	}
        	// System.out.println(String.join("", brr));
        	if(B.equals(String.join("", brr))) {
        		answer = i;
        		break;
        	}
        }
        
        // 0 1 2 3 4 -> 0 
        // 4 0 1 2 3 -> 1
        // 3 4 0 1 2 -> 2
        // 2 3 4 0 1 -> 3
        // 1 2 3 4 0 -> 4
        
        // 0 1 2 3
        // 3 0 1 2
        // 2 3 0 1
        // 1 2 3 0
        
        System.out.println(answer);
        return answer;
    }
	
	public int solution02(String A, String B) {
		return (B+B).indexOf(A);
	}
	
}
