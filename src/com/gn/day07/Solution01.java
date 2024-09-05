package com.gn.day07;

public class Solution01 {
	// The String Type my_string and the letter are given as parameters
	// Complete the solution function to return a string with the letter removed from my_string
	// 0.201
	public String solution01(String my_string, String letter) {
		StringBuilder sb = new StringBuilder();
		for(String s : my_string.split("")){
			if(!s.equals(letter)) sb.append(s);
		}
		return sb.toString();
	}
	// 0.0905
	public String solution02(String my_string, String letter) {
		StringBuilder sb = new StringBuilder();
		for(String s : my_string.split(letter)){
			sb.append(s);
		}
		return sb.toString();
	}
	
	// 0.0325
	public String solution03(String my_string, String letter) {
		return my_string.replace(letter,"");
	}

}
