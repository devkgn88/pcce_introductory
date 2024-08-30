package com.gn.day21;

public class Solution04 {
	public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String word : dic) {
        	int leng = spell.length; 
        	int cnt = 0; 
        	for(String alphabet : spell) {
        		if(word.indexOf(alphabet) != -1) cnt++;
        	}
        	if(cnt == leng) {
        		answer = 1;
        	}
        }
        
        return answer;
    }
}
