package com.gn.day01;

public class Run {
	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		
		s1.solution01(2, 3);
		s1.solution01(100,2);
		
		s1.solution02(2, 3);
		s1.solution02(100,2);
		
		Solution02 s2 = new Solution02();
		
		System.out.println(s2.solution01(2, 3));
		System.out.println(s2.solution01(100,2));
	}
}
