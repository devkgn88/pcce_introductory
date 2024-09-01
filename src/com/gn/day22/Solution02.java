package com.gn.day22;

public class Solution02 {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int x1 = dots[0][0]; int y1 = dots[0][1];
        int x2 = dots[1][0]; int y2 = dots[1][1];
        int x3 = dots[2][0]; int y3 = dots[2][1];
        int x4 = dots[3][0]; int y4 = dots[3][1];
        
        if(Math.abs(x1 - x2) == Math.abs(x3-x4)
        	&& Math.abs(y1-y2) == Math.abs(y3-y4)) {
        	double xa = x1 < x2 ? x2-x1 : x1-x2;
        	double xb = x3 < x4 ? x4-x3 : x3-x4;
        	double ya = y1 < y2 ? y2-y1 : y1-y2;
        	double yb = y3 < y4 ? y4-y3 : y3-y4;
        	System.out.println("==== 1 =====");
        	System.out.println(ya/xa);
        	System.out.println(yb/xb);
        	if(ya / xa == yb / xb) answer = 1;
        	
        }
        if(Math.abs(x1-x3) == Math.abs(x2-x4)
        	&& Math.abs(y1-y3) == Math.abs(y2-y4)) {
        	double xa = x1 < x3 ? x3-x1 : x1-x3;
        	double xb = x2 < x4 ? x4-x2 : x2-x4;
        	double ya = y1 < y3 ? y3-y1 : y1-y3;
        	double yb = y2 < y4 ? y4-y2 : y2-y4;
        	System.out.println("==== 2 ====");
        	System.out.println(ya/xa);
        	System.out.println(yb/xb);
        	if(ya / xa == yb / xb) answer = 1;
        	
        }
        if(Math.abs(x1-x4) == Math.abs(x2-x3)
        	&& Math.abs(y1-y4) == Math.abs(y2-y3)) {
        	double xa = x1 < x4 ? x4-x1 : x1-x4;
        	double xb = x2 < x3 ? x3-x2 : x2-x3;
        	double ya = y1 < y4 ? y4-y1 : y1-y4;
        	double yb = y2 < y3 ? y3-y2 : y2-y3;
        	System.out.println("==== 3 ====");
        	System.out.println(ya/xa);
        	System.out.println(yb/xb);
        	if(ya / xa == yb / xb) answer = 1;
        }

        return answer;
    }
}
