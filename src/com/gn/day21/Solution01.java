package com.gn.day21;

public class Solution01 {
	// my_string is given as a parameter
	// my_string consists only of lowercase letters,
	// uppercase letters, and natural numbers
	// complete the solution function to
	// return the sum of the natural numbers in my_string
    public int solution01(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("");
        String num = "";
        for(String str : arr) {
        	if(str.matches("[+-]?\\d*(\\.\\d+)?")) {
        		num += str;
        	}else {
        		if(!num.equals("")) {
        			answer += Integer.parseInt(num);
        			num= "";
        		}
        	}
        }
        if(!num.equals("")) answer += Integer.parseInt(num);
        return answer;
    }
    
    public int solution02(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        for(String s : str){
            if(!s.equals("")) answer += Integer.parseInt(s);
        }
        return answer;
    }
}
