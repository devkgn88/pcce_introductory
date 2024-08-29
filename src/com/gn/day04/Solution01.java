package com.gn.day04;

public class Solution01 {
	public int solution01(int n) {
		int answer = 0;
		if(n % 7 == 0){
			answer = n / 7;
		} else{
			answer = n/7 +1;
		}
		return answer;
	}
	
	public int solution02(int n) {
		int answer = n % 7 == 0 ? n/7 : n/7+1;
		return answer;
	}


}
