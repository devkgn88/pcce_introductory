package com.gn.day18;

public class Solution03 {
	// It is said that some bacteria multiply twice in one hour
	// When the initial number of bacteria n 
	// and the elapsed time t are given as parameters,
	// complete the solution function so that 
	// it returns the number of bacteria after t time.
	
	// Rather than constructing an algorithm
	// using techniques that are not often use in practice,
	// I think it is better to use techniques
	// that are often used on a daily basis
	// even if the code may seem long and not cool
	public int solution01(int n, int t) {
		int answer = n; 
		for(int i = 0 ; i < t ; i++) {
			answer *= 2;
		}
		return answer;
	}
	
    public int solution02(int n, int t) {
        double target = Math.pow(2, t);
        return (int)(n*target);
    }
    
    
}
