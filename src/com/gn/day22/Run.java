package com.gn.day22;

public class Run {

	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		s1.solution02(15);
//		s1.solution(15);
//		s1.solution(40);
//		
//		Solution02 s2 = new Solution02();
//		int[][] arr1 = {{1, 4}, 
//		                {9, 2}, 
//		                {3, 8}, 
//		                {11, 6}};
//		System.out.println("arr1");
//		s2.solution02(arr1);
//		int[][] arr2 = {{3, 5}, 
//		                {4, 1}, 
//		                {2, 4}, 
//		                {5, 10}};
//		System.out.println("arr2222222222");
//		s2.solution02(arr2);
		
		Solution03 s3 = new Solution03();
		int[][] lines1 = {{0, 1}, {2, 5}, {3, 9}};
		System.out.println("=== lines1 ===");
//		s3.solution(lines1);
		System.out.println("answer : "+s3.solution01(lines1));
		int[][] lines2 = {{-1, 1}, {1, 3}, {3, 9}};
		System.out.println("=== lines2 ===");
//		s3.solution(lines2);
		System.out.println("answer : "+s3.solution01(lines2));
		int[][] lines3 = {{0, 5}, {3, 9}, {1, 10}};
		System.out.println("=== lines3 ===");
//		s3.solution(lines3);
		System.out.println("answer : "+s3.solution01(lines3));
		
//		Solution04 s4 = new Solution04();
//		s4.solution(7, 20);
//		s4.solution(11, 22);
//		s4.solution(12, 21);
		
	}

}
