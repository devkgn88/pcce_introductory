package com.gn.day08;
// Age of exoplanets
public class Solution02 {
	// While traveling in space, I had an engine failure
	// and had to make an emergency landing on planet PROGRAMMERS-962.
	// I must state my age at immigration,
	// but on planet PROGRAMMERS-962, your age is expressed alphabetically.
	// a is 0, b is 1, c is 2, ..., j is 9.
	// For example, 23 years old is expressed as cd, and 51 years old is expressed as fb.
	// When age is given as a parameter, complete the solution function to return the PROGRAMMER-962 age.
    public String solution01(int age) {    
        String answer = "";
        String[] arr = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        while(age > 0){
            answer = arr[age%10] + answer;
            age /= 10;
        }
        return answer;
    }
    
    public String solution02(int age) {
         String answer = "";
         String str = Integer.toString(age);
         String[] arr = str.split("");
         for(String s : arr){
             int num = Integer.parseInt(s)+97;
             answer += (char)num;
         }
         return answer;
    }
	
}
