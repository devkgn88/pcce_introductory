package com.gn.day04;

public class Solution02 {
	public int solution01(int n) {
		int a = 1; 
		while(a*6 % n != 0) a++;
		return a;
	}
	
	public int solution02(int n) {
		int answer = 1;
		while(true){
			if(answer*6%n==0) break;
			answer++;
		}
		return answer;
	}
	
	public int solution03(int n) {
		int a = n;
		int b = 6;
	    int temp = 0;
	    while(b != 0) {
	        temp = a % b;
	        a = b;
	        b = temp;
	    }
	    return n/a;
	}


}
