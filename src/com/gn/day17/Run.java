package com.gn.day17;

public class Run {

	public static void main(String[] args) {
		Solution02 s2 = new Solution02();
		System.out.println(s2.solution02(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12}));
		
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution02(930211));
		System.out.println(s3.solution02(1234));
		
		Solution04 s4 = new Solution04();
		String[] result = s4.solution(new String[] {"3 - 4 = -3","19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
		for(String s : result) {
			System.out.println(s);
		}
	
	}

}
