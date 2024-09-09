package com.gn.day07;

public class Solution03 {
	// Our lamb skewer restaurant provides one free drink for every 10 servings
	// Lamb skewers cost 12,000 won per person
	// and drinks cost 2,000 won
	// When Integers n and k are given as parameters
	// complete the solution function to return the total amount
	// you have to pay if you eat n portions of lamb skewers and k drinks
	
	// case 1 : 0.03 -> 0.03
	// case 2 : 0.04 -> 0.02
	// case 3 : 0.03 -> 0.02
	// case 4 : 0.02 -> 0.02
	// case 5 : 0.02 -> 0.02
	// case 6 : 0.02 -> 0.02
	// case 7 : 0.03 -> 0.03
	
	public int solution01(int n, int k) {
		int answer = 0;
		
		int sheep = n;
		int coke = k - (n/10);
		
		answer = 12000 * sheep + 2000 * coke;
		return answer;
	}
	
	public int solution02(int n, int k) {
		return 12000 * n + 2000 * (k - (n/10));
	}

}
