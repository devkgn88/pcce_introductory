package com.gn.day20;

public class Run {
	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		s1.solution(new int[][] {{1,1},{2,1},{2,2},{1,2}});
		s1.solution(new int[][] {{-1,-1},{1,1},{1,-1},{-1,1}});
		
		Solution02 s2 = new Solution02();
		s2.solution01(new String[] {"left", "right", "up", "right", "right"}, 
				new int[] {11,11});
		s2.solution02(new String[] {"down", "down", "down", "down", "down"}, 
				new int[] {7,9});
		
	}
}
