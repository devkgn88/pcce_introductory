package com.gn.day24;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {
	// When Strings "before" and "after" are given as parameters,
	// complete the solution function
	// to return 1 if you can change the order of "before" to create "after"
	// and return 0 if you cannot
    public int solution01(String before, String after) {
//    	String[] arr = before.split("");
//    	for(int i = 0; i < arr.length ; i++) {
//    		StringBuilder sb = new StringBuilder();
//    		for(String str : after.split("")) {
//    			sb.append(str);
//    		}
//    		int idx = after.indexOf(arr[i]);
//    		if(idx != -1) sb.deleteCharAt(idx);
//    		after = sb.toString();
//    	}
//    	System.out.println(after.equals(""));
//        return after.equals("") ? 1 : 0;
    	
    	for(String b_str : before.split("")) {
    		StringBuilder sb = new StringBuilder();
    		for(String a_str : after.split("")) {
    			sb.append(a_str);
    		}
    		int idx = after.indexOf(b_str);
    		if(idx != -1) sb.deleteCharAt(idx);
    		after = sb.toString();
    	}
    	return after.equals("") ? 1 : 0;
    }
    
    public int solution(String before, String after) {
    	for(String b_str : before.split("")) {
    		after = after.replaceFirst(b_str, "");
    	}
    	return after.equals("")?1:0;
    }
}
