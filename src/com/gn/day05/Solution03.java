package com.gn.day05;

import java.time.LocalDate;

public class Solution03 {
	// I wondered what year the teacher was born
	// Given the teacher's age as of 2022,
	// please complete the solution method
	// that returns the teacher's year of birth
	
	public int solution01(int age) {
		return 2022 - age +1;
	}
	
	public int solution02(int age) {
		LocalDate today = LocalDate.now();
		return today.getYear() - age +1;
	}


}
