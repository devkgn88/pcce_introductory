package com.gn.day23;

public class Solution03 {
	// I am taking care of my nephew who is 6 months old after born.
	// My nephew can only pronounce the four sounds
	// "aya", "ye", "woo", and "ma" using them at most once
	// When the string array "babbling" is given as a parameter,
	// complete the solution function
	// so that it returns the number of words
	// that the babbling nephew can pronounce
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling) {
        	String change = str.replaceAll("aya|ye|woo|ma", "");
        	if(change.length() == 0) answer++;
        }
        return answer;
    }
}
