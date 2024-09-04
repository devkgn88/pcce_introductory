package com.gn.day06;

public class Solution04 {
	// When the string my_string and the integer n are given as parameters
	// complete the solution function to
	// return a string that repeats each character in my_string n times
	public String solution01(String my_string, int n) {
		String answer = "";
		String[] arr = my_string.split("");
		for(int i = 0 ; i < arr.length ;i++){
			answer += arr[i].repeat(n);
		}
		return answer;
	}
	
	public String solution02(String my_string, int n) {
		StringBuilder sb = new StringBuilder();
		String[] arr = my_string.split("");
		for(int i = 0 ; i < arr.length ;i++){
			sb.append(arr[i].repeat(n));
		}
		return sb.toString();
	}
	
//	public String solution(String my_string, int n) {
//		StringBuilder sb = new StringBuilder();
//		for(char c : my_string.toCharArray()){
//			sb.append((c+"").repeat(n));
//		}
//		return sb.toString();
//	}

}
