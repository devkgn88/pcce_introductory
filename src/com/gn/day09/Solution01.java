package com.gn.day09;

// 개미군단
// army of ants
public class Solution01 {
	// 개미 군단이 사냥을 나가려고 합니다. 
	// 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다. 
	// 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다. 
	// 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 
	// 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
	// 사냥감의 체력 hp가 매개변수로 주어질 때, 
	// 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 
	// return하도록 solution 함수를 완성해주세요.
	
	// An army of ants is about to go hunting. 
	// The ant army tries to bring out troops that perfectly match the physical strength of the prey.
	// General ants have an attack power of 5, soldier ants have an attack power of 3, 
	// and worker ants have an attack power of 1. 
	// For example, when trying to hunt a katydid with 23 stamina, you can take 23 worker ants with you. 
	// If you take four general ants and one soldier ant with you, you can hunt with fewer troops. 
	// When the prey's stamina hp is given as a parameter, 
	// How many ants are needed to form a minimum army that matches the physical strength of the prey? 
	// Please complete the solution function to return.
	
	// 이 문제에서 핵심은 사용되는 병력의 수를 줄이는 것이므로
	// 병력의 수를 줄이려면 큰 공격력을 가진 장군개미, 병정개미, 일개미 순으로 배치
	// 500원, 100원, 50원, 10원 동전을 가지고 돈을 내고 싶을때도 비슷한 것
	// test
	// case 1 : 0.03ms -> 0.02ms
	// case 2 : 0.02ms -> 0.01ms 
	// case 3 : 0.03ms -> 0.02ms 
	// case 4 : 0.02ms -> 0.03ms 
	// case 5 : 0.03ms -> 0.02ms 
	// case 6 : 0.03ms -> 0.02ms 
	// case 7 : 0.02ms -> 0.02ms 
	
	public int solution01(int hp) {
        int a = hp / 5;
        hp = hp % 5;
        int b = hp / 3;
        int c = hp % 3;      
        return a + b + c;
    }
	
	public int solution02(int hp) {
		int answer = 0;
		int[] powers = {5,3,1};
		for(int power : powers) {
			answer += hp/power;
			hp = hp % power;
		}
		return answer;
    }
}
