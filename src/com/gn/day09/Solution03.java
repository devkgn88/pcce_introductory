package com.gn.day09;

import java.util.HashMap;
import java.util.Map;

// 가위 바위 보
// rock, paper, scissors
public class Solution03 {
	// 가위는 2 바위는 0 보는 5로 표현합니다.
	// 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때
	// rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return 하도록 solution 함수를 완성해보세요.
	
	// Scissors are expressed as 2, rocks are expressed as 0, and paper is expressed as 5.
	// When a string rsp representing the order of rock-paper-scissors is given as a parameter.
	// Complete the solution function to return a string representing the cases 
	// in which all rock, paper, scissors saved in rsp are won, in order.
	
	
	// case 1 : 0.18ms -> 0.22ms
	// case 2 : 0.14ms -> 0.17ms
	// case 3 : 0.12ms -> 0.13ms
	// case 4 : 0.12ms -> 0.12ms
	// case 5 : 0.13ms -> 0.15ms
	// case 6 : 0.13ms -> 0.13ms
	// case 7 : 0.37ms -> 0.76ms
	public String solution01(String rsp) {
		StringBuilder sb = new StringBuilder();
		
		for(String r : rsp.split("")) {
			int num = Integer.parseInt(r);
			switch(num) {
            	case 2 : sb.append(0); break;
            	case 0 : sb.append(5); break;
            	case 5 : sb.append(2); break;
			}
		}
		
		return sb.toString();
	}
	// 가위(scissors) : 2 -> 바위(rock) : 0
	// 바위(rock) : 0 -> 보(paper) : 5
	// 보(paper) : 5 -> 가위(scissors) : 2

	
	public String solution(String rsp) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < rsp.length() ; i++) {
			System.out.println(rsp.charAt(i));
			switch(rsp.charAt(i)) {
        		case '2' : sb.append('0'); break;
        		case '0' : sb.append('5'); break;
        		case '5' : sb.append('2'); break;
			}
		}
				
		return sb.toString();
	}
	
	public String solution02(String rsp) {
		StringBuilder sb = new StringBuilder();
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(2, 0);
		map.put(0, 5);
		
		map.put(5, 2);
		for(String r : rsp.split("")) {
			int num = Integer.parseInt(r);
			sb.append(map.get(num));
		}
		return sb.toString();
	}

}
