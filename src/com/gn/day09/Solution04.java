package com.gn.day09;

import java.math.BigInteger;

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

	// 3 * (3-1) / 2 = 3
	// 5 * (5-1) * (5-2) / (3 * (3-1))
	// 공이 5개 있는데 4개씩 묶을 수 있는 케이스는?
	// 1 2 3 4 5 
	// -> 1 2 3 4 
	// -> 1 2 3 5
	// -> 2 3 4 5 
	// -> 3 4 5 1 
	// -> 4 5 1 2 
	// 5 * (5-1) * (5-2) * (5-3) / (4 * 4-1 * 4-2 * 4-3))
	
    public int solution_wrong(int balls, int share) {
    	long num = 1;
    	long den = 1;
        for(int i = 0 ; i < share ; i++) {
        	num *= balls-i;
        	den *= share-i;
        }
        return (int)(num/den);
    }
    
    public int solution_correct(int balls, int share) {
    	long answer = 1;
        for(int i = 0 ; i < share ; i++) {
        	answer *= balls-i;
        	answer /= i+1;
        }
        return (int)answer;
    }
	
	public int solution01(int n, int m) {
		long answer = 1;
		for(int i = 1 ; i <= m ; i++){
		answer *= (n-i+1);
		answer /= i;
		}
		System.out.println(answer);
		return (int)answer;
	}
	
    public BigInteger solution02(int balls, int share){
        return fac(balls).divide(fac(balls-share).multiply(fac(share)));
    }
    
    public BigInteger fac(int num){
        BigInteger ret = new BigInteger("1");
        BigInteger from = new BigInteger("1");
        BigInteger to = new BigInteger(String.valueOf(num));
        for(BigInteger i = from ; i.compareTo(to) <= 0 ; i= i.add(BigInteger.ONE)){
            ret = ret.multiply(i);
        }
        return ret;
    }
}
