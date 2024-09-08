package com.gn.day07;

public class Solution02 {
	// Angles exceeding 0 degrees and 90 degrees are classified as acute angles
	// 90 degrees are considered right angles
	// and angles exceeding 90 degrees excluding 180 degrees are classified as straight angles
	// Please complete when giving your solution to return 1 for an acute angle
	// 2 for a right angle
	// 3 for an obtuse angle
	// and 4 for a straight angle when each is individually varied
	public int solution01(int angle) {
		int answer = 0;
		if(angle <= 90){
			if(angle == 90) answer = 2;
			else answer = 1;
		}else{
			if(angle == 180) answer = 4;
			else answer=3;
		}
		return answer;
	}
	
	public int solution02(int angle) {
		int answer = 0;
		if(angle < 90) answer = 1;
		else if(angle == 90) answer = 2;
		else if(angle < 180) answer = 3;
		else answer = 4;

		return answer;
	}


}
