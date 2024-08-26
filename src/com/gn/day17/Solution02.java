package com.gn.day17;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {
	// Given Integer n, Integer array numlist
	// Delete numbers in numlist
	// which is not a multiple of number n
	
	
    public int[] solution02(int n, int[] numlist) {
    	
    	int length = 0;
        for(int i : numlist) {
        	if(i % n == 0) {
        		length ++;
        	}
        }
        
        int[] answer = new int[length];
        int temp = 0;
        
        for(int i : numlist) {
        	if(i % n == 0) {
        		answer[temp] = i;
        		temp++;
        	}
        }

        return answer;
    }
    
    public List solution01(int n, int[] numlist) {

        List<Integer> answer = new ArrayList<Integer>();

        for(int num : numlist){
            if(num % n == 0){
                answer.add(num);
            }
        }

        return answer;
    }
}
