package com.gn.day23;

public class Solution01 {
	// Time difference
	// case 1 : 0.29 -> 0.27
	// case 2 : 0.68 -> 0.11
	// case 3 : 0.28 -> 0.11
	// case 4 : 0.23 -> 0.12
	// case 5 : 0.04 -> 0.02
	// case 6 : 0.04 -> 0.02
	// case 7 : 0.01 -> 0.02
	
    public int[] solution01(int[] numlist, int n) {
    	//  We want to sort the numbers closest to n based on the integer n.
    	// At this time, if the distance from n is the same
    	// place the larger number first
    	// Given an array of integers, numlist, and an integer n,
    	// complete the solution function so that it returns an array
    	// that sorts the elements of numlist in order of proximity to n.
        for(int i = 0 ; i < numlist.length-1 ; i++) {
        	for(int j = i+1 ; j < numlist.length ; j++) {
        		//System.out.println("i와 "+i+"j : "+j);
        		if((Math.abs(numlist[i]-n) > Math.abs(numlist[j]-n)) ||
        				((Math.abs(numlist[i]-n) == Math.abs(numlist[j]-n)) && (numlist[i] < numlist[j]))) {
    				int temp = numlist[i];
    				numlist[i] = numlist[j];
    				numlist[j] = temp;	
    				
        		}
        	}
        }
        return numlist;
    }
    
    public int[] solution02(int[] numlist, int n) {
    	for(int i = 0 ; i < numlist.length -1 ; i++) {
    		for(int j = i+1 ; j < numlist.length ; j++) {
    			int a = (numlist[i] - n) * (numlist[i] > n ? 1 : -1); 
    			int b = (numlist[j] - n) * (numlist[j] > n ? 1 : -1);
    			if(a > b || (a == b && numlist[i] < numlist[j])) {
    				int temp = numlist[i];
    				numlist[i] = numlist[j];
    				numlist[j] = temp;	
    			}
    		}
    	}
//    	for(int i = 0 ; i < numlist.length ; i++) {
//    		System.out.println(numlist[i]);
//    	}
    	return numlist;
    }
}
