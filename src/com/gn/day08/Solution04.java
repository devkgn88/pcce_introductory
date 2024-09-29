package com.gn.day08;

public class Solution04 {
	// 순서쌍의 개수
	// number of ordered pairs
	// 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 
	// An ordered pair is a pair of two numbers arranged in a certain order, denoted as (a, b).
	// 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
	// When a natural number n is given as a parameter, complete the solution function so that 
	// it returns the number of ordered pairs of natural numbers where the product of two numbers is n.
	
	// test
	// case 1 : 0.04ms -> 0.02ms
	// case 2 : 0.02ms -> 0.02ms
	// case 3 : 1.21ms -> 0.03ms
	// case 4 : 0.01ms -> 0.02ms
	// case 5 : 1.58ms -> 0.02ms
	// case 6 : 8.09ms -> 0.05ms
	// case 7 : 0.02ms -> 0.02ms
	// case 8 : 0.02ms -> 0.03ms
	// case 9 : 4.77ms -> 0.05ms
	// case 10 : 4.40ms -> 0.06ms
	
	public int solution01(int n) {
		int answer = 0;
		for(int i = 1 ; i <= n ; i++) {
			if(n%i == 0) answer++;
		}
		return answer;
	}
	
	
	public int solution02(int n) {
        int answer = 0;
        for(int i = 1; i* i <= n ; i++) {
        	if(i*i == n) answer++;
        	else if(n % i == 0) answer +=2;
        }
        return answer;
    }
	
}
