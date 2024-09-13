package com.gn.day08;

import java.util.Arrays;

public class Solution01 {
	// When the integer array numbers
	// and integers num1 and num2 are given as parameters
	// complete the solution function to return an integer array
	// cut from the num1th index to the num2th index of numbers
	public int[] solution01(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2-num1+1];
		for(int i = num1, j=0 ; i <= num2 ; i++, j++){
			answer[j] = numbers[i];
		}
		return answer;
	}
	
	public int[] solution02(int[] numbers, int num1, int num2) {
		return Arrays.copyOfRange(numbers,num1,num2+1);
	}


}
