package com.gn.day21;

public class Solution02 {
    public int solution(int[][] board) {
        int answer = 0;
        
        // deep copy
        int[][] arr = new int[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++) {
        	for(int j = 0 ; j<board[i].length ;j++) {
        		arr[i][j] = board[i][j];
        	}
        }
        
        for(int i = 0 ; i < board.length ; i++) {
        	for(int j = 0 ; j < board[0].length ; j++) {
        		if(board[i][j] == 1) {
        			
        			if(j-1 >= 0) arr[i][j-1] = 1;
        			if(j+1 <= board[i].length-1) arr[i][j+1] = 1;
        			
        			if(i-1 >= 0) {
        				arr[i-1][j] = 1;
        				if(j-1 >= 0) arr[i-1][j-1] = 1;
        				if(j+1 <= board[i-1].length-1) arr[i-1][j+1] = 1;
        			}
        			if(i+1 <= board.length-1) {
        				arr[i+1][j] = 1;
        				if(j-1 >= 0) arr[i+1][j-1] = 1;
        				if(j+1 <= board[i+1].length-1) arr[i+1][j+1] = 1;
        			}
        		}
        	}
        }
        
        for(int i = 0 ; i < arr.length ; i++) {
        	for(int j = 0 ; j < arr[i].length ;j++) {
        		if(arr[i][j] == 0) answer++;
        	}
        }
        
        return answer;
    }
}
