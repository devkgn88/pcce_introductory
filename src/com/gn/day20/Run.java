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
		
		Solution03 s3 = new Solution03();
		s3.solution02(new int[] {1, 2, -3, 4, -5});//15
		s3.solution02(new int[] {0, -31, 24, 10, 1, 9});//240
		s3.solution02(new int[] {10, 20, 30, 5, 5, 20, 5});//600
		
		
	}
}
