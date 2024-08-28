package com.gn.day03;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {
	// When an integer n is given as a parameter,
	// complete the solution function to return an array
	// containing odd numbers less than n is ascending order

	public int[] solution01(int n) {
		int[] answer = {};
		int len = n % 2 == 0 ? n/2 : n/2+1;
		answer = new int[len];
		int s = 1;
		for(int i = 0 ; i < answer.length ; i++){
			answer[i] = s;
			s += 2;
		}
		return answer;
	} 
	public List<Integer> solution02(int n) {
		List<Integer> answer = new ArrayList<Integer>();
		int i = 1;
		while(i <= n){
			answer.add(i);
			i += 2;
		}
		return answer;
	}

}
