package com.gn.day02;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {
	public int[] solution01(int[] numbers) {
		int[] answer = new int[numbers.length];
		for(int i = 0 ; i < answer.length ; i++){
			answer[i] = numbers[i] * 2;
		}
		return answer;
	}
	
	public List solution02(int[] numbers) {
		List<Integer> result = new ArrayList<Integer>();
		for(int num : numbers) {
			result.add(num*2);
		}
		return result;
	}

}
