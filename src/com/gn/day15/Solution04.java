package com.gn.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution04 {
	// 정수 n이 매개변수로 주어질 때
	// n의 약수를 오름차순으로 담은 배열을 return
    public int[] solution01(int n) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1 ; i <= n ; i++) {
        	if(n % i == 0) {
        		list.add(i);
        	}
        }
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++) {
        	answer[i] = list.get(i);
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
    
    public int[] solution02(int n) {
    	int[] answer = new int[n];
    	int cnt = 0;
    	for(int i = 1 ; i <= n ; i++) {
    		if(n%i == 0) {
    			cnt++;
    		}
    	}
    	
    	answer = new int[cnt];
    	
    	cnt = 0 ;
    	for(int i = 1; i <= n ; i++) {
    		if(n % i == 0) {
    			answer[cnt] = i;
    			System.out.println(answer[cnt]);
    			cnt ++;
    		}
    	}
    	return answer;
    }
}
