package com.gn.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution04 {
	public int solution01(String[] arr1, String[] arr2) {
		int answer = 0; 
		for(String str1 : arr1) {
			for(String str2 : arr2) {
				if(str1.equals(str2)) {
					answer++;
					break;
				}
			}
		}
		return answer;
	}
	
    public int solution02(String[] s1, String[] s2) {
        List<String> list1 = new ArrayList<String>(Arrays.asList(s1));
        List<String> list2 = new ArrayList<String>(Arrays.asList(s2));
        list1.retainAll(list2);
        return list1.size();
    }
}
