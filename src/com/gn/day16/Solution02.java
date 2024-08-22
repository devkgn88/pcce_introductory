package com.gn.day16;

import java.util.Arrays;

public class Solution02 {
    public int[] solution01(int[] array) {
        int[] origin = new int[array.length];
        int[] answer = new int[2];
        // 깊은 복사
        for(int i = 0 ; i < array.length ; i++) {
        	origin[i] = array[i];
        }
        
        Arrays.sort(array);
        
        int max = array[array.length-1];
        
        answer[0] = array[array.length-1];
        
        for(int i = 0 ; i < origin.length ; i++) {
        	if(max == origin[i]) {
        		answer[1] = i;
        	}
        }

        return answer;
    }
    
    public int[] solution02(int[] array) {
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
