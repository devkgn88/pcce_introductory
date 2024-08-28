package com.gn.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 {
	// When the strings my_str and n are given as parameters
	// complete the solution function
	// to return an array that cuts my_str
	// by length n and stores it.
	
	public String[] solution03(String my_str, int n) {
		int leng = my_str.length();
		int num = (leng / n) + (leng %n == 0 ? 0 : 1);
		String[] result = new String[num];
		for(int i = 0 ; i < num ; i++) {
			int start = i*n;
			int end = i*n+n > leng ? leng : i*n +n;
			result[i] = my_str.substring(start,end);
		}
		
		return result;
	}
	
    public String[] solution01(String my_str, int n) {
        String[] arr = my_str.split("");
        
        int leng = arr.length;
        int num = (leng / n) + (leng %n == 0 ? 0 : 1);
        
        String[] result = new String[num];
        
        int cnt = 1 ;
        int idx = 0 ;
        String word = "";
        
        for(int i = 0 ; i < leng ; i++) {
        	word += arr[i];
        	if(cnt == n || i == leng-1) {
        		result[idx++] = word;
        		cnt = 1;
        		word = "";
        	} else {
        		cnt ++;
        	}
        }
        return result;
    }
    
    public List<String> solution02(String my_str, int n) {
    	List<String> arr = new ArrayList<String>(Arrays.asList(my_str.split("")));
    	List<String> result = new ArrayList<String>();
    	String str = "";
    	int cnt = 1;
    	while(arr.size() > 0) {
    		str += arr.get(0);
    		arr.remove(0);
    		if(cnt == n || arr.size() == 0) {
    			result.add(str);
    			str = "";
    			cnt = 1; 
    		}else {
    			cnt++;
    		}
    	}
    	return result;
    }
    
    
}
