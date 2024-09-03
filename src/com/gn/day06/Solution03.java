package com.gn.day06;

public class Solution03 {
	public int[] solution01(int[] num_list) {
		int[] answer = new int[2];
		for(int num : num_list){
			if(num % 2 == 0) answer[0]++;
			else answer[1]++; 
		}
		return answer;
	}
	
	public int[] solution02(int[] num_list) {
		int[] answer = new int[2];
		for(int i = 0 ; i < num_list.length ;i++){
			answer[num_list[i] % 2]++;
		}
		return answer;
	}


}
