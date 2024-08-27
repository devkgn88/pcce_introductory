package com.gn.day18;

import java.util.Arrays;

public class Solution04 {
	// When a string my_string consisting of 
	// upper and lower case English letters
	// is given ad a parameter,
	// complete the solution function
	// to change my_string to all lowercase letters
	// and return a string sorted in alphabetical order
	
	// Don't forget that String is essentially
	// an array of characters.
    public String solution01(String my_string) {
        String answer = my_string.toLowerCase();
        char[] arr = answer.toCharArray();
        for(int i = 0 ; i < arr.length-1 ; i++) {
        	for(int j = i+1 ; j < arr.length ; j++) {
        		if(arr[i] > arr[j]) {
        			char temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
        return new String(arr);
    }
    
    public String solution02(String my_string) {
    	char[] arr = my_string.toLowerCase().toCharArray();
    	Arrays.sort(arr);
    	return new String(arr);
    }
}
