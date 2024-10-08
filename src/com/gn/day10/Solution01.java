package com.gn.day10;

// 점의 위치 구하기
// find the location of a point
public class Solution01 {
	// 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 
	// 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
	// 우측상단 : 1, 좌측상단 : 2, 좌측하단 : 3, 우측하단 : 4
	// x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
	// x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
	// x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
	// x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
	// x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 
	// 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
	
	// A quadrant is a plane divided into four parts based on the x and y axes. 
	// The quadrants are numbered 1 through 4 as shown below.
	// right-top : 1, left-top : 2, left-bottom : 3, right-bottom : 4
	// If both the x and y coordinates are positive, it is in the first quadrant.
	// If the x-coordinate is negative and the y-coordinate is positive, it belongs to the second quadrant.
	// If both the x and y coordinates are negative, it is in the third quadrant.
	// If the x-coordinate is positive and the y-coordinate is negative, it belongs to the fourth quadrant.
	// An integer array dot containing the x coordinates (x, y) in order is given as a parameter. 
	// Please complete the solution function to return one of 1, 2, 3, or 4 to indicate which quadrant the coordinate dot belongs to.
	
	public int solution01(int[] dot) {
		int answer = 0;
		int x = dot[0];
		int y = dot[1];
		if(x > 0 && y > 0) answer = 1; 
		else if(x < 0 && y > 0) answer = 2;
		else if(x < 0 && y < 0) answer = 3;
		else if(x > 0 && y < 0) answer = 4;
		return answer;
	}
	
	public int solution02(int[] dot) {
		int answer = 0;
		if(dot[0] > 0) {
			if(dot[1] > 0) answer = 1;
			else answer = 4;
		} else {
			if(dot[1] > 0) answer = 2;
			else answer = 3;
		}
		return answer;
	}
	
}
