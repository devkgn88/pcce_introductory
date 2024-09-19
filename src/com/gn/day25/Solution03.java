package com.gn.day25;

public class Solution03 {
    public int[] solution(int num, int total) {
      	int[] answer = new int[num];
      	int a = total;
      	while(true) {
      		if(num * a + (num*(num-1)/2) == total) break;
      		a--;
      	}
      	for(int i = 0 ; i < num ; i++) {
      		answer[i] = a; 
      		a++;
      	}
      	System.out.println(a);
      	
//      	int a = num * x + (num*(num-1)/2);
//      	System.out.println(num*(num-1)/2);
      	
//    	total = a + b + c;
//    	total = c-2 + c -1 + c;
//    	total = c-3 + c -2 + c -1 + c;
//    	-> 4c -(3+2+1)
//      	total = c-4 + c -3 + c -2 + c-1 + c
    	
    	
    	
    	

//    	System.out.println(Math.sqrt(14));
//        for(int i = -total ; i < total-num ; i++) {
//        	answer = new int[num];
//        	int sum = 0;
//        	for(int j = 0 ; j < num ; j++) {
//        		sum += i + j;
//        		answer[j] = i + j;
//        	}
//        	System.out.println(sum);
//        	if(sum == total) break;
//        }
//        for(int i = total ; i > -total + num ; i--) {
//        	answer = new int[num];
//        	int sum = 0;
//        	for(int j = 0 ; j < num ; j++) {
//        		sum += i - j;
//        		answer[j] = i - j;
//        	}
//        	System.out.println(sum);
//        	if(sum == total) break;
//        }
        for(int i : answer) {
        	System.out.println("값 : "+i);
        }
        return answer;
    }
}
