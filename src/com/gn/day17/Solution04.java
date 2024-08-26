package com.gn.day17;

public class Solution04 {
    public String[] solution01(String[] quiz) {
    	String[] answer = new String[quiz.length];
    	
    	for(int i = 0 ; i < quiz.length ; i++) {
    		String quiz_str = quiz[i];
    		String[] str_arr = quiz_str.split(" = ");
    		int str_result = Integer.parseInt(str_arr[1]);
    		String formula = str_arr[0];
    		
    		// calculating formula
    		int oper = 1;
    		int formula_result = 0;
    		for(String f : formula.split(" ")) {
    			if("+".equals(f) || "-".equals(f)) {
    				oper = "+".equals(f) ? 1 : -1;
    			} else {
    				formula_result += Integer.parseInt(f)*oper;
    			}
    		}
    		String answer_str = "X";
    		if(str_result == formula_result) {
    			answer_str = "O";
    		}
    		answer[i] = answer_str;
    	}
    	
    	return answer;
    }
    
    
    public String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            int result = Integer.parseInt(arr[0]) + ( Integer.parseInt(arr[2]) * (arr[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(arr[4])? "O": "X";
        }
        return quiz;
    }

}
