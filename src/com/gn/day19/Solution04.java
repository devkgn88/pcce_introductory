package com.gn.day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution04 {
	// When I was at school
	// I was curious about what number 
	// I should stand in line according to my height
	// When an integer array containing the heights of classmates
	// and the height of my height are given as parameters
	// complete the solution function
	// to return the number of people taller than me.
	
    public int solution01(int[] array, int height) {
        int answer = 0;
        for(int i : array) {
            if(i > height) answer++;
        }
        return answer;
    }
	
	public int solution02(int[] array,int height) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int ele : array) {
			list.add(ele);
		}
		list.add(height);
		Collections.sort(list);
		answer = list.size() - ( list.lastIndexOf(height)+1);
		return answer;
	}
	
	public int solution03(int[] array, int height) {
		int[] list = new int[array.length+1];
		list[0] = height;
		for(int i = 0; i < array.length ; i++) {
			list[i+1] = array[i];
		}
		int answer = 0;
		for(int i = 0 ; i < list.length-1 ; i++) {
			for(int j = i ; j < list.length ; j++) {
				if(list[i]>list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < list.length ; i++) {
			if(height == list[i]) {
				answer = list.length -(i+1);
				break;
			}
		}
		return answer;
	}
}
