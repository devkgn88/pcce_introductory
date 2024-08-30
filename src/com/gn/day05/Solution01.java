package com.gn.day05;

public class Solution01 {
	public int solution01(int price) {
		double answer = 0; 
		if(0 < price && price < 100000){
			answer = price;
		} else if(100000 <= price && price < 300000){
			answer = price * 0.95;
		} else if(300000 <= price && price < 500000){
			answer = price * 0.9;
		} else if(500000 <= price){
			answer = price * 0.8;
		}
		return (int)answer;
	}
	
	public int solution02(int price) {
		double answer = 0; 
		if(price >= 500000){
			answer = price * 0.8;
		} else if(price >= 300000){
			answer = price * 0.9;
		} else if(price >= 100000){
			answer = price * 0.95;
		} else{
			answer = price;
		}
		return (int)answer;
	}


}
