package com.gn.day02;

public class Solution03 {
	// Using Euclidean Algorithm
	public int[] solution01(int numer1,int denom1,int numer2,int denom2) {
		int[] answer = new int[2];
		int denom = denom1 * denom2;
		int numer = denom1 * numer2 + denom2 * numer1;
		
		int a = numer;
		int b = denom;
		int temp = 0 ;
		while(b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		answer[0] = numer / a;
		answer[1] = denom / a;
		return answer;
	}	
	
	public int[] solution02(int numer1,int denom1,int numer2,int denom2) {
		int denom = denom1 * denom2;
		int numer = denom1 * numer2 + denom2 * numer1;
		int gcd = gcd02(numer,denom);
		return new int[]{numer/gcd , denom/gcd};
	}
	
	public int gcd02(int a, int b) {
		int temp = 0;
		while(b != 0) {
			temp = a % b;
			a = b; 
			b = temp;
		}
		return a;
	}
	
	public int[] solution03(int numer1,int denom1,int numer2,int denom2) {
		int denom = denom1 * denom2;
		int numer = denom1 * numer2 + denom2 * numer1;
		int gcd = gcd03(numer,denom);
		return new int[]{numer/gcd , denom/gcd};
	}
	
	public int gcd03(int a, int b) {
		if(a % b == 0) return b;
		else return gcd03(b,a% b);
	}
	
	
}
