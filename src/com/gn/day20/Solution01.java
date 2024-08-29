package com.gn.day20;

public class Solution01 {
	// There is a rectangle in a rectangle in a two-dimensional coordinate plane
	// whose sides are parallel to the axis
	// When an array dots containing 
	// the coordinates of the four verices of a rectangle
	// [[x1, y1], [x2, y2], [x3, y3], [x4, y4]] is given as a parameter,
	// the solution function returns the area of ​​the rectangle.
	
	public int solution(int[][] dots) {
        int answer = 0;
    	int x1 = dots[0][0];
    	int x2 = dots[1][0];
    	
    	int y1 = dots[0][1];
    	int y2 = dots[1][1];
    	
    	for(int i = 1 ; i <= 3 ; i++) {
    		if(x1 != x2 && y1 != y2) {
    			break;
    		} else {
    			if(dots[i][0] != x1) {
    				x2 = dots[i][0];
    			}
    			if(dots[i][1] != y1) {
    				y2 = dots[i][1];
    			}
    		}
    		
    	}
    	answer = (x2-x1)*(y2-y1);
    	//System.out.println(answer);

        return answer < 0 ? -answer : answer;
    }
}
