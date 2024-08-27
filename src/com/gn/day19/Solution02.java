package com.gn.day19;

public class Solution02 {
	// When the strings my_str and n are given as parameters
	// complete the solution function
	// to return an array that cuts my_str
	// by length n and stores it.
    public String[] solution01(String my_str, int n) {
        String[] arr = my_str.split("");
        
        int leng = arr.length;
        int result = (leng / n) + (leng %n != 0 ? 0 : 1);
        
        String[] answer = new String[leng];
        
        int idx = 0;
        for(int i = 0 ; i < result ; i++) {
        	String temp = "";
        	for(int j = 0 ; j < n ; j++) {
        		temp += arr[j+(idx*n)];
        		System.out.println(j+(idx*n));
        	}
        	System.out.println(temp);
        	answer[idx] = temp;
        	idx++;
        }
        
        return answer;
    }
}
