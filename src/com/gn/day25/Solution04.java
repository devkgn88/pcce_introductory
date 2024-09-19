package com.gn.day25;

public class Solution04 {

	// When an arithmetic sequence 
	// or a geometric sequence common is given as a parameter, 
	// complete the solution function 
	// to return the number that comes after the last element.
	public int solution(int[] common) {
        int answer = 0;
//        int[] arr = new int[common.length-1];
//        for(int i = 1 ; i < common.length ; i++) {
//        	arr[i-1] = common[i] - common[i-1];
//        }
//        for(int i : arr) {
//        	System.out.println(i);
//        }
        int len = common.length;
//        answer = common[len-1]+(common[len-1]-common[len-2])*(common[len-1] / common[len-2]);
//        System.out.println(answer);
        
        
        
        if(common[len-1]-common[len-2] == common[len-2]-common[len-3]) {
        	return common[len-1]+(common[len-1]-common[len-2]);
        } else {
        	return common[len-1] * (common[len-1]-common[len-2]) / (common[len-2]-common[len-3]);
        }
    }
}
