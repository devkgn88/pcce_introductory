package com.gn.day05;

import java.util.*;

public class Solution04 {
	public int[] solution01(int[] num_list) {
		int[] arr = new int[num_list.length];
		for(int i = num_list.length-1,j=0 ; i >= 0 ; i--,j++){
			arr[j] = num_list[i];
		}
		return arr;
	}
	
	public List<Integer> solution02(int[] num_list) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int num : num_list) {
			list.add(num);
		}
		Collections.reverse(list);
		return list;
	}

}
