package com.gn.day03;

import java.util.Arrays;

public class Solution02 {
	// The central value refers to 
	// the value located at the center
	// when the values of a certain value are
	// selected in order of size
	// For example the median of 1,2,7, 10, and 11 is 7
	// When an integer array is given as a parameter
	// complete the solution function to return the median value
public int solution01(int[] array) {
	for(int i = 0 ; i < array.length ; i++){
		for(int j = 0 ; j < array.length ; j++){
			if(array[i] > array[j]){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
	return array[array.length / 2];
}
	
public int solution02(int[] array) {
	Arrays.sort(array);
	return array[array.length/2];
}


}
