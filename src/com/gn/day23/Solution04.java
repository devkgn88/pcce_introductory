package com.gn.day23;

public class Solution04 {
	// I'm trying to log in to a program.
	// When given an array id_pw containing the ID and PW of mine
	// and a two-dimensional array db containing member information
	// Complete the solution function to return a message
	// according to login success or failure as follows
	// If there is member information that matches both ID and PW,
	// "login" is returned
	// When login fails,"fail" is returned
	// if there is no member with a matching ID
	// and "wrong pw" is returned if there is no member with a matching ID but password
	
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int i = 0 ; i < db.length ; i++) {
        	if(db[i][0].equals(id_pw[0])) {
        		if(db[i][1].equals(id_pw[1])) {
        			answer="login";
        		} else {
        			answer="wrong pw";
        		}
        	}
        }
        System.out.println(answer);
        return answer;
    }
}
