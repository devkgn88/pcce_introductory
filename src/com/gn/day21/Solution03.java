package com.gn.day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution03 {
	// To create a triangle with three line segments
	// the following conditions must be met
	// The length of the longest side must be
	// less than the sum of the lengths of the other two sides
	// The array sides containing the lengths of the two sides of the triangle
	// is given as a parameter
	// Complete the solution function so that
	// it returns the number of integers
	// that can be the resmaining side
	
    public int solution01(int[] sides) {
        int answer = 0;
        // the longest segment length < add two other segments
        List<Integer> list = new ArrayList<Integer>();
        list.add(sides[0]);
        list.add(sides[1]);
        
        for(int i = 1 ; i < sides[0]+sides[1] ; i++) {
        	list.add(i);
        	int sum = 0 ;
        	for(int var : list) {
        		sum += var;
        	}
        	int max = Collections.max(list);
        	if(max < sum-max) {
        		answer ++;
        	}
        	list.remove(2);
        }
        // max - min + 1 <= segment <= max + min-1
        
        // 2 <= third segment <=2
        // 1,2,1 -> 2 < 2 (x)
        // 1,2,2 -> 2 < 1+2 (o)
        // 1,2,3 -> 3 < 1+2 (x)
        // 1,2,4 -> 4 < 1+2 (x) 
        
        // 4 <= third segment <= 8
        // 3,6,1 -> 6 < 1+3 (x)
        // 3,6,2 -> 6 < 3+2 (x)
        // 3,6,3 -> 6 < 3+3 (x)
        // 3,6,4 -> 6 < 3+4 (o)
        // 3,6,5 -> 6 < 3+5 (o)
        // 3,6,6 -> 6 < 3+6 (o)
        // 3,6,7 -> 7 < 3+6 (o)
        // 3,6,8 -> 8 < 3+6 (o)
        // 3,6,9 -> 9 < 3+6 (x)
        
        // 5 <= third <= 17
        // 11,7,1 -> x
        // 2 x, 3 x, 4 x, 5 o,
        // 6 o, 7 o, 8 o, 9 o
        // 10, 11, 12,13,14,15,16,17

        return answer;
    }
    
	public int solution02(int[] sides) {
        int answer = 0;
        // int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        // max - min + 1 <= segment <= max + min-1
        // right - left + 1
        // max + min - 1 - (max - min +1) +1
        // max + min -1 - max + min -1 +1
        // 2*min -1
        
        answer += 2 * min - 1;

        return answer;
	}
}
