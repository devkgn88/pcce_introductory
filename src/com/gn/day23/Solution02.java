package com.gn.day23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution02 {
	// We want to measure sudent's rank
	// based on the average of their English and Math scores
	// When given a two-dimensional integer array "score"
	// containing English and Math scores
	// Complete the solution function to return an array
	// containing ranks based on the average of English and Math scores
	
    public int[] solution01(int[][] score) {
        int[] answer = new int[score.length];
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < score.length ; i++) {
        	int english = score[i][0];
        	int math = score[i][1];
        	int avg = (english+math)/2;
        	map.put(avg, i);
        	answer[i] = avg;
        }
        
        for(int i = 0 ; i < answer.length-1 ; i++) {
        	for(int j = i+1 ; j < answer.length ; j++) {
        		if(answer[i]>answer[j]) {
        			int temp = answer[i];
        			answer[i] = answer[j];
        			answer[j] = temp;
        		}
        	}
        }
        
        int num = 1;
        for(int i = 0 ; i < answer.length ; i++) {
        	
        }

        
        return answer;
    }
    
    public int[] solution02(int[][] score) {
    	List<Integer> select = new ArrayList<Integer>();
    	List<Integer> update = new ArrayList<Integer>();
    	
    	int[] answer = new int[score.length];

//    	int[] select = new int[score.length];
//    	int[] update = new int[score.length];
//    	int[] answer = new int[score.length];
    	
    	
    	for(int i = 0 ; i < score.length ; i++) {
        	int avg = (score[i][0]+score[i][1])/2;
        	select.add(avg);
        	if(!update.contains(avg)) update.add(avg);
        }
    	
    	Collections.sort(update,Collections.reverseOrder());
//    	System.out.println("select : "+select);
//    	System.out.println("update : "+update);
    	
    	int num = 1;
    	int cnt = -1;
    	
    	for(int i = 0 ; i < update.size() ; i++) {
    		for(int j = 0 ; j < select.size(); j++) {
    			if(update.get(i) == select.get(j)) {
    				
    				answer[j] = cnt != select.get(j) ? num : num-1;
    				cnt = select.get(j);
    				num++; 
    			}
    			
    		}
    	}
    	
    	
//    	for(int i = 0 ; i < select.size() ; i++) {
//    		for(int j = 0 ; j < update.size(); j++) {
//    			if(select.get(i) == update.get(j)) {
//    				answer[i] = ;
//    			}
//    		}
//    	}
    	
    	System.out.println("result == ");
    	for(int i : answer) {
    		System.out.println(i);
    	}
    	
//    	for(int i = 0 ; i < update.length-1 ; i++) {
//        	for(int j = i+1 ; j < update.length ; j++) {
//        		if(update[i]< update[j]) {
//        			int temp = update[i];
//        			update[i] = update[j];
//        			update[j] = temp;
//        		}
//        	}
//    	}
    	
//    	int num = 1;
//    	
//    	for(int i = 0 ; i < update.length ; i++) {
//    		for(int j = 0 ; j < select.length ; j++) {
//    			if(update[i] == select[j]) {
//    				answer[j] = num;
//    				if( i == 0 || (i !=0 && update[i] != update[i-1])) {
//    					num++;
//    				}
//    				break;
//    			}
//    			System.out.println(num);
//    		}
//    	}
    	
//    	System.out.println("select ==");
//    	for(int i : select) {
//    		System.out.println(i);
//    	}
//    	System.out.println("update==");
//    	for(int i : update) {
//    		System.out.println(i);
//    	}
//    	System.out.println("answer==");
//    	for(int i : answer) {
//    		System.out.println(i);
//    	}
    	
    	return new int[] {};
    }
    
    public int[] solution03(int[][] score) {
    	Set<Integer> set = new HashSet<Integer>();
    	
    	for(int i = 0 ; i < score.length ; i++) {
    		int avg = (score[i][0]+score[i][1])/2;
    		set.add(avg);
    	}
    	
    	List<Integer> list = new ArrayList<Integer>(set);
    	Collections.sort(list,Collections.reverseOrder());
    	
    	int[] arr = new int[score.length];
    	for(int i = 0 ; i < score.length ; i++) {
    		int avg = (score[i][0]+score[i][1])/2;
    		arr[i] = list.indexOf(avg)+1;
    	}
    	
    	for(int i : arr) {
    		System.out.println(i);
    	}
    	
//    	for(int num : list) {
//    		System.out.println(num);
//    	}
    	
//    	for(int i : map.keySet()) {
//    		System.out.println(i+" : "+map.get(i));
//    	}
    	
    	return new int[] {};
    }
    
    public int[] solution04(int[][] score) {
    	int[] answer = new int[score.length];
    	int ranking = 1;
    	for(int i = 0 ; i < score.length ; i++) {
    		for(int j = 0 ; j < score.length ; j++) {
    			if((score[i][0]+score[i][1]) < (score[j][0]+score[j][1])){
                    ranking++;
                } else if((score[i][0]+score[i][1]) == (score[j][0]+score[j][1])){
                    continue;
                } 
    		}
    		answer[i]= ranking;
    		ranking =1;
    	}
    	for(int i : answer) {
    		System.out.println(i);
    	}
    	return answer;
    }
    
    public int[] solution05(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
    }
    
    
}
