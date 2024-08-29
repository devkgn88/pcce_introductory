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
		
		Solution04 s4 = new Solution04();
		s4.solution01("3x + 7 + x"); // 4x+7
		s4.solution01("x + x + x"); // 3x
		s4.solution01("10x");
		s4.solution01("7x + 4 + 9 + 5x");
		s4.solution01("x");
		s4.solution01("10x + 20x");
		s4.solution01("x + 1");
		s4.solution01("11x + 22x + 33x");
		s4.solution01("1 + 3 + 4");
		s4.solution01("1");
		s4.solution01("7x + 4 + 9 + 5x");
		s4.solution01("99x + x");
		s4.solution01("x + 12x + 1 + 99");
		s4.solution01("x + 1 + 1 + x + 1 + 1");
		s4.solution01("2x + x + 99");
		s4.solution01("3 + x");
		s4.solution01("13");
		s4.solution01("x + 11 + 12x");
	}
}
