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
		
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution01(3, 4));
		System.out.println(s3.solution02(27, 19));
		
		Solution04 s4 = new Solution04();
		System.out.println(s4.solution01(10, 5));
		System.out.println(s4.solution02(7, 2));
	}
}
