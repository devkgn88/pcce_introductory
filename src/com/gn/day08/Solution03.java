package com.gn.day08;

import java.util.Arrays;

public class Solution03 {
	// Surgeon Cheolsu tries to determine the order of treatment
	// based on the level of emergency of patients who come to the emergency room.
	// When the Integer array emergency is given as a parameter,
	// complete the solution function 
	// so that it returns an array 
	// that determines the order of treatment in descending order of emergency
	
	public int[] solution01(int[] emergency) {
		// 1. emergency랑 똑같 값을 가진 배열 arr 생성
		int len = emergency.length;
		int[] arr = new int[len];
		for(int i = 0 ; i < len ; i++) {
			arr[i] = emergency[i];
		}
		// 2. arr를 내림차순 정렬
		for(int i = 0 ; i < len-1 ; i++) {
			for(int j = i; j < len ; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int[] answer = new int[len];
		// 3. 두개의 배열 비교
		for(int i = 0 ; i < len ; i++) {
			for(int j = 0 ; j < len ; j++) {
				if(emergency[i] == arr[j]) {
					answer[i] = j+1;
				}
			}
		}
		return answer;
	}
	
	public int[] solution02(int[] emergency) {
		int len = emergency.length;
		int[] answer = new int[len];
		// 나보다 더 높은 숫자인 얘가 있다는 건 내 순위가 내려가야 한다는 뜻
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (emergency[i] < emergency[j]) {
					answer[i]++;
				}
			}
			answer[i]++;
		}
		return answer;
	}


}
