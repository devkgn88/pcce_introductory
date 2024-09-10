package com.gn.day07;

public class Solution04 {
	public int solution01(int n) {
		int answer = 0;
		for(int i = 2 ; i <= n ; i+= 2){
			answer += i;
		}
		return answer;
	}

	public int solution02(int n) {
		int answer = 0;
		
		if(n%2 == 0) answer = (n/2)*(2+n)/2;
		else answer = ((n-1)/2) * (2+(n-1)) /2;
		
//		if(n%2 != 0) answer = (n-1)*(n+1)/4;
//		else answer = n*(n+2)/4;
		return answer;
	}

}
