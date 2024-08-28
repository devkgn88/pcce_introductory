package com.gn.day03;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {
	public int solution01(int[] array) {
		int answer = 0;
		int[] numArr = new int[1000];
		for(int i = 0 ; i < array.length ; i++){
			int n = array[i];
			numArr[n]++;
		}
		int max = 0;
		int maxNum = 0; 
		for(int i = 0 ; i < numArr.length ; i++){
			if(numArr[i] > max){
				max = numArr[i];
				maxNum = i;
			}
		}
		int n = 0; 
		for(int i = 0 ; i < numArr.length ; i++){
			if(numArr[i] == max){n++;}
		}
		if(n == 1){
			answer = maxNum;
		} else{
			answer = -1;
		}
		return answer;
	}
	
	public int solution02(int[] array) {
		int answer = 0 ; 
		int maxCount = 0; 
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < array.length ; i++) {
			int count = map.containsKey(array[i])?map.get(array[i])+1 : 1;
			if(count > maxCount) {
				maxCount = count;
				answer = array[i];
			} else if(count == maxCount) {
				answer = -1;
			}
			map.put(array[i],count);
		}
		return answer;
	}

}
