package com.gn.day20;

public class Solution02 {
	// I'm playing a RPG game
	// There are up, down, left, and right direction keys in the game
	// and pressing each key moves one space up, down, left, or right
	// For example, if you press up at [0,0]
	// the character's coordinates are [0,1]
	// if you press down, it would be [0,-1]
	// press left, [-1,0], and right [1,0]
	// The array keyinput of the direction keys I entered
	// and the map size board are given as parameters
	// If the character always starts at [0,0]
	// after all key inputs are completed,
	// complete the solution function to return the character's coordinated[x,y]
	public int calcPoint(int num, int sign, int stan) {
		if(Math.abs(num+sign) > stan/2) {
			return num;
		} else {
			return num+sign;
		}
	}
	
	public int[] solution01(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String s : keyinput) {
        	switch(s) {
        		case "up" : answer[1] = calcPoint(answer[1],1,board[1]);break;
        		case "down" : answer[1] = calcPoint(answer[1],-1,board[1]);break;
        		case "right" : answer[0] = calcPoint(answer[0],1,board[0]);break;
        		case "left" : answer[0] = calcPoint(answer[0],-1,board[0]);break;
        	}
        }
        return answer;
    }
	
    public int[] solution02(String[] keyinput, int[] board) {
        int[] answer = {0 ,0};
       int width = board[0]/2;
       int height = board[1]/2;
       for(String input: keyinput) {
           if(input.equals("up") &&  answer[1] < height) {
               answer[1]++;
           } else if (input.equals("down") && answer[1] > -height) {
               answer[1]--;
           }else if (input.equals("left") && answer[0] > -width) {
               answer[0]--;
           }else if (input.equals("right") && answer[0] < width) {
               answer[0]++;
           }
       }
       return answer;
   }
	
}
