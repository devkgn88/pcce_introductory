package com.gn.day04;

public class Solution03 {
	// The pizzeria cuts the pizza into
	// the desired number of slices, from 2 to 10
	// When the number of pizza slices slice
	// and the number n of people eating pizza are given as parameters
	// complete the solution function 
	// to return the minimum number of pizzas
	// that must be ordered for n people to eat at least
	// one slice of pizza
	public int solution01(int slice, int n) {
		int answer = 1;
		while(slice * answer < n){
			answer++;
		}
		return answer;
	}
	
	public int solution(int slice,int n) {
		return n % slice > 0 ? n / slice +1 : n / slice;
	}


}
