package com.gn.day25;

public class Solution02 {
	// I'm trying to cut a large piece of paper into 1x1 sizes.
	// For example, cutting a 2 x 2 piece of paper into a 1 x 1 piece 
	// requires at least three strokes of the scissors.
	// When integers M and N are classified into various types,
	// Complete the solution function to return 
	// the minimum number of times a piece of paper of size M x N must be scissored.

	public int solution(int M, int N) {
        return (M-1) + M * (N-1);
    }

}
