package com.gn.day09;

// 구슬을 나누는 경우의 수
// Number of ways to divide beads
public class Solution04 {
	// 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 
	// 구슬은 모두 다르게 생겼습니다. 
	// 머쓱이가 갖고 있는 구슬의 개수 balls와 
	// 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
	// balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 
	// return 하는 solution 함수를 완성해주세요.

	// I'm planning to share the beads with my friends. 
	// The beads all look different. 
	// When balls, the number of marbles the mage has, 
	// and share, the number of marbles to share among the balls, 
	// are given as parameters, complete the solution function 
	// that returns the number of all possible cases of selecting the share number of marbles among the balls.

	public int solution(int n, int m) {
		long answer = 1;
		for(int i = 1 ; i <= m ; i++){
		answer *= (n-i+1);
		answer /= i;
		}
		return (int)answer;
	}
}
