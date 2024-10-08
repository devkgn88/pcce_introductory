package com.gn.day02;

public class Run {

	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution01(3, 2));
		System.out.println(s1.solution02(3, 2));
		System.out.println(s1.solution02(7, 3));
	
		Solution03 s3 = new Solution03();
		int[] arr = s3.solution03(1, 2, 3, 4);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		Solution04 s4 = new Solution04();
		int[] numbers = {1,2,3,4,5};
		int[] result = s4.solution01(numbers);
		for(int r : result) {
			System.out.println(r);
		}
	}

}
