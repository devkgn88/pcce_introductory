package com.gn.day20;

public class Solution04 {
	// A group of sums of more than one term is called a polynomial
	// When calculating a polynomial,
	// calculate and organize like terms
	// When a polynomial consisting of addition is given as a parameter
	// complete the solution function to 
	// return the result of adding like terms as a string
	// 같은 식이라면 가장 짧은 수식을 return 합니다.
    public String solution01(String polynomial) {
        String answer = "";
        // System.out.println(polynomial);
        String[] arr = polynomial.split(" ");
        int con = 0;
        int var = 0;
        for(String str : arr) {
        	if(str.contains("x")) {
        		// 변수
        		int varNum = 1;
        		String varRep = str.replace("x", "");
        		if(!varRep.equals("")) {
        			varNum = Integer.parseInt(varRep);
        		}
        		var += varNum;
        	} else if(!str.equals("+")){
        		// 상수
        		con += Integer.parseInt(str);
        	}
        }
        if(var != 0) {
        	answer += (var== 1? "" : var)+"x";
        }
        if(var != 0 && con != 0 ) {
        	answer += " + ";
        }
        if(con != 0) {
        	answer += con;
        }
        System.out.println(answer);
        return answer;
    }
}
