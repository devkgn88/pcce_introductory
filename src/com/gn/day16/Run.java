package com.gn.day16;

public class Run {

	public static void main(String[] args) {
		Solution02 s2 = new Solution02();
		int[] arr = {1, 8, 3};
		System.out.println(s2.solution01(arr)[0]);
		
		Solution03 s3 = new Solution03();
		s3.solution01("2 - 6 + 100 + 3");
		s3.solution01("3 + 4");
		
		Solution04 s4 = new Solution04();
		String[] arr1 = {"a", "b", "c"};
		String[] arr2 = {"com", "b", "d", "p", "c"};
//		String[] arr1 = {"n", "omg"};
//		String[] arr2 = {"m", "dot"};
		System.out.println(s4.solution01(arr1, arr2));
	}

}
