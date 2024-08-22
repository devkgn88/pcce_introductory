package com.gn.day15;

public class Run {

	public static void main(String[] args) {
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution01("abcabcadc"));
		System.out.println(s3.solution01("abdc"));
		System.out.println(s3.solution01("hello"));
		
		System.out.println(s3.solution02("abcabcadc"));
		System.out.println(s3.solution02("abdc"));
		System.out.println(s3.solution02("hello"));
		
		Solution04 s4 = new Solution04();
		s4.solution02(24);
		s4.solution02(29);
		
	}

}
