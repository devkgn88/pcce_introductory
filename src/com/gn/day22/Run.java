package com.gn.day22;

public class Run {

	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		s1.solution02(15);
//		s1.solution(15);
//		s1.solution(40);
		
		Solution02 s2 = new Solution02();
		int[][] arr1 = {{1, 4}, 
		                {9, 2}, 
		                {3, 8}, 
		                {11, 6}};
		System.out.println("arr1");
		System.out.println(s2.solution(arr1));
		int[][] arr2 = {{3, 5}, 
		                {4, 1}, 
		                {2, 4}, 
		                {5, 10}};
		System.out.println("arr2222222222");
		System.out.println(s2.solution(arr2));
		
	}

}
