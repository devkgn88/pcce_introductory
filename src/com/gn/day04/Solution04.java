package com.gn.day04;

public class Solution04 {
	public double solution(int[] numbers) {
		double sum = 0;
		for(int num : numbers){
			sum += num;
		}
		return sum/numbers.length;
	}

}
