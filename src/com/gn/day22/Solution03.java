package com.gn.day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution03 {
	// Three line segments lie parallel
	// When a two-dimensional array lines
	// containing the start and end coordinates of three line segments in the form
	// [[start, end], [start, end], [start, end]] is given as a parameter,
	// Complete the solution function to return 
	// the length of the area where two or more line segments overlap.
	
	public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < lines[i].length ; i++) {
        	for(int j = lines[i][0] ; j <= lines[i][1] ; j++) {
        		map.put(j, map.getOrDefault(j, 0)+1);
        	}
        }
        
        List<Integer> keySet = new ArrayList<Integer>(map.keySet());
        
        Collections.sort(keySet);
        
        for (int n : map.keySet()) {
            System.out.println(n);
        }
        
        return answer;
    }
}
