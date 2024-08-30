package com.gn.day21;

public class Run {
	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		s1.solution02("aAb1B2cC34oOp"); // 1 + 2 + 34
//		s1.solution02("1a2b3c4d123Z"); // 1 + 2 + 3 + 4 + 123
//		
//		Solution02 s2 = new Solution02();
//		int[][] arr1 = {{0, 0, 0, 0, 0}, 
//						{0, 0, 0, 0, 0}, 
//						{0, 0, 0, 0, 0}, 
//						{0, 0, 1, 0, 0}, 
//						{0, 0, 0, 0, 0}}; 
//		s2.solution(arr1);
//		int[][] arr2 = {{0, 0, 0, 0, 0}, 
//		                {0, 0, 0, 0, 0}, 
//		                {0, 0, 0, 0, 0}, 
//		                {0, 0, 1, 1, 0}, 
//		                {0, 0, 0, 0, 0}};
//		s2.solution(arr2);
//		int[][] arr3 = {{1, 1, 1, 1, 1, 1}, 
//		                {1, 1, 1, 1, 1, 1}, 
//		                {1, 1, 1, 1, 1, 1}, 
//		                {1, 1, 1, 1, 1, 1}, 
//		                {1, 1, 1, 1, 1, 1}, 
//		                {1, 1, 1, 1, 1, 1}};
//		s2.solution(arr3);
		
//		Solution03 s3 = new Solution03();
//		System.out.println("===== 1,2 ====");
//		s3.solution01(new int[] {1,2});
//		System.out.println("===== 3,6 =====");
//		s3.solution02(new int[] {3,6});
//		System.out.println("===== 11,7 =====");
//		s3.solution02(new int[] {11,7});
		
		Solution04 s4 = new Solution04();
		String[] spell1 = {"p", "o", "s"};
		String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
		System.out.println(s4.solution(spell1, dic1));
		
		String[] spell2 = {"z", "d", "x"};
		String[] dic2 = {"def", "dww", "dzx", "loveaw"};
		System.out.println(s4.solution(spell2, dic2));
		
		String[] spell3 = {"s", "o", "m", "d"};
		String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
		System.out.println(s4.solution(spell3, dic3));
		
	}
}
