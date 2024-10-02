package com.gn.day09;

import java.util.*;

// morse code

public class Solution02 {
	
	public String solution02(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");   
        for(String alphabet : word) {
        	for(int i = 0 ; i < morse.length ; i++) {
        		if(alphabet.equals(morse[i])) {
        			sb.append((char)(i+97));
        		}
        	}
        }    
        return sb.toString();
	}
	
	
    public String solution01(String letter) {
        StringBuilder sb = new StringBuilder();
        
        Map<String,String> map = new HashMap<String,String>();
        map.put(".-","a");
        map.put("-...","b");
        map.put("-.-.","c");
        map.put("-..","d");
        map.put(".","e");
        map.put("..-.","f");
        map.put("--.","g");
        map.put("....","h");
        map.put("..","i");
        map.put(".---","j");
        map.put("-.-","k");
        map.put(".-..","l");
        map.put("--","m");
        map.put("-.","n");
        map.put("---","o");
        map.put(".--.","p");
        map.put("--.-","q");
        map.put(".-.","r");
        map.put("...","s");
        map.put("-","t");
        map.put("..-","u");
        map.put("...-","v");
        map.put(".--","w");
        map.put("-..-","x");
        map.put("-.--","y");
        map.put("--..","z");
        
        String[] arr = letter.split(" ");
        for(String s : arr){
            if(map.containsKey(s)){
                sb.append(map.get(s));
            }
        }
        return sb.toString();
    }
}
