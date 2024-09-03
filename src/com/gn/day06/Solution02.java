package com.gn.day06;

import java.util.Scanner;

public class Solution02 {
	
	// When the height and width of "*" were set to 1
	// We attempted to triangulate "*" into a right angle isosceles
	// If you have a large enough integer n
	// you can write code that 
	// makes a right isosceles of height and size n into a fraction
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i = 1 ; i <= n ; i++){
//			for(int j = 1 ; j <= i ;j++){
//				System.out.print("*"); 
//			}
//			System.out.println("");
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n ; i++){
			System.out.println("나비".repeat(i)); 
		}
	}


}
