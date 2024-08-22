package com.gn.day15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution03 {
	// 문자열 s가 매개변수로 주어집니다.
	// s에서 한번만 등장하는 문자를
	// 사전 순으로 정렬하고, 그 문자열을 return 하도록
	// solution 함수를 완성해보세요. 
	// 한번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
	public String solution01(String s) {
		// 예시(1) : abcabcadc -> d
		// 예시(2) : abdc -> abcd
		// 예시(3) : hello -> eho
		// 실행은 되지만 시간 초과 발생!!
		String answer="";
		
		String[] origin = s.split("");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0 ; i < origin.length ; i++) {
			String now = origin[i];
			if(map.containsKey(now) == false) {
				map.put(now, 1);
			}else {
				int num = map.get(now);
				map.put(now, num+1);
			}
		}
		
		Set<String> keySet = map.keySet();
		Iterator<String> itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = itKey.next();
			if(map.get(key) == 1) {
				answer += key;
			}
		}
		return answer;
	}
	
	
	public String solution02(String str) {
		String answer = "";
        for(String s : str.split("")){
            if(str.length() - str.replace(s,"").length() > 1){
                str = str.replace(s,"");
            }
        }
        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);
        answer = new String(chArr);
        return answer;
	}
}
