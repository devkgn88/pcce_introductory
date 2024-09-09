package com.gn.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution03 {
	// Three line segments lie parallel
	// When a two-dimensional array lines
	// containing the start and end coordinates of three line segments in the form
	// [[start, end], [start, end], [start, end]] is given as a parameter,
	// Complete the solution function to return 
	// the length of the area where two or more line segments overlap.
	
//	public int solution(int[][] lines) {
//		List<List<Integer>> result = new ArrayList<List<Integer>>();
//		
//		for(int i = 0 ; i < lines.length ; i++) {
//			List<Integer> line = new ArrayList<Integer>();
//			for(int j = lines[i][0] ; j <= lines[i][1] ; j++) {
//				line.add(j);
//			}
//			result.add(line);
//		}
//		
//		for(int i = 0 ; i < result.size() ; i++) {
//			for(int j = 0 ; j < result.get(i).size() ; j++) {
//				
//			}
//		}
		
//		List<Integer> matchList1 = result.get(0).stream().filter(o -> result.get(1).stream()
//				.anyMatch(Predicate.isEqual(o))).collect(Collectors.toList());
//		
//		List<Integer> matchList2 = result.get(0).stream().filter(o -> result.get(2).stream()
//				.anyMatch(Predicate.isEqual(o))).collect(Collectors.toList());
//		
//		List<Integer> matchList3 = result.get(1).stream().filter(o -> result.get(2).stream()
//				.anyMatch(Predicate.isEqual(o))).collect(Collectors.toList());
//		
//		System.out.println(matchList1);
//		System.out.println(matchList2);
//		System.out.println(matchList3);
		
		
//		return 0;
		
		
//        int answer = 0;
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i = 0 ; i < lines.length ; i++) {
//        	for(int j = lines[i][0] ; j <= lines[i][1] ; j++) {
//        		map.put(j, map.getOrDefault(j, 0)+1);
//        	}
//        }
//        
//        List<Integer> keySet = new ArrayList<Integer>(map.keySet());
//        
//        Collections.sort(keySet);
//        
//        Integer start = null;
//        Integer end = null;
//        
//        return answer == 2 ? 0 : answer -1;
//    }
	
	public int solution(int[][] lines) {
		int answer = 0 ; 
		List<List<Integer>> allList = new ArrayList<List<Integer>>();
		for(int i = 0 ; i < lines.length ; i++) {
//			for(int j = 0 ; j < lines.length ; j++) {
//				if(i != j) {
//					
//				}
//			}
			List<Integer> list = new ArrayList<Integer>();
			for(int j = lines[i][0] ; j <= lines[i][1] ; j++) {
				//System.out.print(j+", ");
				list.add(j);
			}
			System.out.println(list);
			allList.add(list);
		}
		
		
		
		return answer;
		
	}
}
