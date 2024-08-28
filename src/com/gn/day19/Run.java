package com.gn.day19;

public class Run {

	public static void main(String[] args) {
		Solution02 s2 = new Solution02();
		System.out.println("===== 1번 =====");
//		String[] arr1 = s2.solution01("abc1Addfggg4556b", 6);
//		for(String s : arr1) {
//			System.out.println(s);
//		}
		s2.solution03("abc1Addfggg4556b", 6);
		System.out.println("===== 2번 =====");
//		String[] arr2 = s2.solution01("abcdef123", 3);
//		for(String s : arr2) {
//			System.out.println(s);
//		}
		s2.solution03("abcdef123", 3);
		
		Solution03 s3 = new Solution03();
		s3.solution01(new int[] {1,1,2,3,4,5}, 1);
		s3.solution02(new int[]{0,2,3,4},1);
		
		Solution04 s4 = new Solution04();
		System.out.println(s4.solution01(new int[] {149, 180, 192, 170}, 167));;
		System.out.println(s4.solution01(new int[] {180, 120, 140}, 190));;
		
	}

}
