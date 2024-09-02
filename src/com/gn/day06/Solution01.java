package com.gn.day06;

public class Solution01 {
	public String solution01(String my_string) {
		String[] arr = my_string.split("");
		String[] reverseArr = new String[arr.length];
		for(int i = arr.length-1,j=0 ; i >= 0 ; i--, j++){
		reverseArr[j] = arr[i];
		}
		return String.join("",reverseArr);
	}
	
	public String solution02(String my_string) {
		StringBuilder sb = new StringBuilder();
		sb.append(my_string);
		sb.reverse();
		return sb.toString();
	}


}
