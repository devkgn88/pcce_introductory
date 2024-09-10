package com.gn.day23;

public class Run {
	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		System.out.println("=== 1번 ===");
//		s1.solution02(new int[]{1,2,3,4,5,6}, 4);
//		System.out.println("=== 2번 ===");
//		s1.solution02(new int[]{10000,20,36,47,40,6,10,7000}, 30);
		
//		Solution02 s2 = new Solution02();
//		System.out.println("===1번===");
//		s2.solution02(new int[][] {{80,70},{90,50},{40,70},{50,80}});
//		System.out.println("===2번===");
//		s2.solution02(new int[][] {{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}});
		
		Solution03 s3 = new Solution03();
		System.out.println("===1===");
		System.out.println(s3.solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"}));
		System.out.println("===2===");
		System.out.println(s3.solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
		
	}
}
