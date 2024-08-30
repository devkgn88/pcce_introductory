package com.gn.day05;

public class Solution02 {
	public int[] solution01(int money) {
		int[] answer = new int[2];
		answer[0] = money / 5500;
		answer[1] = money % 5500;
		return answer;
	}
	
	public int[] solution02(int money) {
		return new int[]{money / 5500,money % 5500};
	}
}
